package hust.soict.dsai.aims.screen.updateStore;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.store.Store;

public class AddBookToStoreScreen extends JFrame {
	private Store store;
	private JTextField bookTitle;
	private JTextField bookCost;
	private JTextField bookAuthor;
	private String title;
	private float cost;
	private ArrayList<String> authors = new ArrayList<String>();
	
	public AddBookToStoreScreen() {
		this.store = store;
		
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(4,2));
		
		cp.add(new JLabel("Title"));
		bookTitle = new JTextField();
		bookTitle.addActionListener(new InputTitle());
		cp.add(bookTitle);
		
		cp.add(new JLabel("Cost"));
		bookCost = new JTextField();
		bookCost.addActionListener(new InputCost());
		cp.add(bookCost);
		
		cp.add(new JLabel("Authors (each author is separated by a comma)"));
		bookAuthor = new JTextField();
		bookAuthor.addActionListener(new InputAuthors());
		cp.add(bookAuthor);
		
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
			title = bookTitle.getText();
		}
	}
	
	private class InputAuthors implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String ListOfAuthors = bookAuthor.getText();
			String[] a = ListOfAuthors.split(",");
			for (int i = 0; i < a.length; i++) {
				authors.add(a[i]);
			}
		}
	}
	
	private class InputCost implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			cost = Float.parseFloat(bookCost.getText());
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
	
	public static void main(String[] args) {
		new AddBookToStoreScreen();
	}
}
