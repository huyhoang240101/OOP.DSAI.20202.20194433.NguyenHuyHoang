package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	public String getArtist() {
		return artist;
	}
	
	void addTrack(Track track) {
		if (tracks.contains(track) == true) {
			System.out.println(track.getTitle() + " already exist");
		}
		else {
			tracks.add(track);
			System.out.println(track.getTitle() + " has been added");
		}
	}
	
	void removeTrack(Track track) {
		if (tracks.contains(track) == true) {
			tracks.remove(track);
			System.out.println(track.getTitle() + " has been removed");
		}
		else {
			System.out.println(track.getTitle() + " does not exist");
		}
	}
	
	public int getLength(ArrayList<Track> track) {
		int length = 0;
		for (int i =0; i < track.size(); i++) {
			length += track.get(i).getLength();
		}
		return length;
	}

	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	public void play() {
		System.out.println(this.getTitle() + " CD");
		System.out.println("CD artist: " + this.getArtist());
		System.out.println("List of tracks:");
		for (int i = 0; i < tracks.size(); i++) {
			System.out.println(tracks.get(i).getTitle());
		}
		for (int i = 0; i < tracks.size(); i++) {
			tracks.get(i).play();
		}
	}

}
