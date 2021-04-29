package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	public String getArtist() {
		return artist;
	}
	
	void addTrack(Track track) {
		if (tracks.contains(track) == true) {
			System.out.println("The author already exist");
		}
		else {
			tracks.add(track);
		}
	}
	
	void removeTrack(Track track) {
		if (tracks.contains(track) == true) {
			tracks.remove(track);
		}
		else {
			System.out.println("the author does not exist");
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

}
