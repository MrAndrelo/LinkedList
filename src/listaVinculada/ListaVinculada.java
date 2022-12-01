package listaVinculada;

import java.util.Iterator;
import java.util.Comparator;


public class ListaVinculada<T> implements Iterable<T>{
	private Comparator<T> orden;
	private Nodo<T> inicial;
	private int size;
	
	public ListaVinculada(Comparator<T> or) {
		this.inicial=null;
		orden= or;
		size=0;
	}
	
//	COMENTARIO DE AYUDANTE:SOLEDAD MERINO.Lista ordenar: cuando se le setea un nuevo comparador a la lista,
//	la misma se debe reordenar teniendo en cuenta el nuevo comparador.
	
	public void setOrden(Comparator<T> or) {
		this.orden=or;
		Nodo<T> aux=this.inicial;
		this.inicial=null;
		while(aux!=null) {
			this.addNodo(aux.getContenido());
			aux=aux.getSiguiente();
		}
	}
	
	public void addNodo(T o) {
		Nodo<T> nuevo = new Nodo<T>(o);
		
		if(this.isVacia()) {
			this.inicial=nuevo;
			
			}else {
				Nodo<T> previo= null;
				Nodo<T> aux= this.inicial;
				while (aux != null && orden.compare(aux.getContenido(), nuevo.getContenido())< 0){
					previo = aux;
					aux = aux.getSiguiente();
				}
					
				if(aux == null){
					previo.setSiguiente(nuevo);
				}
				else{
					nuevo.setSiguiente(aux);
					if(aux == this.inicial){
						this.inicial = nuevo;
					}
					else {
						previo.setSiguiente(nuevo);
					}
				}
			}
				this.size++;
			
	}
	


	
	public boolean isVacia(){
		return inicial==null;
	}
	
	public Nodo<T> getNodo(int index) {
		if(this.isVacia() || index < 0 || index >= this.getSize() ){
			return null;
		}
		else{ 
			int contador=0;
			Nodo<T> aux= inicial;
				while(contador<index) {
					aux= aux.getSiguiente();
					contador++;	
				}
		return aux;
		}
	}
	
//	 COMENTARIO DE AYUDANTE:SOLEDAD MERINO. Lista getPosicion: si se parametriza la lista,
//	 este método debe recibir un T,
//	 en lugar de un Object. Tener cuidado con el equals, debe llamarse al equals de
//	 aux.getContenido() y no al de lo que recibimos por parámetro,
//	 ya que esto rompería si por parámetro recibimos null.
	
	public int getPosicion(T o){
		int contador = 0;
		
		if (this.isVacia()) {
			contador=  -1;
		}else{
			 Nodo<T> aux = inicial;
			 while (aux!= null){
				 if(aux.getContenido().equals(o)) {
					 contador++;
					 return contador;
				 }
				 aux = aux.getSiguiente();
				 contador++;
			 } 
			 if(aux==null) {
				  contador = -1;
			 } 
		}
		return contador; 
	}
	
	////COMENTARIO DE AYUDANTE:SOLEDAD MERINO.- Lista removePrimerNodo: no debería ser un método público que pueda llamarse desde el main,
	//para eso está el remover por posición.
	

	// COMENTARIO DE LA AYUDANTE SOLEDAD MERINO: -Lista removeNodoPos:
	//cuidado con los cierres de llaves de los condicionales,
	//así cómo está podría salirse de rango porque la verificación por
	//la cantidad de nodos sólo engloba la eliminación del primer nodo.
	
	
	public void removeNodoPos(int pos) {
		if(!this.isVacia() && (pos>=0 && pos<=size)) {
			if(pos==0) {
				inicial = inicial.getSiguiente();
			}else{
				int contador = 0;
				Nodo<T> aux = inicial;
				while (contador < pos-1){
					aux = aux.getSiguiente();
					contador++;
					}
				aux.setSiguiente(aux.getSiguiente().getSiguiente());
			}
		}
		size--;
	}
	
	public void eliminarTodasLasOcurrencias(T valor) {
		if(!isVacia()) {	
			Nodo<T> aux= this.inicial;
			Nodo<T> ant=null;
			while(aux.getContenido().equals(valor)&& aux!=null) {
				this.inicial=inicial.getSiguiente();	
				size--;
				aux=aux.getSiguiente();
			}
			if(aux!=null) { 
				ant=aux;	
				aux=aux.getSiguiente();
			}else {
				inicial=null; 
			}
			while(aux!=null) {
				if(aux.getContenido().equals(valor)) {
					ant.setSiguiente(aux.getSiguiente()); 
					aux=aux.getSiguiente(); 
					this.size--;
				}else {
					ant=aux; 
					aux=aux.getSiguiente();
				}
			}
		}
	}
	
	public int getSize() {
		return size;
	}

	@Override
	public Iterator<T>iterator() {
		return new IteradorNodo();
	}
	


    private class IteradorNodo implements Iterator<T>{
        private int pos;
        public IteradorNodo(){
            pos = 0;
        }

        @Override
        public boolean hasNext() {
        	return getNodo(pos)!=null;
        }

        @Override
        public T next() {
         T siguiente = (T) getNodo(pos).getContenido();
            pos++;
            return siguiente;
        }
    }

	}
	

