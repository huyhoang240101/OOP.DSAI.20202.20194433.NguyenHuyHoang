package hust.soict.dsai.aims.media;
import java.time.LocalDate;

import hust.soict.dsai.aims.exception.PlayerException;

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

	public String play() throws PlayerException {
		if (this.getLength() > 0) {
			return "DVD length: " + this.getLength();
		}
		else {
			throw new PlayerException("ERROR: DVD length is non-positive!");
		}
	}
}
