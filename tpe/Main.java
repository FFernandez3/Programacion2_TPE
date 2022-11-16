package tpe;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
//		String o1=new String ("hola");
//		String o2=new String ("como");
//		String o3=new String("estas");
		Alumno a1=new Alumno ("Luis", "Garcia", 123, 33);	
		Alumno a2=new Alumno ("Marcelo", "Fernandez", 124, 23);
		Alumno a3=new Alumno ("Ariel", "Garcia", 1255, 37);
		Alumno a4=new Alumno ("Sebastian", "Rodriguez", 1233, 53);
	
//		Nodo n1=new Nodo (a1, 1);
//		Nodo n2=new Nodo (a2, 2);
//		Nodo n3=new Nodo (a1, 3);
//		Nodo n4=new Nodo (a4, 4);
//		Nodo n5=new Nodo(null, 5);
		
//		Nodo n1=new Nodo (o1);
//		Nodo n2=new Nodo (o2);
//		Nodo n3=new Nodo (o1);
//		Nodo n4=new Nodo (o3);
//		Nodo n5=new Nodo(o3);
		Comparator <Object> compDni=new ComparadorDni();
		Comparator <Object> c1;
		ListaVinculada lista=new ListaVinculada();
		lista.setComparador(compDni);
		lista.insertarOrdenado(a2);
		lista.insertarOrdenado(a1);
		lista.insertarOrdenado(a4);
		lista.insertarOrdenado(a3);
		lista.insertarOrdenado(a2);
		lista.insertarOrdenado(a2);
		
		
		//lista.eliminarNodo(0);
		
		lista.eliminarTodasLasOcurrencias2(a4);
		System.out.println(lista.getSize());
		
		System.out.println(lista.toString());
		
		
		

	}

}
