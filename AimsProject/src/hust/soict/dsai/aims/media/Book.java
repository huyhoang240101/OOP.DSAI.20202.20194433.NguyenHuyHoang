package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class Book {
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
			System.out.println("The author already exist");
		}
		else {
			authors.add(authorName);
		}
	}
	
	void removeAuthor(String authorName) {
		if (authors.contains(authorName) == true) {
			authors.remove(authorName);
		}
		else {
			System.out.println("the author does not exist");
		}
	}
}
