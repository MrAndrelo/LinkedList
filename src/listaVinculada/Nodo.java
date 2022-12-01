package listaVinculada;

public class Nodo<T> {
	private T contenido;
	private Nodo<T> siguiente;
	
	public Nodo(T o) {
		contenido= o;
		siguiente=null;
	}
	
	public void setContenido( T c) {
		contenido=c;
	}
	
	public T getContenido() {
		return contenido;
	}
	
	public void setSiguiente(Nodo<T> n) {
		siguiente = n;
	}
	
	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	
	

}
