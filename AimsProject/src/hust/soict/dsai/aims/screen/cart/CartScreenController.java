package hust.soict.dsai.aims.screen.cart;
import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.screen.store.StoreScreen;
import hust.soict.dsai.aims.screen.updateStore.AddBookToStoreScreen;
import hust.soict.dsai.aims.screen.updateStore.AddCompactDiscToStoreScreen;
import hust.soict.dsai.aims.screen.updateStore.AddDigitalVideoDiscToStoreScreen;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class CartScreenController {
	
	@FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediaCategory;
    
    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;
    
    @FXML
    private Label totalCost;

	public CartScreenController() {
		super();
	}
	
	@FXML
    void btnRemoveClicked(MouseEvent event) {
		Media media = tblMedia.getSelectionModel().getSelectedItem();
		Cart.getCart().removeMedia(media);
		Cart.getCart().printCart();
    }
	
	void updateButtonBar(Media media) {
		btnRemove.setVisible(true);
		if (media instanceof Playable) {
			btnPlay.setVisible(true);
		}
		else {
			btnPlay.setVisible(false);
		}
	}
	
	@FXML
    void playClicked(MouseEvent event) {
		//play media
	}
	
	@FXML
    void addBookChosen(ActionEvent event) {
		new AddBookToStoreScreen();
    }

    @FXML
    void addCDChosen(ActionEvent event) {
    	new AddCompactDiscToStoreScreen();
    }

    @FXML
    void addDVDChosen(ActionEvent event) {
    	new AddDigitalVideoDiscToStoreScreen();
    }
    
    @FXML
    void viewStoreChosen(ActionEvent event) {
    	
    }
    
    @FXML
    private void initialize() {
    	colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
    	colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
    	colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
    	tblMedia.setItems(Cart.getCart().getItemsOrdered());
    	totalCost.setText(Cart.getCart().totalCost() + " $");
    	
    	btnPlay.setVisible(false);
    	btnRemove.setVisible(false);
    	
    	tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {
    		public void changed(ObservableValue<? extends Media> oservable, Media oldValue, Media newValue) {
    			if (newValue != null) {
    				updateButtonBar(newValue);
    			}
    		}
    	});
    	
    }
}
