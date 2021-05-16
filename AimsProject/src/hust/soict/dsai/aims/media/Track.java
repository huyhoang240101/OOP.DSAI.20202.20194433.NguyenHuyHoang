package hust.soict.dsai.aims.media;

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

	public String play() {
		if (this.getLength() == 0) {
			return "Cannot play this track!";
		}
		else {
			 return "Track length: " + this.getLength();
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
