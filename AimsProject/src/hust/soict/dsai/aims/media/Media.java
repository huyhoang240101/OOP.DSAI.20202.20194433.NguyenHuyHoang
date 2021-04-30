package hust.soict.dsai.aims.media;
import java.time.LocalDate;

public abstract class Media {
	protected String title;
	protected String category;
	protected float cost;
	private LocalDate date;

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
		if (this.getTitle() == anotherMedia.getTitle()) {
			return true;
		}
		else {
			return false;
		}
	}	
}
