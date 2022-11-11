package tpe;

public class Main {

	public static void main(String[] args) {
//		Object o1=new Object ();
//		Object o2=new Object();
//		Object o3=new Object();
		Alumno a1=new Alumno ("Luis", "Garcia", 123, 33);
		Alumno a2=new Alumno ("Marcelo", "Fernandez", 124, 23);
		Alumno a3=new Alumno ("Ariel", "Garcia", 1255, 37);
		Alumno a4=new Alumno ("Sebastian", "Rodriguez", 1233, 53);
	
		Nodo n1=new Nodo (a1, 1);
		Nodo n2=new Nodo (a2, 2);
		Nodo n3=new Nodo (a1, 3);
		Nodo n4=new Nodo (a4, 4);
		Nodo n5=new Nodo(null, 5);
		
		
		
		n1.setSiguiente(n2);
		n2.setSiguiente(n3);
		n3.setSiguiente(n4);
		
		
		
		ListaVinculada lista=new ListaVinculada();
		lista.setPrimero(n1);
		
		//lista.eliminarNodo(0);
		
		lista.eliminarTodasLasOcurrencias(a2);
		System.out.println(lista.getSize());
		
		System.out.println(lista.toString());
		
		

	}

}
