package by.tc.jb24.view;

import java.util.List;

import by.tc.jb24.view.Printable;
import by.tc.jb24.library.PrintEdition;

public class ViewAction {
	public static void print(Printable printObj, List<PrintEdition> units) {
		printObj.print(units);
	}
}

