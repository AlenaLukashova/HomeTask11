package by.tc.jb24.view;

import java.util.List;

import by.tc.jb24.library.Book;
import by.tc.jb24.library.PrintEdition;
import by.tc.jb24.library.Magazine;

public class PrintAsTable implements Printable {

	@Override
	public void print(List<PrintEdition> units) {
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");
		System.out.printf("%10s|%10s|%19s|%15s|%15s|%7s|", "TITLE", "PUBLISHER", "YEAR OF PUBLISHMENT", "AUTHOR",
				"NUMBER OF PAGES", "NUMBER");
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");

		for (PrintEdition unit : units) {
			if (unit instanceof Book) {
				System.out.format("%10s|%10s|%19s|%15s|%15s|%7s|", (unit.getTitle()), unit.getPublisher(),
						unit.getYearPublished(), ((Book) unit).getAuthor(), ((Book) unit).getPages(), "-");
			}
			if (unit instanceof Magazine) {
				System.out.format("%10s|%10s|%19s|%15s|%15s|%7s|", (unit.getTitle()), unit.getPublisher(),
						unit.getYearPublished(), "-", unit.getPages(), ((Magazine) unit).getNumber());
			}

			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------------------");

	}

}
