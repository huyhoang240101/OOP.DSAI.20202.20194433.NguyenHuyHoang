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

	public void play() {
		if (this.getLength() == 0) {
			System.out.println("Cannot play this track!");
		}
		else {
			 System.out.println("Playing track: " + this.getTitle());
			 System.out.println("Track length: " + this.getLength());
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
