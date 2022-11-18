package tpe;

public abstract class ElementoAbstracto {
	private String nombre;

	public ElementoAbstracto(String nombre) {
		this.nombre = nombre;
	}

	public abstract int getCantAlumnos();

	public abstract String toString();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
