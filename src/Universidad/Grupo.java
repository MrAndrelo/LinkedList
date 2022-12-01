package Universidad;

import java.util.ArrayList;



public class Grupo extends ElementoAlumno{
	
	private ArrayList<ElementoAlumno> grupos;
	
	public Grupo(String nombre) {
		super(nombre);
		grupos = new ArrayList<>();
	}
	
	public ArrayList<ElementoAlumno> getGrupos() {
		ArrayList<ElementoAlumno> copiaGrupos = new ArrayList<>();
		copiaGrupos.addAll(grupos);
		return copiaGrupos;
	}

	public void addToGrupos(ElementoAlumno elem) {
		grupos.add(elem);
	}

	
	public void addElemento(ElementoAlumno elemento) {
		if (!this.grupos.contains(elemento))
			this.grupos.add(elemento);
	}
		
    
//	COMENTARIO DE AYUDANTE:SOLEDAD MERINO.Grupo: en el equals,
//	siempre el this primero para evitar errores
//	(NullPointerException si lo recibido por parámetro es null). 
//	Controlar esto aunque esté dentro del try-catch.
//	 
	@Override
	public boolean equals(Object o) {
		try {
			return this.getNombre().equals(((ElementoAlumno) o).getNombre());
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public int getCantidadAlumnos() {
		int contador = 0;
		for(ElementoAlumno e: grupos)
			contador += e.getCantidadAlumnos();
		return contador;
	}
	
	public String toString() {
        return this.getNombre()  + ", " + this.getCantidadAlumnos();
    }
	
	
	
}


