package by.tc.jb24.view;

import java.util.List;

import by.tc.jb24.library.PrintEdition;
import by.tc.jb24.library.Book;
import by.tc.jb24.library.Magazine;

public class PrintAsList implements Printable {

	//@Override
	public void print(List<PrintEdition> units) {
		for (PrintEdition unit : units) {
			System.out.printf("Printed edition with %d id, Title: %s, Publisher: %s, ", unit.hashCode(),
					unit.getTitle(), unit.getPublisher());
			
				
			if (unit instanceof Book) {
				System.out.printf("Author: %s, Number of pages: %d, Year published: %d", ((Book) unit).getAuthor(),
						((Book) unit).getPages(), ((Book) unit).getYearPublished());
			}
			if (unit instanceof Magazine) {
				System.out.printf("Number", ((Magazine) unit).getNumber());
			}
			
			System.out.println(" ");
		}
	}
}
