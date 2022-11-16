package tpe;


public class Nodo {
	//private int id;
	private Nodo siguiente;
	private Object objeto;
	
	
	

	public Nodo(Object objeto) {		
		this.objeto = objeto;
		this.siguiente=null;
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
	
	
//	public int getId() {
//		return id;
//	}
//
//
//
//
//	public void setId(int id) {
//		this.id = id;
//	}




//	public String toString() {
//		return "Nodo " +this.getId();
//	}


	
	
	

}
