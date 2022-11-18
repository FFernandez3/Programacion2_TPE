package tpe;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Object> {
	Comparator<Object> c1, c2;

	public ComparadorCompuesto(Comparator<Object> c1, Comparator<Object> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(Object o1, Object o2) {

		int resultado = c1.compare(o1, o2);
		if (resultado == 0) {
			return c2.compare(o1, o2);
		}

		return resultado;
	}

}
