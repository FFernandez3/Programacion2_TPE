package tpe;

import java.util.Comparator;
import java.util.Iterator;

public class ListaVinculada implements Iterable<Object> {

	private Nodo primero;
	private Comparator<Object> comparador;

	// constructor
	public ListaVinculada(Comparator<Object> c) {
		this.primero = null;
		this.comparador = c;

	}

	public Nodo getPrimero() {
		return primero;
	}

	public void setPrimero(Nodo primero) {
		this.primero = primero;
	}

	// Consigna 1 f
	public void setComparador(Comparator<Object> c) {

		this.comparador = c;
		Nodo p = primero;
		primero = null;
		while (p != null) {
			this.insertarOrdenado(p.getObjeto());
			p = p.getSiguiente();
		}
	}

	public boolean estaVacia() {
		return primero == null;
	}

	public int getSize() {

		Nodo p = primero;
		int contador = 0;

		while (p != null) {

			contador++;

			p = p.getSiguiente();

		}

		return contador;

	}

	// Consigna 1 d
	public int getPosicion(Object objeto) {
		// Si esta vacio, devuelvemos -1
		if (this.estaVacia()) {
			return -1;
		} else {

			Nodo aux = primero;

			int posicion = 0;
			while (aux != null) {
				if (objeto.equals(aux.getObjeto())) {
					return posicion;
				}
				posicion++;
				aux = aux.getSiguiente();
			}
			// Si no lo encuentra devuelve -1
			return -1;

		}

	}

	// Consigna 1 b
	public void eliminarNodo(int pos) {
		if (this.estaVacia() || (pos < 0 || pos >= this.getSize())) {
			return;
		} else if (pos == 0) {
			this.eliminarPrimerNodo();
		} else {
			Nodo anterior = getNodo(pos - 1);
			Nodo actual = anterior.getSiguiente();

			Nodo siguiente = actual.getSiguiente();

			anterior.setSiguiente(siguiente);

		}
	}

	public void eliminarPrimerNodo() {

		if (!estaVacia()) {
			Nodo aux = primero.getSiguiente();
			primero = aux;

		}
	}

	public void eliminarTodasLasOcurrencias(Object obj) {

		Nodo p = primero;
		Nodo anterior = null;

		while (p != null) {
			if (p.getObjeto().equals(obj)) {
				if (p == primero) {
					primero = p.getSiguiente();
				} else if (p.getSiguiente() != null) {
					anterior.setSiguiente(p.getSiguiente());

				} else {
					anterior.setSiguiente(null);
				}

			} else {
				anterior = p;
			}

			p = p.getSiguiente();
		}

	}

	public Nodo getNodo(int pos) {

		if (this.estaVacia() || (pos < 0 || pos >= this.getSize())) {
			return null;
		} else if (pos == 0) {
			return primero;
		} else {

			Nodo buscado = primero;

			int contador = 0;
			while (contador < pos) {
				contador++;
				buscado = buscado.getSiguiente();
			}

			return buscado;

		}
	}

	// Consigna 1 a
	public void insertarOrdenado(Object objNuevo) {
		Nodo n = new Nodo(objNuevo);
		if (this.primero == null) {
			this.primero = n;
		} else {
			Nodo actual = primero;
			Nodo anterior = null;
			while (actual != null && comparador.compare(actual.getObjeto(), (objNuevo)) < 0) {
				anterior = actual;
				actual = actual.getSiguiente();
			}
			if (actual == null) {
				anterior.setSiguiente(n);
			} else {
				n.setSiguiente(actual);
				if (actual.equals(primero)) {
					this.primero = n;
				} else {
					anterior.setSiguiente(n);
				}
			}

		}

	}

	public String toString() {

		String s = "";

		Nodo p = primero;

		if (this.estaVacia() == false) {

			while (p != null) {
				s += p.getObjeto().toString() + " ";

				// s = s + p.getObjeto() + "-->";
				p = p.getSiguiente();

			}

		} else {

			s = "La lista esta vacia";

		}

		return s;

	}

	@Override
	public Iterator<Object> iterator() {
		return new IteratorNodos();
	}

	private class IteratorNodos implements Iterator<Object> {

		private Nodo actual;

		public IteratorNodos() {
			actual = primero;
		}

		@Override
		public boolean hasNext() {
			return (actual != null);
		}

		@Override
		public Object next() {
			Object obj = actual.getObjeto();
			actual = actual.getSiguiente();
			return obj;
		}

	}

}
