package by.tc.jb24.services;

import java.util.List;

import by.tc.jb24.library.Library;
import by.tc.jb24.library.PrintEdition;
import by.tc.jb24.main.Findable;

public class Services {
	public List<PrintEdition> find(Library myLibrary, Findable findMatcher) {
		List<PrintEdition> units = myLibrary.getUnits();
		List<PrintEdition> hasFind = null;
		hasFind = findMatcher.find(units);
		return hasFind;
	}
}


