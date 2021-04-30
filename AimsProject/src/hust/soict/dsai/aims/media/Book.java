package hust.soict.dsai.aims.media;
import java.time.LocalDate;
import java.util.ArrayList;

public class Book extends Media {
	private int id;
	private ArrayList<String> authors = new ArrayList<String>();

	public int getId() {
		return id;
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}
	
	public Book(String title, String category, float cost, LocalDate date, int id, ArrayList<String> authors) {
		super(title, category, cost, date);
		this.id = id;
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book - " + id + " - " + authors + " - " + title + " - " + category + " - "
				+ cost + "$";
	}

	void addAuthor(String authorName) {
		if (authors.contains(authorName) == true) {
			System.out.println(authorName + " already exist");
		}
		else {
			authors.add(authorName);
			System.out.println(authorName + " has been added");
		}
	}
	
	void removeAuthor(String authorName) {
		if (authors.contains(authorName) == true) {
			authors.remove(authorName);
			System.out.println(authorName + " has been removed");
		}
		else {
			System.out.println(authorName + " does not exist");
		}
	}
}
