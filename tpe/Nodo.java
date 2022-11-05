package tpe;

import java.util.Iterator;

public class Nodo implements Comparable <Nodo>, Iterator<Object>{
	private Nodo siguiente;
	private Comparable<Object> objeto;
	
	

	public Nodo(Comparable<Object> objeto) {		
		this.objeto = objeto;
	}


	@Override
	public int compareTo(Nodo o) {
		return this.getObjeto().compareTo(o.getObjeto());
	}


	public Nodo getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Nodo siguiente) {
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
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
