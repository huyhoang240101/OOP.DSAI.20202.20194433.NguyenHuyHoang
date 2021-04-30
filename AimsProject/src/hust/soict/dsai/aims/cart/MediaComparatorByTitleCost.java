package hust.soict.dsai.aims.cart;
import java.util.Comparator;
import hust.soict.dsai.aims.media.Media;

public class MediaComparatorByTitleCost {
	public int compare(Media o1, Media o2) {
		int CostCompare = (int) (o2.getCost() - o1.getCost());
		int TitleCompare = o1.getTitle().compareTo(o2.getTitle());
		
		return (TitleCompare == 0) ? CostCompare:TitleCompare;
	}
}
