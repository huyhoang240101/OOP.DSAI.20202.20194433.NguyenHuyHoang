package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class DigitalVideoDisc extends Disc implements Playable {
	private String directory;
	private int length;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		DigitalVideoDisc.nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		DigitalVideoDisc.nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category, String directory, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.cost = cost;
		DigitalVideoDisc.nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.length = length;
		this.cost = cost;
		DigitalVideoDisc.nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	public int getId() {
		return id;
	}
	public static ArrayList<Object> getDetail(DigitalVideoDisc dvd) {
		ArrayList<Object> arrL = new ArrayList<Object>();
		if (dvd.getTitle() != null) {
			arrL.add(dvd.getTitle());
		}
		if (dvd.getCategory() != null) {
			arrL.add(dvd.getCategory());
		}
		if (dvd.getDirectory() != null) {
			arrL.add(dvd.getDirectory());
		}
		if (dvd.getLength() != 0) {
			arrL.add(dvd.getLength());
		}
		if (dvd.getCost() != 0) {
			arrL.add(dvd.getCost() + "$");
		}
		
		return arrL;
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
