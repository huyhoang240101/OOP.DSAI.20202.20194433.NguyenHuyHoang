package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Cart {
		private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
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
				System.out.println(media[i].getTitle() + " already exist");
			}
			else {
				itemsOrdered.add(media[i]);
				System.out.println(media[i].getTitle() + " has been added");
			}
		}
	}
	
	public void removeMedia(Media ... media) {
		for (int i = 0; i < media.length; i++) {
			if (itemsOrdered.contains(media[i]) == true) {
				itemsOrdered.remove(media[i]);
				System.out.println(media[i].getTitle() + " has been removed");
			}
			else {
				System.out.println(media[i].getTitle() + " does not exist");
			}
		}
	}
	
	//print the information of dvd and total cost in cart
	public void printCart(Cart orderedCart) {
		System.out.println("*****************************CART*************************************");
		System.out.println("Ordered Items:");
		for (int i=0; i < qtyOrdered; i++) {
			System.out.print((i+1) + ". " + "DVD - ");
			for (int j = 0; j < DigitalVideoDisc.getDetail(itemsOrdered[i]).size() -1 ; j++) {
				System.out.print(DigitalVideoDisc.getDetail(itemsOrdered[i]).get(j) + " - ");
			}
			System.out.println(DigitalVideoDisc.getDetail(itemsOrdered[i]).get(DigitalVideoDisc.getDetail(itemsOrdered[i]).size() -1 ));
		}
		System.out.println("Total cost: " + orderedCart.totalCost());
		System.out.println("**********************************************************************");
	}
	
	// search dvd by ID
	public void searchDVDbyId(int a) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId() == a) {
				found = true;
				System.out.print("DVD");
				for (int j = 0; j < DigitalVideoDisc.getDetail(itemsOrdered[i]).size(); j++) {
					System.out.print(" - " + DigitalVideoDisc.getDetail(itemsOrdered[i]).get(j));
				}
			}
		}
		if (found == false) {
			System.out.println("\nDVD not found!");
		}
		
	}
	
	//search dvd by Title
	public void searchDVDbyTitle(String b) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getTitle() == b) {
				found = true;
				System.out.print("DVD");
				for (int j = 0; j < DigitalVideoDisc.getDetail(itemsOrdered[i]).size(); j++) {
					System.out.print(" - " + DigitalVideoDisc.getDetail(itemsOrdered[i]).get(j));
				}
			}
		}
		if (found == false) {
			System.out.println("\nDVD not found!");
		}
	}
	
}
