package hust.soict.dsai.aims;
import java.time.LocalDate;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aims {
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		}
	
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	public static void bookMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1");
	}
	
	public static void discMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void updateStore() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to Store");
		System.out.println("2. Remove from Store");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void Type() {
		System.out.println("--------------------------------");
		System.out.println("1. Book");
		System.out.println("2. Digital Video Disc");
		System.out.println("3. Compact Disc");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 1-2-3");
	}
	public static void filterMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter by ID");
		System.out.println("2. Filter by Title");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void sortMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Sort by Cost");
		System.out.println("2. Sort by Title");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void main(String[] args) {
		Store HoangStore = new Store();
		Track track1 = new Track("a", 1);
		Track track2 = new Track("b", 2);
		ArrayList<Track> tracks1 = new ArrayList<Track>();
		tracks1.add(track2);
		tracks1.add(track1);
		ArrayList<String> authors1 = new ArrayList<String>();
		authors1.add("Gosho");
		CompactDisc cd = new CompactDisc("Leave the door open", "Pop", 20.0f, LocalDate.now(), "Bruno Mars");
		DigitalVideoDisc dvd = new DigitalVideoDisc("Avengers", "Science Fiction", 15.0f, LocalDate.now(), "Kevin", 150);
		Book book = new Book("Conan", "Comic", 5f, LocalDate.now());
		HoangStore.addMediaToStore(dvd, cd, book);
		HoangStore.getCart().addMedia(dvd, book, cd);
		
		boolean found = false;
		Scanner input = new Scanner(System.in);
		showMenu();
		int menu = input.nextInt();
		if (menu == 0) {
			System.out.println("Thank you for using our services!");
		}
		else if (menu == 1) {
			HoangStore.displayStore();
			storeMenu();
			int menuOption = input.nextInt();
			if (menuOption == 0) {
				System.out.println("Thank you for using our services!");
			}
			else if (menuOption == 1) {
				System.out.println("Enter title: ");
				input.nextLine();
				String itemDetail = input.nextLine();
				for (int i = 0; i < HoangStore.getItemsInStore().size(); i++) {
					if (HoangStore.getItemsInStore().get(i).getTitle().toLowerCase().equals(itemDetail.toLowerCase())) {
						found = true;
						System.out.println("\n******************************************************************");
						System.out.println(HoangStore.getItemsInStore().get(i).toString());
						System.out.println("\n******************************************************************");
						
						if (HoangStore.getItemsInStore().get(i) instanceof Book == true) {
							bookMenu();
							int bookOption = input.nextInt();
							if (bookOption == 0) {
								System.out.println("Thank you for using our services!");
							}
							else if (bookOption == 1) {
								HoangStore.getCart().addMedia(HoangStore.getItemsInStore().get(i));
							}
						}
						else if (HoangStore.getItemsInStore().get(i) instanceof DigitalVideoDisc == true) {
							discMenu();
							int dvdOption = input.nextInt();
							if (dvdOption == 0) {
								System.out.println("Thank you for using our services!");
							}
							else if (dvdOption == 1) {
								HoangStore.getCart().addMedia(HoangStore.getItemsInStore().get(i));
							}
							else if (dvdOption == 2) {
								((DigitalVideoDisc) HoangStore.getItemsInStore().get(i)).play();
								bookMenu();
								int dvdOption2 = input.nextInt();
								if (dvdOption2 == 0) {
									System.out.println("Thank you for using our services!");
								}
								else if (dvdOption2 == 1) {
									HoangStore.getCart().addMedia(HoangStore.getItemsInStore().get(i));
								}
							}
						}
						else if (HoangStore.getItemsInStore().get(i) instanceof CompactDisc == true) {
							discMenu();
							int cdOption = input.nextInt();
							if (cdOption == 0) {
								System.out.println("Thank you for using our services!");
							}
							else if (cdOption == 1) {
								HoangStore.getCart().addMedia(HoangStore.getItemsInStore().get(i));
							}
							else if (cdOption == 2) {
								((CompactDisc) HoangStore.getItemsInStore().get(i)).play();
								bookMenu();
								int cdOption2 = input.nextInt();
								if (cdOption2 == 0) {
									System.out.println("Thank you for using our services!");
								}
								else if (cdOption2 == 1) {
									HoangStore.getCart().addMedia(HoangStore.getItemsInStore().get(i));
								}
							}
						}
						break;
					}
				}
				if (found == false) {
					System.out.println("Item not found!");
				}
			}
			else if (menuOption == 2) {
				System.out.println("Enter title: ");
				input.nextLine();
				String itemTitle = input.nextLine();
				for (int i = 0; i < HoangStore.getItemsInStore().size(); i++) {
					if (HoangStore.getItemsInStore().get(i).getTitle().toLowerCase().equals(itemTitle.toLowerCase())) {
						found = true;
						HoangStore.getCart().addMedia(HoangStore.getItemsInStore().get(i));
						System.out.println("Number of items: " + HoangStore.getCart().getItemsOrdered().size());
						break;
					}
		        }
				if (found == false) {
					System.out.println("Item not found!");
				}
			}
			else if (menuOption == 3) {
				System.out.println("Enter title: ");
				input.nextLine();
				String itemTitle = input.nextLine();
				for (int i = 0; i < HoangStore.getItemsInStore().size(); i++) {
					if (HoangStore.getItemsInStore().get(i).getTitle().toLowerCase().equals(itemTitle.toLowerCase())) {
						found = true;
						if (HoangStore.getItemsInStore().get(i) instanceof DigitalVideoDisc) {
							((DigitalVideoDisc) HoangStore.getItemsInStore().get(i)).play();
						}
						else if (HoangStore.getItemsInStore().get(i) instanceof CompactDisc) {
							((CompactDisc) HoangStore.getItemsInStore().get(i)).play();
						}
						else if (HoangStore.getItemsInStore().get(i) instanceof Book) {
							System.out.println("Can not play this item!");
						}
						break;
					}
		        }
				if (found == false) {
					System.out.println("Item not found!");
				}
			}
			else if (menuOption == 4) {
				HoangStore.getCart().printCart();
			}
		}
		else if (menu == 2) {
			updateStore();
			int updateOption = input.nextInt();
			if (updateOption == 0) {
				System.out.println("Thank you for using our services!");
			}
			else if (updateOption == 1) {
				Type();
				int typeOption = input.nextInt();
				if (typeOption == 1) {
					System.out.println("Enter information with the following order (Input 'Unknow' if the information is not known):");
					System.out.println("Title - Category - Cost - Authors");
					input.nextLine();
					String title = input.nextLine();
					String category = input.nextLine();
					float cost = input.nextFloat();
					
					Book newBook = new Book(title, category, cost, LocalDate.now());
					while (true) {
						input.nextLine();
						String authorName = input.nextLine();
						newBook.addAuthor(authorName);
						System.out.println("Any other authors? 1. Yes or 0. No");
						int YorN = input.nextInt();
						if (YorN == 1){
							continue;
						}
						if (YorN == 0) {
							break;
						}
					}
					HoangStore.addMediaToStore(newBook);
					HoangStore.printStore();
				}
				else if (typeOption == 2) {
					System.out.println("Enter information with the following order (Input 'Unknow' if the information is not known):");
					System.out.println("Title - Category - Cost - Directory - Length");
					input.nextLine();
					String title = input.nextLine();
					String category = input.nextLine();
					float cost = input.nextFloat();
					input.nextLine();
					String directory = input.nextLine();
					int length = input.nextInt();
					
					DigitalVideoDisc newDVD = new DigitalVideoDisc(title, category, cost, LocalDate.now(), directory, length);
					HoangStore.addMediaToStore(newDVD);
					HoangStore.printStore();
				}
				// Unfinished
				else if (typeOption == 3) {
					System.out.println("Enter information with the following order (Input 'Unknow' if the information is not known):");
					System.out.println("Title - Category - Cost - Artist");
					input.nextLine();
					String titleCD = input.nextLine();
					String category = input.nextLine();
					float cost = input.nextFloat();
					input.nextLine();
					String artist = input.nextLine();
					
					CompactDisc newCD = new CompactDisc(titleCD, category, cost, LocalDate.now(), artist);
					
					while (true) {
						System.out.println("Enter Track with the following order:");
						System.out.println("Title - Length");
						String titleTrack = input.nextLine();
						int lengthTrack = input.nextInt();
						
						Track newTrack = new Track(titleTrack, lengthTrack);
						newCD.addTrack(newTrack);
						System.out.println("Any other tracks? 1. Yes or 0. No");
						int YorN2 = input.nextInt();
						input.nextLine();
						if (YorN2 == 1){
							continue;
						}
						if (YorN2 == 0) {
							break;
						}
					}
					HoangStore.addMediaToStore(newCD);
					HoangStore.printStore();
				}
			}
			else if (updateOption == 2) {
				HoangStore.printStore();
				System.out.println("Enter title: ");
				input.nextLine();
				String itemRemove = input.nextLine();
				for (int i = 0; i < HoangStore.getItemsInStore().size(); i++) {
					if (HoangStore.getItemsInStore().get(i).getTitle().toLowerCase().equals(itemRemove.toLowerCase())) {
						found = true;
						HoangStore.removeMediaFromStore(HoangStore.getItemsInStore().get(i));
						break;
					}
				}
				if (found == false) {
					System.out.println("Item not found!");
				}
			}
		}
		else if (menu == 3) {
			HoangStore.getCart().printCart();
			cartMenu();
			int cartOption = input.nextInt();
			if (cartOption == 0) {
				System.out.println("Thank you for using our services!");
			}
			else if (cartOption == 1) {
				filterMenu();
				int filterOption = input.nextInt();
				if (filterOption == 0) {
					System.out.println("Thank you for using our services!");
				}
				else if (filterOption == 1) {
					System.out.println("Enter ID:");
					input.nextLine();
					String searchID = input.nextLine();
					HoangStore.getCart().searchMediabyId(searchID);
				}
				else if (filterOption == 2) {
					System.out.println("Enter Title:");
					input.nextLine();
					String searchTitle = input.nextLine();
					HoangStore.getCart().searchMediabyTitle(searchTitle);
				}
			}
			else if (cartOption == 2) {
				sortMenu();
				int sortOption = input.nextInt();
				if (sortOption == 0) {
					System.out.println("Thank you for using our services!");
				}
				else if (sortOption == 1) {
					Collections.sort(HoangStore.getCart().getItemsOrdered(), Media.COMPARE_BY_COST_TITLE);
					HoangStore.getCart().printCart();
				}
				else if (sortOption == 2) {
					Collections.sort(HoangStore.getCart().getItemsOrdered(), Media.COMPARE_BY_TITLE_COST);
					HoangStore.getCart().printCart();
				}
			}
			else if (cartOption == 3) {
				System.out.println("Enter Media ID:");
				input.nextLine();
				String mediaRemove = input.nextLine();
				for (int i = 0; i < HoangStore.getCart().getItemsOrdered().size(); i++) {
					if (HoangStore.getCart().getItemsOrdered().get(i).getId().equals(mediaRemove.toUpperCase())) {
						found = true;
						HoangStore.getCart().removeMedia(HoangStore.getCart().getItemsOrdered().get(i));
						HoangStore.getCart().printCart();
						break;
					}
				}
				if (found == false) {
					System.out.println("Item not found!");
				}
			}
			else if (cartOption == 4) {
				System.out.println("Enter title: ");
				input.nextLine();
				String itemTitle = input.nextLine();
				for (int i = 0; i < HoangStore.getItemsInStore().size(); i++) {
					if (HoangStore.getItemsInStore().get(i).getTitle().toLowerCase().equals(itemTitle.toLowerCase())) {
						found = true;
						if (HoangStore.getItemsInStore().get(i) instanceof DigitalVideoDisc) {
							((DigitalVideoDisc) HoangStore.getItemsInStore().get(i)).play();
						}
						else if (HoangStore.getItemsInStore().get(i) instanceof CompactDisc) {
							((CompactDisc) HoangStore.getItemsInStore().get(i)).play();
						}
						else if (HoangStore.getItemsInStore().get(i) instanceof Book) {
							System.out.println("Can not play this item!");
						}
						break;
					}
		        }
				if (found == false) {
					System.out.println("Item not found!");
				}
			}
			//Unfinished
			else if (cartOption == 5) {
				System.out.println("An order has been placed!");
				for (int i = 0; i < HoangStore.getCart().getItemsOrdered().size(); i++) {
					HoangStore.getCart().removeMedia(HoangStore.getCart().getItemsOrdered().get(i));
				}
				HoangStore.getCart().printCart();
			}
		}
	}
}
