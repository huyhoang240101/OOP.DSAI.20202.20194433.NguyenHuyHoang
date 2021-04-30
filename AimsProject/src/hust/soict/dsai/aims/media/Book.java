package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class Book extends Media {
	private int id;
	private ArrayList<String> authors = new ArrayList<String>();

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public ArrayList<String> getAuthors() {
		return authors;
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
