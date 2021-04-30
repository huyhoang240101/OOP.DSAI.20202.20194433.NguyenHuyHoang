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

	public Track() {
		// TODO Auto-generated constructor stub
	}
	 public void play() {
		 System.out.println("Playing track: " + this.getTitle());
		 System.out.println("Track length: " + this.getLength());
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
