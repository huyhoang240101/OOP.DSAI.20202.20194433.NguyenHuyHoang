package hust.soict.dsai.aim;

import java.util.ArrayList;

public class Aims {

	public static void main(String[] args) {
		Cart an0ther = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avengers", "Science Fiction", 20.00f);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Toy Story", "Animation", 15.25f);
		
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Spiderman", "Science Fiction", 15.50f);
		
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Coco", "Animation", 16.00f);
		
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Soul", "Animation", 16.25f);
		
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Star Trek", "Science Fiction", 15.75f);
		
		DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
		
		an0ther.addDigitalVideoDisc(dvdList);
		an0ther.addDigitalVideoDisc(dvd4,dvd5);
		an0ther.addDigitalVideoDisc(dvd6, dvd7, dvd8, dvd9);
		
//		System.out.println("Total Cost is: ");
//		System.out.println(an0ther.totalCost());
		
		//an0ther.removeDigitalVideoDisc(dvd2);
//		System.out.println("Total Cost is: ");
//		System.out.println(an0ther.totalCost());
		
		an0ther.printCart(an0ther);
	}

}
