package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Collections;

public class Cart {
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	private static final Cart INSTANCE = new Cart();
	
	private Cart() {
	}
	
	public static Cart getCart() {
		return INSTANCE;
	}
	
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	// calculate the total cost of dvds in cart
	public float totalCost() {
		float sum = 0;
		for (int i=0; i < itemsOrdered.size(); i++) {
			sum += itemsOrdered.get(i).getCost();
		}
		return sum;
	}
	
	// add an arbitraty number of dvd into cart
	public void addMedia(Media ... media) {
		for (int i = 0; i < media.length; i++) {
			if (itemsOrdered.contains(media[i]) == true) {
				System.out.println(media[i].getTitle() + " already exist!");
			}
			else {
				itemsOrdered.add(media[i]);
				System.out.println(media[i].getTitle() + " has been added to cart!");
			}
		}
	}
	
	public void removeMedia(Media ... media) {
		for (int i = 0; i < media.length; i++) {
			for (int j = 0; i < itemsOrdered.size(); j++) {
				if (itemsOrdered.get(j).equals(media[i]) == true) {
					itemsOrdered.remove(media[i]);
				}
				else {
					System.out.println(media[i].getTitle() + " does not exist!");
				}
			}
		}
	}
	
	//print the information of media and total cost in cart
	public void printCart() {
		System.out.println("\n*****************************CART*********************************************");
		System.out.println("Ordered Items:");
		for (int i=0; i < itemsOrdered.size(); i++) {
			System.out.println((i+1) + ". " + itemsOrdered.get(i).toString());
		}
		System.out.println("Total cost: " + this.totalCost() +"$");
		System.out.println("\n******************************************************************************");
	}
	// search Media by ID
	public void searchMediabyId(String a) {
		boolean found = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getId().equals(a.toUpperCase())) {
				found = true;
				System.out.print(itemsOrdered.get(i).toString());
				break;
			}
		}
		if (found == false) {
			System.out.println("\nItems not found!");
		}
		
	}
	
	//search Media by Title
	public void searchMediabyTitle(String b) {
		boolean found = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getTitle().toLowerCase().equals(b.toLowerCase())) {
				found = true;
				System.out.print(itemsOrdered.get(i).toString());
			}
		}
		if (found == false) {
			System.out.println("\nItems not found!");
		}
	}
}
