package Universidad;


public abstract class ElementoAlumno {
	
	protected String nombre;
	
	public ElementoAlumno(String name) {
		this.nombre=name;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int getCantidadAlumnos();

}
