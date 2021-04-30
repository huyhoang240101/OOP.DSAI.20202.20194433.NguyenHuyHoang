package hust.soict.dsai.test.disc;
import java.time.LocalDate;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

public class MediaTest {

	public static void main(String[] args) {
		ArrayList<Media> medias = new ArrayList<Media>();
		Track track1 = new Track("a", 1);
		Track track2 = new Track("b", 2);
		ArrayList<Track> tracks1 = new ArrayList<Track>();
		tracks1.add(track2);
		tracks1.add(track1);
		ArrayList<String> authors1 = new ArrayList<String>();
		authors1.add("Gosho");
		CompactDisc cd = new CompactDisc("Leave the door open", "Pop", 20.0f, LocalDate.now(), "Bruno Mars", tracks1);
		DigitalVideoDisc dvd = new DigitalVideoDisc("Avengers", "Science Fiction", 15.0f, LocalDate.now(), "Kevin", 150);
		Book book = new Book("Conan", "Comic", 5f, LocalDate.now(), 12, authors1);
		medias.add(book);
		medias.add(dvd);
		medias.add(cd);
		for (Media m : medias) {
			System.out.println(m.toString());
		}

	}

}
