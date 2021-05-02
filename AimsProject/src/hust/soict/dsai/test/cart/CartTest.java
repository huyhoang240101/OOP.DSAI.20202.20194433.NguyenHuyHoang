package hust.soict.dsai.test.cart;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.cart.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.cart.MediaComparatorByTitleCost;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;

public class CartTest {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f, LocalDate.now(), "Roger Allers", 87);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f, LocalDate.now(), "George Lucas", 90);
		
		ArrayList<String> authors1 = new ArrayList<String>();
		authors1.add("Gosho");
		Book book = new Book("Conan", "Comic", 19.95f, LocalDate.now(), authors1);
		
		Track track1 = new Track("a", 1);
		Track track2 = new Track("b", 2);
		ArrayList<Track> tracks1 = new ArrayList<Track>();
		tracks1.add(track2);
		tracks1.add(track1);
		CompactDisc cd = new CompactDisc("Leave the door open", "Pop", 20.0f, LocalDate.now(), "Bruno Mars", tracks1);
				
		cart.addMedia(dvd1, dvd2, book, cd);
		cart.printCart();
		
//		cart.searchDVDbyId("DVD2");
//		cart.searchDVDbyId("DVD3");
//		cart.searchDVDbyTitle("Star Wars");
//		cart.searchDVDbyTitle("Soul");
		//Collections.sort(cart.getItemsOrdered(), new MediaComparatorByCostTitle());
		
		cart.printCart();
		
		//Collections.sort(cart.getItemsOrdered(), new MediaComparatorByTitleCost());
		//cart.printCart(cart);

	}

}

