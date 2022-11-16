package tpe;

import java.util.Comparator;
import java.util.Iterator;


public class ListaVinculada  implements Iterable <Object> {
	//private int cantElementos;
	private Nodo primero;
	private Comparator<Object> comparador;
	
	//constructor
	public ListaVinculada(Comparator<Object> c) {
		this.primero=null;
		this.comparador=c;
		//this.cantElementos=0;
	}
	//Consigna 1 f
	public void setComparador(Comparator <Object> c) {
		this.comparador=c;
	}
//	public boolean estaVacia() {
//		return this.cantElementos==0;
//	}
	public boolean estaVacia() {
		return this.getSize()==0;
	}
	public int getSize() {

        Nodo p = primero;
        int contador = 0;

        while(p!=null) {

            contador++;

            p = p.getSiguiente();

        }

        return contador;

    }
	//Consigna 1 d
	public int getPosicion(Object objeto) {
		  //Si esta vacio, devuelvemos -1
        if (this.estaVacia()) {
            return -1;
        } else {
 
            Nodo aux = primero;
 
            int posicion = 0;
            while (aux != null) {
                if (objeto.equals(aux.getObjeto())) { //Mejor .equals que ==
                    return posicion; //Existe
                }
                posicion++;
                aux = aux.getSiguiente();
            }
            //Si no lo encuentra devuelve -1
            return -1;
 
        }
 
	}
	//Consigna 1 b
	public void eliminarNodo(int pos) {
		if (this.estaVacia() || (pos< 0 || pos >= this.getSize())) {
            return;
		}
		else if (pos == 0) {
	             this.eliminarPrimerNodo();
	             return;
	        } 
	     else {
	 
	            
	            Nodo anterior = getNodo(pos - 1);
	 
	            
	            Nodo actual = getNodo(pos);
	 
	           
	            Nodo siguiente = actual.getSiguiente();
	
	           
	            anterior.setSiguiente(siguiente);
	 
	           // cantElementos--;
	    
	 
	        }
	    }
	
	public void eliminarPrimerNodo() {
		//Si la lista esta vacia, devolvemos null
        if (estaVacia()) {
            return;
        } else {
 
            
            Nodo aux = primero.getSiguiente();
            primero = aux; //Este es mi nuevo primero
 
         //   cantElementos--;
        }
	}
	
	
	public void eliminarTodasLasOcurrencias(Object obj) {
	
		Nodo p = primero;
		Nodo anterior=null;
		   
	    while(p!=null) {
            if(p.getObjeto().equals(obj)) {
            	if(p==primero) {
            		primero=p.getSiguiente();
            	}
            	else if(p.getSiguiente()!=null) {
            		anterior.setSiguiente(p.getSiguiente());
            		
            	}
            	else {
            		anterior.setSiguiente(null);
            	}

             }
            else {
            	anterior=p;
            }
            
            p = p.getSiguiente(); //ahora p es el segundo
    }
	    //1 4 55 55 65 70
	    //1 4 55 65 70
		
	}
	
	
	
	
	public Nodo getNodo(int pos) {
		  //si esta vacio o el indice no es correcto, devuelve null
        if (this.estaVacia() || (pos < 0 || pos >= this.getSize())) {
            return null;
        } else if (pos == 0) {
            return primero; //devuelvo el primero
        }
        else {
 
            Nodo buscado = primero;
 
            //Busco el nodo deseado con un recorrido
            int contador = 0;
            while (contador < pos) {
                contador++;
                buscado = buscado.getSiguiente();
            }
 
            //Me devuelve el buscado
            return buscado;
 
        
 
    }
	}
	
//	public void insertarOrdenado(Nodo nodoNuevo) {
//		if(nodoNuevo.compareTo(primero)<0) {
//			nodoNuevo.setSiguiente(primero);
//			this.primero=nodoNuevo;
//			return;
//		}
//		Nodo actual =primero;
//		Nodo anterior=null;
//		while((actual!=null)&&(actual.compareTo(nodoNuevo)<0) ){
//			anterior=actual;
//			actual=actual.getSiguiente();
//		}
//		if(actual==null) {
//			anterior.setSiguiente(nodoNuevo);
//			
//		}
//		else {
//			nodoNuevo.setSiguiente(actual);
//			if(actual==primero) {
//				primero=nodoNuevo;
//			}
//			else {
//				anterior.setSiguiente(nodoNuevo);
//			}
//		}

	//Consigna 1 a
	public void insertarOrdenado(Object objNuevo) {
		Nodo n = new Nodo(objNuevo);
		if(this.primero == null){
			this.primero = n;
		}
		else {
			Nodo actual =primero;
			Nodo anterior=null;
			while (actual!=null && comparador.compare(actual.getObjeto(), (objNuevo))<0){
				anterior = actual;
				actual = actual.getSiguiente();
			}
			if(actual == null){
				anterior.setSiguiente(n);
			}
			else{
				n.setSiguiente(actual);
				if(actual.equals(primero)){
					this.primero = n;
				}
				else {
					anterior.setSiguiente(n);
				}
			}
			
		}
		
			
			
		
	
//		if(comparador.compare(objNuevo, primero.getObjeto())<0) {
//			n.setSiguiente(primero);
//			this.primero=n;
//			return;
//		}
//		
//		while((actual!=null)&&(comparador.compare(nodoNuevo, actual)>0) ){
//			anterior=actual;
//			actual=actual.getSiguiente();
//		}
//		if(actual==null) {
//			anterior.setSiguiente(nodoNuevo);
//			
//		}
//		else {
//			nodoNuevo.setSiguiente(actual);
//			if(actual==primero) {
//				primero=nodoNuevo;
//			}
//			else {
//				anterior.setSiguiente(nodoNuevo);
//			}
//		}
		
			
		
	}
	public void insertarOrdenado2(Object objNuevo) {
		Nodo nodo = new Nodo(objNuevo);
		if(this.primero == null){
			this.primero = nodo;
		}
		else {
			Nodo actual =primero;
			if (actual!=null && comparador.compare(actual.getObjeto(), (objNuevo))>0){
				nodo.setSiguiente(actual);
				primero=nodo;
			}
			else {
				while (actual.getSiguiente()!=null && comparador.compare(objNuevo, actual.getSiguiente().getObjeto())<0){
					actual=actual.getSiguiente();
				} //cierro while
				nodo.setSiguiente(actual.getSiguiente());
				actual.setSiguiente(nodo);
			}
				
			}
			}
			
		
	
	public String toString() {

        String s = "";

        Nodo p = primero;

        if(this.estaVacia()==false) {

            while(p!=null) {
            	s+=p.getObjeto().toString()+" ";

                //s = s + p.getObjeto() + "-->";
                p = p.getSiguiente();

            }

        }else {

            s = "La lista esta vacia";

        }

        return s;

    }


  
	 @Override
	    public Iterator<Object> iterator() {
	        return new IteratorNodos();
	    }
	 
	    //Creo la clase interna MyIterator, que implementa la interfaz Iterator
	    private class IteratorNodos  implements Iterator<Object>{
	 
	        //Indica el siguiente elemento que se va a devolver 
	        private int siguiente;
	        //private Nodo actual;
	        
	         
	        //Indica si hay un elemento
	        @Override
	        public boolean hasNext() {
	            return getNodo(siguiente)!=null;
	        }
	 
	        //Devuelve el elemento actual e incrementa al siguiente
	        @Override
	        public Object next() {
	            Object obj = getNodo(siguiente).getObjeto();
	            siguiente++;
	            return obj;
	        }
//	        public Object next2() {
//	        	actual=getNodo(siguiente);
//	        	return actual;
//	        }
	         
	    }
	     

	
//	public int getCantElementos() {
//		return cantElementos;
//	}
//	public void setCantElementos(int cantElementos) {
//		this.cantElementos = cantElementos;
//	}
	public Nodo getPrimero() {
		return primero;
	}
	public void setPrimero(Nodo primero) {
		this.primero = primero;
	}
	public boolean estaVacio() {
		return this.getPrimero()==null;
	}

	

}
