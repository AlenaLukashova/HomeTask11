package by.tc.jb24.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<PrintEdition> units = new ArrayList<PrintEdition>();

	public Library() {
	}

	public void add(PrintEdition unit) {
		units.add(unit);
	}
	
	public void remove(PrintEdition unit) {
		units.remove(unit);
	}

	public List<PrintEdition> getUnits() {
		return units;
	}
	
	public void setUnits(List<PrintEdition> units) {
		this.units = units;
	}
	
	public List<PrintEdition> find(List<PrintEdition> units) {
		List<PrintEdition> resultUnits = new ArrayList<PrintEdition>();

        for(int i = 0; i < units.size(); i++) {
            PrintEdition obj = units.get(i);
            if (units.equals(obj.getTitle())) {
                resultUnits.add(obj);
            }
        }
        return resultUnits;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((units == null) ? 0 : units.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		if (units == null) {
			if (other.units != null)
				return false;
		} else if (!units.equals(other.units))
			return false;
		return true;
	}

}