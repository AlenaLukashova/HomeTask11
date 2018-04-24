package by.tc.jb24.services.find;

import java.util.List;

import by.tc.jb24.library.PrintEdition;

public interface Findable {
	List<PrintEdition> find(List<PrintEdition> units);
}

