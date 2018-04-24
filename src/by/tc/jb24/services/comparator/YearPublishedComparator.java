package by.tc.jb24.services.comparator;

import by.tc.jb24.library.PrintEdition;

public class YearPublishedComparator extends UnitCormarator {
	    @Override
	    public int compare(PrintEdition o1, PrintEdition o2) {
	        double publicationYear1 = o1.getYearPublished();
	        double publicationYear2 = o2.getYearPublished();

	        if (publicationYear1 < publicationYear2) {
	            return -1;
	        } else if (publicationYear1 == publicationYear2) {
	            return 0;
	        } else {
	            return 1;
	        }
	    }
	}