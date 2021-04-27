package hust.soict.dsai.aims.media;
import java.time.LocalDate;

public abstract class Media {
	private String title;
	private String category;
	private float cost;
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

	public Media() {
		// TODO Auto-generated constructor stub
	}

}
