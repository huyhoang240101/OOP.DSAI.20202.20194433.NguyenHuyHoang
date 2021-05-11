package hust.soict.dsai.aims.media;
import java.time.LocalDate;
import java.util.ArrayList;

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
		for (int i =0; i < tracks.size(); i++) {
			length += tracks.get(i).getLength();
		}
		return length;
	}
	
	public CompactDisc(String title, String category, float cost, LocalDate date, String artist) {
		super(title, category, cost, date);
		this.artist = artist;
		this.tracks = tracks;
		this.length = this.getLengthCD();
		this.nbCompactDisc += 1;
		this.id = "CD" + nbCompactDisc;
	}

	@Override
	public String toString() {
		return "CD - " + id + " - " + title + " - " + category + " - " + artist + " - "
				+ length   + " - " + cost + "$";
	}

	public void play() {
		if (this.getLength() == 0) {
			System.out.println("Can not play this Compact Disc!");
		}
		else {
			System.out.println("\n********************************");
			System.out.println("Playing CD: " + this.getTitle());
			System.out.println("CD artist: " + this.getArtist());
			System.out.println("List of tracks:");
			for (int i = 0; i < tracks.size(); i++) {
				System.out.println("- " + tracks.get(i).getTitle());
			}
			System.out.println("\n--------------------------------");
			for (int i = 0; i < tracks.size(); i++) {
				tracks.get(i).play();
			}
			System.out.println("\n--------------------------------");
			System.out.println("\n********************************");
		}
	}

}
