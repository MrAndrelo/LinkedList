package comparadores;
import java.util.Comparator;
import Universidad.Alumno;

//- COMENTARIO DE AYUDANTE:SOLEDAD MERINO.Comparadores: no es necesario
//declarar variables auxiliares dentro del compare e igualarlas a lo que se
//recibe por parámetro.


	public class ComparadorNombre implements Comparator<Alumno> {

		@Override
		public int compare(Alumno a1, Alumno a2) {
			return a1.getNombre().compareTo(a2.getNombre());
		}

	}
