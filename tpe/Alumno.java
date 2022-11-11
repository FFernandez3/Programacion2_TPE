package tpe;

import java.util.ArrayList;

public class Alumno {
	private String nombre, apellido;
	private Long dni;
	private int edad;
	private ArrayList<String>intereses;
	
	public Alumno(String nombre, String apellido, long dni, int edad) {
		
		this.nombre = nombre;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	
	

}
