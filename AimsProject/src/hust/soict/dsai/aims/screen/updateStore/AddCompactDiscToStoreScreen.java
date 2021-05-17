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

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.store.Store;

public class AddCompactDiscToStoreScreen extends JFrame {
	private JTextField cdTitle;
	private JTextField cdArtist;
	private JTextField cdCost;
	private String title;
	private float cost;
	private String artist;
	
	public AddCompactDiscToStoreScreen() {
		
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(5,2));
		
		cp.add(new JLabel("Title"));
		cdTitle = new JTextField();
		cdTitle.addActionListener(new InputTitle());
		cp.add(cdTitle);
		
		cp.add(new JLabel("Artist"));
		cdArtist = new JTextField();
		cdArtist.addActionListener(new InputArtist());
		cp.add(cdArtist);
		
		cp.add(new JLabel("Cost"));
		cdCost = new JTextField();
		cdCost.addActionListener(new InputCost());
		cp.add(cdCost);
		
		cp.add(new JLabel("Tracks"));
		JButton addTrack = new JButton("Add tracks");
		addTrack.addActionListener(new AddTrackButton());
		cp.add(addTrack);
		
		cp.add(new JLabel());
		JButton done = new JButton("Done");
		done.addActionListener(new DoneButton());
		cp.add(done);
		
		setVisible(true);
		setTitle("Add Compact Disc");
		setSize(300,200);		
	}
	
	private class InputTitle implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			title = cdTitle.getText();
		}
	}
	
	private class InputArtist implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			artist = cdArtist.getText();
		}
	}
		
	private class InputCost implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			cost = Float.parseFloat(cdCost.getText());
		}
	}
	
	private class AddTrackButton implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			new AddTrackToCompactDiscScreen();
		}
	}
	
	private class DoneButton implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			CompactDisc cd = new CompactDisc(title, "CD", cost, LocalDate.now(), artist);
			for (int i = 0; i < AddTrackToCompactDiscScreen.getTrack().size(); i++) {
				cd.addTrack(AddTrackToCompactDiscScreen.getTrack().get(i));
			}
			Store.getStore().addMediaToStore(cd);
			Store.getStore().printStore();
			dispose();	
		}
	}
	
	public static void main(String[] args) {
		new AddCompactDiscToStoreScreen();
	}

}
