package hust.soict.dsai.aims.screen.store;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;

public class MediaStore extends JPanel {
	private Media media;
	private StoreScreen storeScreen;
	
	public MediaStore(Media media, StoreScreen storeScreen) {
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel("" + media.getCost() + " $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton addCartButton = new JButton("Add to cart");
		addCartButton.addActionListener(new TFButtonListener());
		container.add(addCartButton);
		if (media instanceof Playable) {
			JButton playButton = new JButton("Play");
			container.add(playButton);
			playButton.addActionListener(new TFButtonListener());
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	private class TFButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String button = e.getActionCommand();
			if (button.equals("Add to cart")) {
				Cart.getCart().addMedia(media);
			}
			if (button.equals("Play")) {
				JFrame f = new JFrame();
				String title;
				JLabel label1, label2;
				if (media instanceof DigitalVideoDisc) {
					label1 = new JLabel("Director: " + ((DigitalVideoDisc) media).getDirectory());
					label2 = new JLabel(((DigitalVideoDisc) media).play());
					title = media.getTitle();
				}
				else {
					label1 = new JLabel("Artist: " + ((CompactDisc) media).getArtist());
					label2 = new JLabel(((CompactDisc) media).play());
					title = media.getTitle();
				}
				JDialog d = new JDialog(f, title);
				
				d.add(label1);
				d.add(label2);
				d.setLayout(new GridLayout(2,1));
				d.setSize(200, 200);
				d.setVisible(true);
			}
		}
	}
}
