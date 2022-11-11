package tpe;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator <Alumno>{
	Comparator<Alumno> c1, c2;
	@Override
	public int compare(Alumno o1, Alumno o2) {
		int resultado=c1.compare(o1, o2);
		if(resultado==0) {
			return c2.compare(o1, o2);
		}
		
		return resultado;
	}

}
