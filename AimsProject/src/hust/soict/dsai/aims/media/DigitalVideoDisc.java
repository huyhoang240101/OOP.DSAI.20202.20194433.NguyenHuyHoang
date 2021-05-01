package hust.soict.dsai.aims.media;
import java.time.LocalDate;

public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc(String title, String category, float cost, LocalDate date, String directory, int length) {
		super(title, category, cost, date, directory, length);
		DigitalVideoDisc.nbDigitalVideoDiscs += 1;
		this.id = "DVD" + nbDigitalVideoDiscs;
	}
	

@Override
	public String toString() {
		return "DVD - " + id + " - " + title + " - " + category + " - " + directory + " - " + length 
				 + " - " + cost + "$";
	}

	public void play() {
		if (this.getLength() == 0) {
			System.out.println("Can not play this Digital Video Disc!");
		}
		else {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}
	}
	
	public int compareTo(DigitalVideoDisc o) {
		return o.length - this.length;
	}
}
