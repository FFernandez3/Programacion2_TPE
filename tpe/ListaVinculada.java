package tpe;

import java.util.Comparator;
import java.util.Iterator;


public class ListaVinculada  implements Iterable <Object> {
	//private int cantElementos;
	private Nodo primero;
	private Comparator<Object> comparador;
	
	//constructor
	public ListaVinculada() {
		this.primero=null;
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
	 
	            //Cojo el nodo anterior al que quiero borrar
	            Nodo anterior = getNodo(pos - 1);
	 
	            //Cojo el nodo que quiero borrar
	            Nodo actual = getNodo(pos);
	 
	            //Cojo el nodo siguiente al que quiero borrar
	            Nodo siguiente = actual.getSiguiente();
	
	            //El nodo anterior apunta al nodo siguiente
	            anterior.setSiguiente(siguiente);
	 
	           // cantElementos--;
	    
	 
	        }
	    }
	public void eliminarPrimerNodo() {
		//Si la lista esta vacia, devolvemos null
        if (estaVacia()) {
            return;
        } else {
 
            //Cojo el segundo
            Nodo aux = primero.getSiguiente();
            primero = aux; //Este es mi nuevo primero
 
         //   cantElementos--;
        }
	}
	
	//Consigna 1 c
	public void eliminarTodasLasOcurrencias(Object obj) {
		if(this.estaVacia()) {
			return;
		}
		else {
			    Nodo p = primero;
			   
			    while(p!=null) {
			        while(p.getSiguiente() != null) {
			            if(p.getObjeto() == obj) {
			            	
			                p.setSiguiente(p.getSiguiente().getSiguiente()); //el siguente de p es el 3ro
			              
			            } else {
			                p = p.getSiguiente();
			            }
			        }
			        p = p.getSiguiente(); //ahora p es el segundo
			    }
			}
			
				
			
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
	public void insertarOrdenado(Nodo nodoNuevo) {
		if(comparador.compare(nodoNuevo, primero)<0) {
			nodoNuevo.setSiguiente(primero);
			this.primero=nodoNuevo;
			return;
		}
		Nodo actual =primero;
		Nodo anterior=null;
		while((actual!=null)&&(comparador.compare(nodoNuevo, actual)>0) ){
			anterior=actual;
			actual=actual.getSiguiente();
		}
		if(actual==null) {
			anterior.setSiguiente(nodoNuevo);
			
		}
		else {
			nodoNuevo.setSiguiente(actual);
			if(actual==primero) {
				primero=nodoNuevo;
			}
			else {
				anterior.setSiguiente(nodoNuevo);
			}
		}
		
			
		
	}
	public String toString() {

        String s = "";

        Nodo p = primero;

        if(this.estaVacia()==false) {

            while(p!=null) {
            	s+=p.toString()+" ";

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
