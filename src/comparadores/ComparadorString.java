package comparadores;

import java.util.Comparator;

//- COMENTARIO DE AYUDANTE:SOLEDAD MERINO.Comparadores: no es necesario
//declarar variables auxiliares dentro del compare e igualarlas a lo que se
//recibe por parámetro.

public class ComparadorString implements Comparator<String> {
		
		@Override
		public int compare(String a, String b) {
	    	return a.compareTo(b);    	
	    }
		
	}


