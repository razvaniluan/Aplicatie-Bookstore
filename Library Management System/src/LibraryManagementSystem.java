import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
	
	private List<Books> books;
	
	public LibraryManagementSystem() {
		books = new ArrayList<>();
	}
	
	public void addBook(String title, String author) {
		books.add(new Books(title,author));
		System.out.println("I added book with the title: " + title + " and author: " + author);
	}
	
	public List<Books> getAllBooks(){
		return books;
	}
	
	public void searchBooks(String query) {
		boolean found = false;
		
		for(Books book : books) {
			if(book.getTitle().toLowerCase().contains(query.toLowerCase()) ||
			   book.getAuthor().toLowerCase().contains(query.toLowerCase())){
				found = true;
				System.out.println("The book you have searched has been found with the tite: " + book.getTitle() +
						 		   " and author: " + book.getAuthor() + ". The book is " + (book.isBorrowed() ?
						 		   "Borrowed" : "Available"));
			}else {
                System.out.println("This book is unavailable at the moment.");
			}
		}
		if( !found) {
			System.out.println("No book has been found with the search term: " + query);
		}
	}
	
	public void borrowBooks(String title) {
		
		for(Books book : books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				if( !book.isBorrowed()) {
					book.borrow();
					System.out.println("The book with the title " + book.getTitle() + " has been rented");
				} else {
					System.out.println("This book is unavailable at the moment");
				}
			}
		}
	}
	
	public void returnBooks(String title) {
		
		for(Books book : books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				if( book.isBorrowed()) {
					book.returnBook();
					System.out.println("The book with the title " + book.getTitle() + " has been returned");
				} else {
					System.out.println("This book is not borrowed yet");
				}
			}
		}
	}
}
