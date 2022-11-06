package tpe;

import java.util.Iterator;


public class Lista <T> implements Iterable <Nodo<T>>{
	private int cantElementos;
	private Nodo<T> primero;
	
	//constructor
	public Lista() {
		this.primero=null;
		this.cantElementos=0;
	}
	

	@Override
	public Iterator<Nodo<T>> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getCantElementos() {
		return cantElementos;
	}
	public void setCantElementos(int cantElementos) {
		this.cantElementos = cantElementos;
	}
	public Nodo<T> getPrimero() {
		return primero;
	}
	public void setPrimero(Nodo<T> primero) {
		this.primero = primero;
	}
	public boolean estaVacio() {
		return this.getPrimero()==null;
	}
	//------------------------------------------------
//	private class IteradorDeNodos implements Iterator <Nodo>{
//		private int pos;
//		
//		public IteradorDeNodos() {
//			this.pos=0;
//		}
//
//		@Override
//		public boolean hasNext() {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public Nodo next() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//	}
	

}
