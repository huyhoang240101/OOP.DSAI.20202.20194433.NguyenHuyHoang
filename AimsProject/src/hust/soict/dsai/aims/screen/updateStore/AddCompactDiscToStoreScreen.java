package hust.soict.dsai.aims.screen.updateStore;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.store.Store;

public class AddCompactDiscToStoreScreen extends JFrame {
	private Store store;
	private JTextField cdTitle;
	private JTextField cdArtist;
	private JTextField cdCost;
	private String title;
	private float cost;
	private String artist;
	
	public AddCompactDiscToStoreScreen() {
		this.store = store;
		
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(4,2));
		
		cp.add(new JLabel("Title"));
		cdTitle = new JTextField();
		cdTitle.addActionListener(new InputTitle());
		cp.add(cdTitle);
		
		cp.add(new JLabel("Artist"));
		cdArtist = new JTextField();
		cdArtist.addActionListener(new InputAuthors());
		cp.add(cdArtist);
		
		cp.add(new JLabel("Cost"));
		cdCost = new JTextField();
		cdCost.addActionListener(new InputCost());
		cp.add(cdCost);
		
		cp.add(new JLabel());
		JButton done = new JButton("Done");
		done.addActionListener(new DoneButton());
		cp.add(done);
		
		setVisible(true);
		setTitle("Add Book");
		setSize(580,200);		
	}
	
	private class InputTitle implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			title = cdTitle.getText();
		}
	}
		
	private class InputCost implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			cost = Float.parseFloat(cdCost.getText());
		}
	}
	
	private class DoneButton implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String button = evt.getActionCommand();
			if (button.equals("Done")) {
				Book book = new Book(title, "Book", cost, LocalDate.now(), authors);
				store.addMediaToStore(book);
				dispose();
			}	
		}
	}

}
