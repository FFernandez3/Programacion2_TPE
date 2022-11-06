package tpe;

import java.util.Iterator;

public class Nodo<T> implements Comparable <Nodo <T>>, Iterator<Nodo>{
	private Nodo<T> siguiente;
	private Comparable<Object> objeto;
	
	

	public Nodo(Comparable<Object> objeto) {		
		this.objeto = objeto;
		this.siguiente=null;
	}
	
	public boolean estaVacio() {
		return this.getObjeto()==null;
	}


	public Nodo<T> getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Nodo<T>siguiente) {
		this.siguiente = siguiente;
	}


	public Comparable<Object> getObjeto() {
		return objeto;
	}


	public void setObjeto(Comparable<Object> objeto) {
		this.objeto = objeto;
	}


	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Nodo<T> next() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public int compareTo(Nodo<T> o) {
		// TODO Auto-generated method stub
		return this.getObjeto().compareTo(o.getObjeto());
	}


	
	
	

}
