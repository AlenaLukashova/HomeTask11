package by.tc.jb24.library;

public class SpecializedBook extends Book{
	private String subject; 
	 
	public SpecializedBook(String title,  String publisher, String author, int yearPublished, int pages, String subject) {   
		super(title,publisher, author,yearPublished, pages);   
		this.subject = subject;  
		} 
	 
	 public String getSubject() {  
		 return subject;  
		 }  
	 
	 public void setSubject(String subject){
		 this.subject=subject;
	 }

}
