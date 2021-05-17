package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	private static final Store INSTANCE = new Store();
	
	private Store() {
	}
	
	public static Store getStore() {
		return INSTANCE;
	}
	
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}

	//add items to the store
	public void addMediaToStore(Media ... media) {
		for (int i = 0; i < media.length; i++) {
			itemsInStore.add(media[i]);
		}
		System.out.println("\n" + media.length + " items has been added to the store.");
	}
	
	//remove items from the store
	public void removeMediaFromStore(Media ... media) {
		for (int i = 0; i < media.length; i++) {
			if (itemsInStore.contains(media[i]) == true) {
				itemsInStore.remove(media[i]);
			}
		}
		System.out.println( "\n"+ media.length + " items has been removed from the store.");
	}
	
	public void printStore() {
		System.out.println("************************STORE****************************************");
		for (int i = 0; i < itemsInStore.size(); i++) {
			System.out.println((i+1) + ". " + itemsInStore.get(i).toString() + " - " + itemsInStore.get(i).getDate());
		}
		System.out.println("\n**********************************************************************");
	}
	
	public void displayStore() {
		System.out.println("**************STORE******************");
		for (int i = 0; i < itemsInStore.size(); i++) {
			System.out.println((i+1) + ". " + itemsInStore.get(i).getId()+ " - " + itemsInStore.get(i).getTitle());
		}
		System.out.println("\n*************************************");
	}
}
