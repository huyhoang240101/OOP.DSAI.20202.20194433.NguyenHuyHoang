package hust.soict.dsai.aims.screen.updateStore;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import hust.soict.dsai.aims.media.Track;

public class AddTrackToCompactDiscScreen extends JFrame{
	private JTextField trackTitle;
	private JTextField trackLength;
	private static String title;
	private static int length;
	private static ArrayList<Track> tracks;
	
	public AddTrackToCompactDiscScreen() {
		Container addTrackDialog = getContentPane();
		addTrackDialog.setLayout(new GridLayout(3,2));
		
		addTrackDialog.add(new JLabel("Title"));
		trackTitle = new JTextField();
		trackTitle.addActionListener(new InputTitle());
		addTrackDialog.add(trackTitle);
		
		addTrackDialog.add(new JLabel("Length"));
		trackLength = new JTextField();
		trackLength.addActionListener(new InputLength());
		addTrackDialog.add(trackLength);
		
		JButton addATrack = new JButton("Add a track");
		addATrack.addActionListener(new ButtonListener());
		addTrackDialog.add(addATrack);
		JButton done = new JButton("Done");
		done.addActionListener(new ButtonListener());
		addTrackDialog.add(done);
		
		setVisible(true);
		setSize(250,200);
		setTitle("Add a track");
	}
	
	private class InputTitle implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			title = trackTitle.getText();
		}
	}
	
	private class InputLength implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			length = Integer.parseInt(trackLength.getText());
		}
	}
	
	public static ArrayList<Track> getTrack() {
		Track track = new Track(title, length);
		tracks.add(track);
		return tracks;
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String button = e.getActionCommand();
			if (button.equals("Add a track")) {
				new AddTrackToCompactDiscScreen();
				dispose();
			}
			if (button.equals("Done")) {
				dispose();
			}
		}
	}
}
