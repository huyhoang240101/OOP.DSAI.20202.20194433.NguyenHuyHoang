package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

class Wrapper{
	DigitalVideoDisc c;
	Wrapper(DigitalVideoDisc c){
		this.c = c;
	}
}
public class TestPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle", "Science Fiction", 20.00f);
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella", "Animation", 30.00f);
		
		Wrapper wJungle = new Wrapper(jungleDVD);
		Wrapper wCinderella = new Wrapper(cinderellaDVD);
		
		swap(wJungle, wCinderella);
		System.out.println("jungle dvd title: " + wJungle.c.getTitle());
		System.out.println("cinderella dvd title: " + wCinderella.c.getTitle());
		System.out.println("jungle dvd category: " + wJungle.c.getCategory());
		System.out.println("cinderella dvd category: " + wCinderella.c.getCategory());
		System.out.println("jungle dvd cost: " + wJungle.c.getCost());
		System.out.println("cinderella dvd cost: " + wCinderella.c.getCost());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
	}
	
	public static void swap(Wrapper wo1, Wrapper wo2) {
		DigitalVideoDisc tmp = wo1.c;
		wo1.c = wo2.c;
		wo2.c = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
