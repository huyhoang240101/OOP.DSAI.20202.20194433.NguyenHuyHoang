package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		Store store1 = new Store();
		
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avengers", "Science Fiction", 20.00f);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Toy Story", "Animation", 15.25f);
		
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Spiderman", "Science Fiction", 15.50f);
		
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Coco", "Animation", 16.00f);
		
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Soul", "Animation", 16.25f);
		
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Star Trek", "Science Fiction", 15.75f);
		
		store1.addDVD(dvd1,dvd2,dvd3,dvd4,dvd5,dvd6,dvd7,dvd8,dvd9);
		store1.printStore();
		
		store1.removeDVD(dvd3,dvd5,dvd7,dvd9);
		store1.printStore();
	}

}
