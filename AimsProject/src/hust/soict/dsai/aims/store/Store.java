package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
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
			System.out.print("\n" + itemsInStore.get(i).getId() + ". " + "DVD");
			for (int j = 0; j < DigitalVideoDisc.getDetail(itemsInStore.get(i)).size(); j++) {
				System.out.print(" - " + DigitalVideoDisc.getDetail(itemsInStore.get(i)).get(j));
			}
		}
		System.out.println("\n**********************************************************************");
	}
}
