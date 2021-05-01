package hust.soict.dsai.aims.media;

import java.time.LocalDate;

public class Disc extends Media {
	protected String directory;
	protected int length;
	
	public String getDirectory() {
		return directory;
	}

	public int getLength() {
		return length;
	}

	public Disc(String title, String category, float cost, LocalDate date, String directory, int length) {
		super(title, category, cost, date);
		this.directory = directory;
		this.length = length;
	}
	
	public Disc(String title, String category, float cost, LocalDate date, int length) {
		super(title, category, cost, date);
		this.length = length;
	}

	public Disc(String title, String category, float cost, LocalDate date) {
		super(title, category, cost, date);
	}
	
}
