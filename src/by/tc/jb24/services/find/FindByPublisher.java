package by.tc.jb24.services.find;

import java.util.ArrayList;
import java.util.List;

import by.tc.jb24.library.PrintEdition;
import by.tc.jb24.main.Findable;

public class FindByPublisher implements Findable {
	private String publisher;

	public FindByPublisher(String publisher) {
		this.publisher = publisher;
	}

	//@Override
	public List<PrintEdition> find(List<PrintEdition> units) {
		List<PrintEdition> resultUnits = new ArrayList<PrintEdition>();

		for (int i = 0; i < units.size(); i++) {
			PrintEdition obj = units.get(i);
			if (publisher == obj.getPublisher()) {
				resultUnits.add(obj);
			}
		}

		return resultUnits;
	}
}

