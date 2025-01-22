public class Books {
	private String title;
	private String author;
	private boolean isBorrowed;
	public Books(String title, String author) {
		this.title = title;
		this.author = author;
		this.isBorrowed = false;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public boolean isBorrowed() {
		return this.isBorrowed;
	}
	public void borrow() {
		if(!isBorrowed) {
			isBorrowed = true;
		}
	}
	public void returnBook() {
		if(isBorrowed) {
			isBorrowed = false;
		}
	}
}
