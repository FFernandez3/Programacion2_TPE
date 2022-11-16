package tpe;

import java.util.ArrayList;

public class Alumno extends ElementoAbstracto{
	private String nombre, apellido;
	private Long dni;
	private int edad;
	private ArrayList<String>intereses;
	
	public Alumno(String nombre, String apellido, long dni, int edad) {
		super(nombre);
	
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.intereses=new ArrayList<>();
	}
	
	public void addInteres(String nuevoInteres) {
		if(!this.intereses.contains(nuevoInteres)) {
			this.intereses.add(nuevoInteres);
		}
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
	public String toString () {
		return this.getNombre()  +" "+ this.getApellido() +",";
	}

	@Override
	public int getCantAlumnos() {
		
		return 1;
	}
	
	
	

}
