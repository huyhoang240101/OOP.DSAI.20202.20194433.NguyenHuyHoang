package hust.soict.dsai.aims.media;
import java.time.LocalDate;
import java.util.ArrayList;

public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	public int getId() {
		return id;
	}
	
	public DigitalVideoDisc(String title, String category, float cost, LocalDate date, String directory, int length) {
		super(title, category, cost, date, directory, length);
		DigitalVideoDisc.nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	

@Override
	public String toString() {
		return "DVD - " + id + " - " + directory + " - " + length + " - " + title
				+ " - " + category + " - " + cost + "$";
	}

	//	public static ArrayList<Object> getDetail(DigitalVideoDisc dvd) {
//		ArrayList<Object> arrL = new ArrayList<Object>();
//		if (dvd.getTitle() != null) {
//			arrL.add(dvd.getTitle());
//		}
//		if (dvd.getCategory() != null) {
//			arrL.add(dvd.getCategory());
//		}
//		if (dvd.getDirectory() != null) {
//			arrL.add(dvd.getDirectory());
//		}
//		if (dvd.getLength() != 0) {
//			arrL.add(dvd.getLength());
//		}
//		if (dvd.getCost() != 0) {
//			arrL.add(dvd.getCost() + "$");
//		}
//		
//		return arrL;
//	}
	public void play() {
		if (this.getLength() == 0) {
			System.out.println("Can not play this Digital Video Disc!");
		}
		else {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}
	}
}
