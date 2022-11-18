package tpe;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		/* Punto a */
		System.out.println("-----Inciso a) y b)------");
		Integer n1 = 10;
		Integer n2 = 21;
		Integer n3 = 1;
		Integer n4 = 5;
		Integer n5 = 11;

		Comparator<Object> compInteger = new ComparadorInteger();
		// Comparator<Object> compNot=new ComparadorNot(compInteger);
		ListaVinculada lista2 = new ListaVinculada(compInteger);

		lista2.insertarOrdenado(n1);
		lista2.insertarOrdenado(n2);
		lista2.insertarOrdenado(n3);
		lista2.insertarOrdenado(n4);
		lista2.insertarOrdenado(n5);

		for (Object o : lista2) {
			System.out.println(o.toString());
		}

		// punto c
		System.out.println("-----Inciso c)------");
		lista2.eliminarNodo(0); // 1
		lista2.eliminarTodasLasOcurrencias(n4); // 5
		lista2.eliminarTodasLasOcurrencias(n5); // 11

		for (Object o : lista2) {
			System.out.println(o.toString());
		}

		System.out.println("----Inciso d) y e)-----");
		// punto d
		String s1 = "facil";
		String s2 = "es";
		String s3 = "parcial";
		String s4 = "prog 2";
		String s5 = "recuperatorio";

		Comparator<Object> compString = new ComparadorString();
		ListaVinculada lista3 = new ListaVinculada(compString);

		lista3.insertarOrdenado(s1);
		lista3.insertarOrdenado(s2);
		lista3.insertarOrdenado(s3);
		lista3.insertarOrdenado(s4);

		for (Object o : lista3) {
			System.out.println(o.toString());
		}

		System.out.println("----Inciso f)-----");
		// punto f
		System.out.println(lista3.getPosicion(s3));

		System.out.println("----Inciso g)-----");
		System.out.println(lista3.getPosicion(s5));

		System.out.println("----Inciso h)-----");
		Comparator<Object> compNot2 = new ComparadorNot(compString);
		lista3.setComparador(compNot2);

		for (Object o : lista3) {
			System.out.println(o.toString());
		}

		/* Punto i */
		System.out.println("-----Punto i-----");

		Alumno a1 = new Alumno("John", "Doe", 1200000, 55);
		Alumno a2 = new Alumno("Federico", "Lopez", 35999888, 26);
		Alumno a3 = new Alumno("Juana", "Garcia", 27123455, 37);
		Alumno a4 = new Alumno("Mora", "Diaz", 37124425, 53);
		Alumno a5 = new Alumno("Flora", "Rivas", 34555111, 33);
		Alumno a6 = new Alumno("Martin", "Gomez", 34111222, 29);
		Alumno a7 = new Alumno("Roman", "Bazan", 32555111, 40);

		a1.addInteres("intercambio");
		a2.addInteres("redes");
		a2.addInteres("php");
		a2.addInteres("java");
		a2.addInteres("python");
		a3.addInteres("programacion");
		a3.addInteres("php");
		a3.addInteres("java");
		a4.addInteres("psicologia");
		a4.addInteres("Freud");
		a5.addInteres("historia");
		a5.addInteres("antigua");
		a6.addInteres("romanos");
		a6.addInteres("egipcios");
		a6.addInteres("griegos");
		a7.addInteres("argentina");

		Grupo g1 = new Grupo("Unicen");
		Grupo g2 = new Grupo("Exactas");
		Grupo g3 = new Grupo("Humanas");
		Grupo g4 = new Grupo("Historia");

		g4.addElemento(a5);
		g4.addElemento(a6);
		g4.addElemento(a7);
		g3.addElemento(a4);
		g3.addElemento(g4);
		g2.addElemento(a2);
		g2.addElemento(a3);
		g1.addElemento(a1);
		g1.addElemento(g2);
		g1.addElemento(g3);

		Comparator<Object> compCantAlumnos = new ComparadorCantAlumnos();

		ListaVinculada lista4 = new ListaVinculada(compCantAlumnos);
		lista4.insertarOrdenado(g1);

		for (Object o : lista4) {
			System.out.println(o.toString());
		}
		/* Punto i segundo arbol */
		Alumno a8 = new Alumno("Juan", "Juarez", 33222444, 66);
		Alumno a9 = new Alumno("Julio", "Cesar", 33222111, 60);
		Alumno a10 = new Alumno("Bernardino", "Rivas", 30987654, 55);
		Alumno a11 = new Alumno("Jose", "Paso", 33322112, 48);
		Alumno a12 = new Alumno("Isaac", "Newton", 12343565, 33);

		Grupo g5 = new Grupo("Olimpiadas matatematicas");
		Grupo g6 = new Grupo("Matea2");
		Grupo g7 = new Grupo("LosFibo");

		a8.addInteres("sucesiones");
		a8.addInteres("algebra");
		a9.addInteres("sucesiones");
		a9.addInteres("algebra");
		a10.addInteres("matematicas");
		a11.addInteres("problemas");
		a12.addInteres("sucesiones");

		g7.addElemento(a10);
		g7.addElemento(a11);
		g7.addElemento(a12);
		g6.addElemento(a8);
		g6.addElemento(a9);
		g5.addElemento(g6);
		g5.addElemento(g7);

		ListaVinculada lista5 = new ListaVinculada(compCantAlumnos);
		lista5.insertarOrdenado(g5);

		for (Object o : lista5) {
			System.out.println(o.toString());
		}

	}

}
