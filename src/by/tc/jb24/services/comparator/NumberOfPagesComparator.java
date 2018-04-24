package by.tc.jb24.services.comparator;

import by.tc.jb24.library.PrintEdition;

public class NumberOfPagesComparator extends UnitCormarator {
	@Override
	public int compare(PrintEdition o1, PrintEdition o2) {
		double pagesUnit1 = o1.getPages();
		double pagesUnit2 = o2.getPages();

		if (pagesUnit1 < pagesUnit2) {
			return -1;
		} else if (pagesUnit1 == pagesUnit2) {
			return 0;
		} else {
			return 1;
		}
	}
}
