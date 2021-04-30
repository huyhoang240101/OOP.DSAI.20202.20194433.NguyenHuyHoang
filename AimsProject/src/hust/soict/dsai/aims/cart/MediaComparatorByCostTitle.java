package hust.soict.dsai.aims.cart;
import java.util.Comparator;
import hust.soict.dsai.aims.media.*;

public class MediaComparatorByCostTitle implements Comparator<Media> {
	public int compare(Media o1, Media o2) {
		int CostCompare = (int) (o2.getCost() - o1.getCost());
		int TitleCompare = o1.getTitle().compareTo(o2.getTitle());
		
		return (CostCompare == 0) ? TitleCompare:CostCompare;
	}
	
}
