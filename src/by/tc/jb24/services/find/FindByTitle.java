package by.tc.jb24.services.find;

import java.util.List;
import java.util.ArrayList;

import by.tc.jb24.library.PrintEdition;
import by.tc.jb24.main.Findable;

public class FindByTitle implements Findable {
	String title;

	public FindByTitle(String title) {
		this.title = title;
	}
    //@Override
	public List<PrintEdition> find(List<PrintEdition> units) {
		List<PrintEdition> resultUnits = new ArrayList<PrintEdition>();

        for(int i = 0; i < units.size(); i++) {
            PrintEdition obj = units.get(i);
            if (title.equals(obj.getTitle())) {
                resultUnits.add(obj);
            }
        }
        return resultUnits;
	}
}
