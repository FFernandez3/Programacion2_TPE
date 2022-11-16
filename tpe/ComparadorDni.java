package tpe;

import java.util.Comparator;

public class ComparadorDni implements Comparator <Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Alumno a1=(Alumno) o1;
		Alumno a2=(Alumno) o2;
		
		return a1.getDni().compareTo(a2.getDni());
	}

}
