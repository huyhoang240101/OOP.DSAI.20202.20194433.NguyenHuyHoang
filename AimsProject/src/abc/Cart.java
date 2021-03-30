package abc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println("The disc has been added");
		}
		else {
			System.out.println("The cart is full");
		}
	}
	
	void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i=0; i <= qtyOrdered-1; i++) {
			if (itemsOrdered[i] == disc) {
				for (int j = i; j <= qtyOrdered-1; j++) {
				    itemsOrdered[j] = itemsOrdered[j + 1];
				}
				qtyOrdered -= 1;
				System.out.println("The disc has been removed");
			}
		}
	}
	
	float totalCost() {
		float sum = 0;
		for (int i=0; i <= qtyOrdered-1; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
	void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		for (int i=0; i < dvdList.length; i++) {
			if (qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemsOrdered[qtyOrdered] = dvdList[i];
				qtyOrdered += 1;
				System.out.println("The disc has been added");
			}
			else {
				System.out.println("The cart is full");
			}
		}
	}
	void addDigitalVideoDisc(DigitalVideoDisc dvd, DigitalVideoDisc ... dvds) {
		addDigitalVideoDisc(dvd);
		addDigitalVideoDisc(dvds);
	}
	void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if ((qtyOrdered +1) < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = dvd1;
			itemsOrdered[qtyOrdered+1] = dvd2;
			qtyOrdered += 2;
			System.out.println("Two discs has been added");
		}
		else {
			System.out.println("There is not enough space");
		}
	}
	
}
