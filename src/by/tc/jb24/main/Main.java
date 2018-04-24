package by.tc.jb24.main;

import java.util.*;

import by.tc.jb24.library.Book;
import by.tc.jb24.library.Magazine;
import by.tc.jb24.library.PrintEdition;
import by.tc.jb24.library.Library;
import by.tc.jb24.services.find.FindByTitle;
//import by.tc.jb24.services.find.FindByPublisher;
import by.tc.jb24.services.Services;
import by.tc.jb24.services.comparator.YearPublishedComparator;
import by.tc.jb24.services.comparator.NumberOfPagesComparator;
import by.tc.jb24.view.PrintAsList;
import by.tc.jb24.view.PrintAsTable;
import by.tc.jb24.view.ViewAction;

public class Main {

	public static void main(String[] args) {
		Library myLibrary = new Library();

		myLibrary.add(new Book("Java Basics", "ABC", "Smolyakova", 2016, 275));
		myLibrary.add(new Book("Java Basics", "WHY", "Ivanov", 2017, 485));
		myLibrary.add(new Book("Java Basics", "XYZ", "Petrov", 1995, 985));
		myLibrary.add(new Magazine("Science", "AAAS", "Petrov", 2018, 87, 3));
		myLibrary.add(new Magazine("Space", "XYZ", "Monnk", 25, 2015, 12));

		// myLibrary.remove(new Book("Java Basic", "ABC", "Smolyakova", 2016, 275));

		Findable match = new FindByTitle("Java Basics");
		Services findMatcher = new Services();
		List<PrintEdition> resultUnits = findMatcher.find(myLibrary, match);

		System.out.println("Number of found results: " + resultUnits.size());
		System.out.println("");
		System.out.print("Books found by titles sorted by year of publishment:");

		Set<PrintEdition> sortedByPublicationYearSet = new TreeSet<PrintEdition>(new YearPublishedComparator());
		sortedByPublicationYearSet.addAll(resultUnits);
		List<PrintEdition> sortedByPublicationYearList = new ArrayList<PrintEdition>();
		sortedByPublicationYearList.addAll(sortedByPublicationYearSet);
		ViewAction.print(new PrintAsTable(), sortedByPublicationYearList);

		System.out.println("");
		System.out.println("Books found by titles sorted by number of pages:");

		Collections.sort(resultUnits, new NumberOfPagesComparator());
		ViewAction.print(new PrintAsList(), resultUnits);

		System.out.println("");

	}
}
