package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable{
	private String title;
	private int length;

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	
	 public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}

	public String play() throws PlayerException {
		if (this.getLength() > 0) {
			return "Track length: " + this.getLength();
		}
		else {
			throw new PlayerException("ERROR: Track length is non-positive!");
		}
	 }
	 
	 public boolean equals(Track anotherTrack) {
		 if (this.getTitle() == anotherTrack.getTitle() && this.getLength() == anotherTrack.getLength()) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }

}
