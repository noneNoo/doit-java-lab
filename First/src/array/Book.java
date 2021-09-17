package array;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {
		
	}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
		
	}
	
	public void setBookName(String newName) {
		this.bookName = newName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	
	public String getAutor() {
		return author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
}
