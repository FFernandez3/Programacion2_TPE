package tpe;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Alumno a1=new Alumno ("Luis", "Garcia", 123, 33);	
		Alumno a2=new Alumno ("Marcelo", "Fernandez", 124, 23);
		Alumno a3=new Alumno ("Ariel", "Garcia", 1255, 37);
		Alumno a4=new Alumno ("Sebastian", "Rodriguez", 1233, 53);
		
		Grupo g1= new Grupo("Unicen");
		Grupo g2=new Grupo ("Exactas");
		Grupo g3=new Grupo ("Economicas");
	

		Comparator <Object> compDni=new ComparadorDni();

		
		Comparator<Object> comp=new ComparadorCantAlumnos();
		Comparator<Object> compNot= new ComparadorNot(comp);
		ListaVinculada lista=new ListaVinculada(compNot);
		
//		lista.insertarOrdenado(a2);
//		lista.insertarOrdenado(a1);
//		lista.insertarOrdenado(a4);
//		lista.insertarOrdenado(a3);
//		lista.insertarOrdenado(a2);
//		lista.insertarOrdenado(a2);
//		lista.insertarOrdenado(a3);
//		lista.insertarOrdenado(a1);
		
		lista.insertarOrdenado2(g3);
		lista.insertarOrdenado2(g1);
		lista.insertarOrdenado2(g2);
		
		g1.addElemento(a1);
		g1.addElemento(g2);
		
		g2.addElemento(a3);
		g2.addElemento(a3);
		
		g3.addElemento(a2);
		
		
		//lista.eliminarNodo(0);
		//System.out.println(lista.toString());
		//lista.eliminarTodasLasOcurrencias(a2);
		System.out.println(lista.getSize());
		System.out.println(g1.getCantAlumnos() +  "Unicen");
		System.out.println(g2.getCantAlumnos() + "Exactas");
		System.out.println(g3.getCantAlumnos() + "Economicas");
		
		System.out.println(lista.toString());
		
		/*-----------------------------------------*/
		Integer n1= 10;
		Integer n2=21;
		Integer n3=1;
		Integer n4=5;
		Integer n5=11;
		
		Comparator<Object> compInteger= new ComparadorInteger();
		Comparator<Object> compNot3=new ComparadorNot(compInteger);
		ListaVinculada lista2=new ListaVinculada(compNot3);
		
		lista2.insertarOrdenado(n1);
		lista2.insertarOrdenado(n2);
		lista2.insertarOrdenado(n3);
		lista2.insertarOrdenado(n4);
		lista2.insertarOrdenado(n5);
		
		System.out.println("----");
		
		for(Object o:lista2) {
			System.out.println(o.toString());
		}
		//System.out.println(lista2.toString());
		
		//punto c
		lista2.eliminarNodo(0); //1
		lista2.eliminarTodasLasOcurrencias(n4); //5
		lista2.eliminarTodasLasOcurrencias(n5); //11
		
		System.out.println("----");
		
		for(Object o:lista2) {
			System.out.println(o.toString());
		}
		System.out.println("----");
		//punto d
		String s1="facil";
		String s2="es";
		String s3="parcial";
		String s4="prog 2";
		String s5= "recuperatorio";
		
		Comparator<Object> compString= new ComparadorString();
		ListaVinculada lista3=new ListaVinculada(compString);
		Comparator<Object> compNot2= new ComparadorNot(compString);
		lista3.setComparador(compNot2);
		
		lista3.insertarOrdenado(s1);
		lista3.insertarOrdenado(s2);
		lista3.insertarOrdenado(s3);
		lista3.insertarOrdenado(s4);
		
		for(Object o:lista3) {
			System.out.println(o.toString());
		}
		System.out.println("----");
		//punto f
		System.out.println(lista3.getPosicion(s3));
		System.out.println("----");
		
		System.out.println(lista3.getPosicion(s5));
		
		System.out.println("----");
		
		
		for(Object o:lista3) {
			System.out.println(o.toString());
		}
		
		
		
		
		
		
		
		
		
		

	}

}
