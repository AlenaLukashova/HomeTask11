package by.tc.jb24.library;

public class EnglishBook extends SpecializedBook {
	private String levelOfLanguageSkills; 
	//Beginner, Intermediate, Advanced
	 
	public EnglishBook(String title,String publisher, String author, int yearPublished, int pages, String subject, String levelOfLanguageSkills) {   
		super(title,publisher, author, yearPublished, pages, subject);   
		this.levelOfLanguageSkills = levelOfLanguageSkills;  
		}
	 
	 public String getLevel() {   
		 return levelOfLanguageSkills;  
		 }  
	 
	 public void setLevel(String levelOfLanguageSkills){
		 this.levelOfLanguageSkills=levelOfLanguageSkills;
	 }
}

