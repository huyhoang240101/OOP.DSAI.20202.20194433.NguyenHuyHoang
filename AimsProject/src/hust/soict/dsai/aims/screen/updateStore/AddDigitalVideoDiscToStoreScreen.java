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

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class AddDigitalVideoDiscToStoreScreen extends JFrame {
	private JTextField dvdTitle;
	private JTextField dvdDirector;
	private JTextField dvdLength;
	private JTextField dvdCost;
	private String title;
	private float cost;
	private String directory;
	private int length;
	
	public AddDigitalVideoDiscToStoreScreen() {
		
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(5,2));
		
		cp.add(new JLabel("Title"));
		dvdTitle = new JTextField();
		dvdTitle.addActionListener(new InputTitle());
		cp.add(dvdTitle);
		
		cp.add(new JLabel("Director"));
		dvdDirector = new JTextField();
		dvdDirector.addActionListener(new InputDirector());
		cp.add(dvdDirector);
		
		cp.add(new JLabel("Length"));
		dvdLength = new JTextField();
		dvdLength.addActionListener(new InputLength());
		cp.add(dvdLength);
		
		cp.add(new JLabel("Cost"));
		dvdCost = new JTextField();
		dvdCost.addActionListener(new InputCost());
		cp.add(dvdCost);
			
		cp.add(new JLabel());
		JButton done = new JButton("Done");
		done.addActionListener(new DoneButton());
		cp.add(done);
		
		setVisible(true);
		setTitle("Add DVD");
		setSize(300,200);		
	}
	
	private class InputTitle implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			title = dvdTitle.getText();
		}
	}
	
	private class InputDirector implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			directory = dvdDirector.getText();
		}
	}
	
	private class InputCost implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			cost = Float.parseFloat(dvdCost.getText());
		}
	}
	
	private class InputLength implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			length = Integer.parseInt(dvdLength.getText());
		}
	}
	
	private class DoneButton implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String button = evt.getActionCommand();
			if (button.equals("Done")) {
				DigitalVideoDisc dvd = new DigitalVideoDisc(title, "DVD", cost, LocalDate.now(), directory, length);
				Store.getStore().addMediaToStore(dvd);
				Store.getStore().printStore();
				dispose();
			}
		}
	}
	
	public static void main(String[] args) {
		new AddDigitalVideoDiscToStoreScreen();
	}

}
