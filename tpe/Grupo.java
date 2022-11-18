package tpe;

import java.util.ArrayList;

public class Grupo extends ElementoAbstracto {
	private ArrayList<ElementoAbstracto> elementos;

	public Grupo(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();

	}

	public void addElemento(ElementoAbstracto e) {
		this.elementos.add(e);
	}

	@Override
	public int getCantAlumnos() {
		int total = 0;
		for (int i = 0; i < this.elementos.size(); i++) {
			total += elementos.get(i).getCantAlumnos();
		}
		return total;
	}

	@Override
	public String toString() {
		String total = this.getNombre() + " ";
		for (ElementoAbstracto a : elementos) {
			total += a.toString();
		}
		return total;
	}

}
