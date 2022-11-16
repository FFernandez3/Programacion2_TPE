package tpe;

import java.util.Comparator;

public class ComparadorNot implements Comparator <Object>{
	Comparator <Object> comparadorANegar;
	
	

	public ComparadorNot(Comparator<Object> comparadorANegar) {
		
		this.comparadorANegar = comparadorANegar;
	}



	@Override
	public int compare(Object o1, Object o2) {
		return comparadorANegar.compare(o1, o2) * -1;
	}
}
