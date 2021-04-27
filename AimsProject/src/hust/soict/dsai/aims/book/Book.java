package hust.soict.dsai.aims.book;
import java.util.ArrayList;

public class Book {
	private int id;
	private String title;
	private String category;
	private float cost;
	private ArrayList<String> authors = new ArrayList<String>();

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
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
