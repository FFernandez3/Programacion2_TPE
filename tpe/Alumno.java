package tpe;

import java.util.ArrayList;

public class Alumno extends ElementoAbstracto {
	private String nombre, apellido;
	private Long dni;
	private int edad;
	private ArrayList<String> intereses;

	public Alumno(String nombre, String apellido, long dni, int edad) {
		super(nombre);

		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.intereses = new ArrayList<>();
	}

	public void addInteres(String nuevoInteres) {
		if (!this.intereses.contains(nuevoInteres)) {
			this.intereses.add(nuevoInteres);
		}
	}

	public ArrayList<String> getIntereses() {
		return new ArrayList<>(intereses);
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		String suma = this.getNombre() + " " + this.getApellido() + "  DNI: " + this.getDni() + " [";
		for (int i = 0; i < this.getIntereses().size(); i++) {
			String interes = this.getIntereses().get(i);
			suma += "'" + interes + "'" + ", ";

		}
		suma += "] ";
		return suma;
	}

	@Override
	public int getCantAlumnos() {

		return 1;
	}

}
