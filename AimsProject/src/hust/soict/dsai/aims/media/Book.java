package hust.soict.dsai.aims.media;
import java.time.LocalDate;
import java.util.ArrayList;

public class Book extends Media {
	private static int nbBook = 0;
	private ArrayList<String> authors = new ArrayList<String>();

	public ArrayList<String> getAuthors() {
		return authors;
	}
	
	public Book(String title, String category, float cost, LocalDate date, ArrayList<String> authors) {
		super(title, category, cost, date);
		this.nbBook += 1;
		this.id = "B" + nbBook;
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book - " + id + " - " + title + " - " + category + " - " + authors   + " - "
				+ cost + "$";
	}

	public void addAuthor(String authorName) {
		if (authors.contains(authorName) == true) {
			System.out.println(authorName + " already exist");
		}
		else {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName) == true) {
			authors.remove(authorName);
			System.out.println(authorName + " has been removed");
		}
		else {
		}
	}
}
