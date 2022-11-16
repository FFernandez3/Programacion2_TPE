package tpe;

import java.util.Comparator;

public class ComparadorCantAlumnos implements Comparator <Object>{

	@Override
	public int compare(Object a1, Object a2) {
		ElementoAbstracto o1= (ElementoAbstracto) a1;
		ElementoAbstracto o2= (ElementoAbstracto) a2;
		return o1.getCantAlumnos() - o2.getCantAlumnos();
	}

}
