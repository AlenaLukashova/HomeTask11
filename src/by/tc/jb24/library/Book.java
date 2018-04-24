package by.tc.jb24.library;

public class Book extends PrintEdition{
	 private String author;
	 
	 private int pages;
	 
	 public Book(){
	 }
	 
	 public Book(String title, String publisher, String author, int yearPublished, int pages) {
		 super(title, publisher, yearPublished, pages); 
		 this.author=author;
		 } 
	 
	 public Book(String title){
		 super(title);     
	 }
	 
	 public String getAuthor() {
		 return author; 
		 }  
	 
	 public void setAuthor(String author) {
		 this.author = author; 
		 }

	@Override
	public String toString() {
		return "Book [author=" + author + ", pages=" + pages + ", getAuthor()=" + getAuthor() + ", getTitle()="
				+ getTitle() + ", getPublisher()=" + getPublisher() + ", getYearPublished()=" + getYearPublished()
				+ ", getPages()=" + getPages() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}  	 
	 
}

