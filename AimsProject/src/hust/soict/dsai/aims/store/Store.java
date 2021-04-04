package hust.soict.dsai.aim.store;
import java.util.ArrayList;

import hust.soict.dsai.aim.disc.DigitalVideoDisc;

public class Store {
	private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
	
	//add dvd to the store
	void addDVD(DigitalVideoDisc ... dvd) {
		for (int i = 0; i < dvd.length; i++) {
			itemsInStore.add(dvd[i]);
		}
		System.out.println("\n" + dvd.length + " disc has been added to the store.");
	}
	
	//remove dvd from the store
	void removeDVD(DigitalVideoDisc ... dvd) {
		for (int i = 0; i < dvd.length; i++) {
			for (int j = 0; j < itemsInStore.size(); j++) {
				if (dvd[i] == itemsInStore.get(j)) {
					itemsInStore.remove(j);
				}
			}
		}
		System.out.println( "\n"+ dvd.length + " disc has been removed from the store.");
	}
	void printStore() {
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
