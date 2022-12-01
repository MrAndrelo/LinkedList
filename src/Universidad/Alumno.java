package Universidad;

import java.util.ArrayList;



//- COMENTARIO DE AYUDANTE:SOLEDAD MERINO.
//Alumno: no debe implementar Comparable.
//No controla repetidos en la lista de intereses.

public class Alumno extends ElementoAlumno{
	private String apellido;
	private int dni,edad;
	private ArrayList<String> intereses;
	
	public Alumno (String apellido, String nombre, int dni, int edad){
		super(nombre);
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		intereses = new ArrayList<String>();		
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void addIntereses(String interes) {
		this.intereses.add(interes);
	}
	
	
	public boolean equals(Object o) {
		try {
			return (this.getApellido().equals(((Alumno) o).getApellido()) && 
					this.getNombre().equals(((ElementoAlumno) o).getNombre()));
		} catch (Exception e) {
			return false;
		}
	}
	
	
	@Override
	public int getCantidadAlumnos() {
		return 1;
	}
	
	 public String toString() {
	        return "nombre: " + this.getNombre() + ", apellido: "+ this.getApellido();
	 }

	
	

}
