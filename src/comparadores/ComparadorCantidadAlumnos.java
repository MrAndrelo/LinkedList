package comparadores;
import java.util.Comparator;
import Universidad.ElementoAlumno;
 

//- COMENTARIO DE AYUDANTE:SOLEDAD MERINO.Comparadores: no es necesario
//declarar variables auxiliares dentro del compare e igualarlas a lo que se
//recibe por parámetro.


	public class ComparadorCantidadAlumnos implements Comparator<ElementoAlumno> {

		@Override
		public int compare(ElementoAlumno a1, ElementoAlumno a2) {
			
			return a1.getCantidadAlumnos()-a2.getCantidadAlumnos();
		}

	}
