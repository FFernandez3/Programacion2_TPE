package tpe;

import java.util.Comparator;

public class ComparadorInteger implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i1.compareTo(i2);
	}

}
