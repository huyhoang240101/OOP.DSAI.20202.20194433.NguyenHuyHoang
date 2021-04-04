package hust.soict.dsai.aim;

public class CartTest {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		cart.addDigitalVideoDisc(dvd1, dvd2, dvd3);
		cart.printCart(cart);
		
		cart.searchDVDbyId(3);
		cart.searchDVDbyId(7);
		cart.searchDVDbyTitle("Star Wars");
		cart.searchDVDbyTitle("Soul");

	}

}

