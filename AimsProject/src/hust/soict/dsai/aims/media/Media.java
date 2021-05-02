package hust.soict.dsai.aims.media;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import hust.soict.dsai.aims.cart.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.cart.MediaComparatorByTitleCost;
import java.lang.Comparable;

public abstract class Media {
	protected String title;
	protected String category;
	protected float cost;
	protected LocalDate date;
	protected String id;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}

	public LocalDate getDate() {
		return date;
	}
	
	public Media(String title, String category, float cost, LocalDate date) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.date = date;
	}

	public boolean equals(Media anotherMedia) {
		if (this.getTitle().equals(anotherMedia.getTitle())) {
			return true;
		}
		else {
			return false;
		}
	}
}
