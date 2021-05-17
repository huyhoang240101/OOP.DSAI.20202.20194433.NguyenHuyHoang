package hust.soict.dsai.aims.media;
import java.time.LocalDate;
import java.util.ArrayList;

import hust.soict.dsai.aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	private static int nbCompactDisc = 0;

	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track track) {
		if (tracks.contains(track) == true) {
			System.out.println(track.getTitle() + " already exist");
		}
		else {
			tracks.add(track);
		}
	}
	
	public void removeTrack(Track track) {
		if (tracks.contains(track) == true) {
			tracks.remove(track);
			System.out.println(track.getTitle() + " has been removed");
		}
		else {
			System.out.println(track.getTitle() + " does not exist");
		}
	}
	
	public int getLengthCD() {
		int length = 0;
		for (int i = 0; i < tracks.size(); i++) {
			length += tracks.get(i).getLength();
		}
		return length;
	}
	
	public CompactDisc(String title, String category, float cost, LocalDate date, String artist) {
		super(title, category, cost, date);
		this.artist = artist;
		this.tracks = tracks;
		this.nbCompactDisc += 1;
		this.id = "CD" + nbCompactDisc;
	}

	@Override
	public String toString() {
		return "CD - " + id + " - " + title + " - " + artist + " - "
				+ getLengthCD() + " - " + cost + "$";
	}

	public String play() throws PlayerException {
		if (this.getLengthCD() > 0) {
			for (int i = 0; i < tracks.size(); i++) {
				try {
					return tracks.get(i).play();
				} 
				catch(PlayerException e) {
					throw e;
				}
			}
		}
		else {
			throw new PlayerException("ERROR: CD length is non-positive!");
		}
//		if (this.getLength() == 0) {
//			return "Can not play this Compact Disc!";
//		}
//		else {
//			return "Playing CD: " + this.getTitle() + 
//					"CD artist: " + this.getArtist() + 
//					"List of tracks:";
//			for (int i = 0; i < tracks.size(); i++) {
//				return "- " + tracks.get(i).getTitle();
//			}
//			System.out.println("\n--------------------------------");
//			for (int i = 0; i < tracks.size(); i++) {
//				tracks.get(i).play();
//			}
//			System.out.println("\n--------------------------------");
//		}
	}
	public static void main(String[] args) {
		Track track1 = new Track("The Man", 3);
		Track track2 = new Track("London Boy", 4);
		CompactDisc cd = new CompactDisc("Lover", "DVD", 50.0f, LocalDate.now(), "Taylor Swift");
		cd.addTrack(track1);
		cd.addTrack(track2);
		System.out.println(cd.toString());
		System.out.println(cd.getLengthCD());
	}

}
