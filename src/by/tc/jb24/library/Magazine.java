package by.tc.jb24.library;

public class Magazine extends Book {
	private int numberOfMagazine;

	public Magazine(String title, String publisher, String author, int pages, int yearPublished, int numberOfMagazine) {
		super(title, publisher, author, yearPublished, pages);
		this.numberOfMagazine = numberOfMagazine;
	}

	public int getNumber() {
		return numberOfMagazine;
	}

	public void setNumber(int numberOfMagazine) {
		this.numberOfMagazine = numberOfMagazine;
	}

	@Override
	public String toString() {
		return "Magazine [numberOfMagazine=" + numberOfMagazine + ", getNumber()=" + getNumber() + ", getAuthor()="
				+ getAuthor() + ", toString()=" + super.toString() + ", getTitle()=" + getTitle() + ", getPublisher()="
				+ getPublisher() + ", getYearPublished()=" + getYearPublished() + ", getPages()=" + getPages()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + "]";
	}

}
