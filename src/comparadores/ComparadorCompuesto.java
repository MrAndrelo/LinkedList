package comparadores;
import java.util.Comparator;
import Universidad.Alumno;


	public class ComparadorCompuesto implements Comparator<Alumno>{
		Comparator<Alumno> c1;
		Comparator<Alumno> c2;
		
		public ComparadorCompuesto(Comparator<Alumno> c1, Comparator<Alumno> c2){
			this.c1 = c1;
			this.c2 = c2;
		}

		@Override
		public int compare(Alumno a1, Alumno a2) {
			int resultado;
			resultado = c1.compare(a1, a2);
				if(resultado == 0);
					c2.compare(a1, a2);
				return resultado;
		}
	}



