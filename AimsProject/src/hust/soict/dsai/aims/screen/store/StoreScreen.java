package hust.soict.dsai.aims.screen.store;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.screen.updateStore.AddBookToStoreScreen;
import hust.soict.dsai.aims.screen.updateStore.AddCompactDiscToStoreScreen;
import hust.soict.dsai.aims.screen.updateStore.AddDigitalVideoDiscToStoreScreen;
import hust.soict.dsai.aims.store.Store;

public class StoreScreen extends JFrame {
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Option");
		
		JMenu smUpdateStore = new JMenu("Update Store");
		
		JMenuItem addBook = new JMenuItem("Add Book");
		addBook.addActionListener(new TFMenuItem());
		smUpdateStore.add(addBook);
		
		JMenuItem addCD = new JMenuItem("Add CD");
		addCD.addActionListener(new TFMenuItem());
		smUpdateStore.add(addCD);
		
		JMenuItem addDVD = new JMenuItem("Add DVD");
		addDVD.addActionListener(new TFMenuItem());
		smUpdateStore.add(addDVD);
		
		menu.add(smUpdateStore);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		JButton cartButton = new JButton("View cart");
		cartButton.addActionListener(new TFViewCart());
		cartButton.setPreferredSize(new Dimension(100, 50));
		cartButton.setMaximumSize(new Dimension(100, 50));
		
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cartButton);
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		
		return header;
	}
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3, 3, 2, 2));
		
		ArrayList<Media> mediaInStore = Store.getStore().getItemsInStore();
		for (int i = 0; i < 9; i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i), this);
			center.add(cell);
		}
		
		return center;
	}
	
	public StoreScreen() {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);
	}
	
	private class TFViewCart implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Cart.getCart().printCart();
			
		}
	}
	private class TFMenuItem implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String menuItem = e.getActionCommand();
			if (menuItem.equals("Add Book")) {
				new AddBookToStoreScreen();
			}
			if (menuItem.equals("Add CD")) {
				new AddCompactDiscToStoreScreen();
			}
			if (menuItem.equals("Add DVD")) {
				new AddDigitalVideoDiscToStoreScreen();
			}
		}
	}
	
	public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f, LocalDate.now(), "Roger Allers", 87);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f, LocalDate.now(), "George Lucas", 87);
		CompactDisc cd = new CompactDisc("Leave the door open", "Pop", 20.0f, LocalDate.now(), "Bruno Mars");
		
		Store.getStore().addMediaToStore(dvd2, dvd2, dvd1, dvd2, cd, cd, cd, cd, cd, dvd1);
		new StoreScreen();
	}

}
