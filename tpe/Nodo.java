package tpe;

public class Nodo {

	private Nodo siguiente;
	private Object objeto;

	public Nodo(Object objeto) {
		this.objeto = objeto;
		this.siguiente = null;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

}
