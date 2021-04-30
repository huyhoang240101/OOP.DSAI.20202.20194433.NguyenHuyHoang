package hust.soict.dsai.test.store;
import java.time.LocalDate;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		Store store1 = new Store();
		
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f, LocalDate.now(), "Roger Allers", 87);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f, LocalDate.now(), "George Lucas", 87);
		
		ArrayList<String> authors1 = new ArrayList<String>();
		authors1.add("Gosho");
		Book book = new Book("Conan", "Comic", 5f, LocalDate.now(), 12, authors1);
		
		Track track1 = new Track("a", 1);
		Track track2 = new Track("b", 2);
		ArrayList<Track> tracks1 = new ArrayList<Track>();
		tracks1.add(track2);
		tracks1.add(track1);
		CompactDisc cd = new CompactDisc("Leave the door open", "Pop", 20.0f, LocalDate.now(), "Bruno Mars", tracks1);
		
		store1.addMediaToStore(dvd1,dvd2,book, cd);
		store1.printStore();
		
		store1.removeMediaFromStore(dvd2);
		store1.printStore();
	}

}
