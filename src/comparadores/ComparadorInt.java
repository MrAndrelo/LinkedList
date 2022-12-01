package comparadores;

import java.util.Comparator;

//- COMENTARIO DE AYUDANTE:SOLEDAD MERINO.Comparadores: no es necesario
//declarar variables auxiliares dentro del compare e igualarlas a lo que se
//recibe por parámetro.


public class ComparadorInt implements Comparator<Integer>{

	
	
	@Override
	public int compare(Integer a,Integer b) {
    	return a.compareTo(b);    	
    }
	
}