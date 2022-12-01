package listaVinculada;


import Universidad.Alumno;
import Universidad.ElementoAlumno;
import Universidad.Grupo;
import comparadores.*;

public class Main {
	public static void main(String[] args) {
		
		//a
		
		ComparadorInt  comparadorInteger = new ComparadorInt();
		ListaVinculada<Integer> lista1= new ListaVinculada<Integer>(comparadorInteger);
		lista1.addNodo(10);
		lista1.addNodo(21);
		lista1.addNodo(1);
		lista1.addNodo(5);
		lista1.addNodo(11);
		
		
		//b - recorrer e imprimir Lista
		
		//COMENTARIO DE AYUDANTE:SOLEDAD MERINO. Lista MostrarLista: No se debe imprimir desde el modelo.
		//Al implementar Iterable, la lista permite ser recorrida con
		//un foreach.
		
		for( int elemento: lista1) {
			System.out.println(elemento);
		}
		System.out.println("\n----------------------------------\n");
		
		
		//c- Eliminar el primer elemento de la lista (por posición), luego el elemento “5” y luego
		//el elemento “11” (dado el elemento). Volver a recorrer e imprimir la lista resultante.
		
		//COMENTARIO DE AYUDANTE:SOLEDAD MERINO.El nodo con valor 5 debería eliminarse llamando a eliminar ocurrencias.
		
		lista1.removeNodoPos(0);
		lista1.eliminarTodasLasOcurrencias(5);
		lista1.eliminarTodasLasOcurrencias(11);
		
		for( int elemento: lista1) {
			System.out.println(elemento);
		}
		
		System.out.println("\n----------------------------------\n");
		
		//d - Se crea la lista de strings mostrada en la figura 2 del punto 1, con los valores
		//insertados en el siguiente orden: “Fácil”, “Es”, “Parcial”, “Prog 2”.
		
		ComparadorString comparadorS = new ComparadorString();
		ListaVinculada<String> lista2= new ListaVinculada<String>(comparadorS);
		lista2.addNodo("Fácil");
		lista2.addNodo("Es");
		lista2.addNodo("Parcial");
		lista2.addNodo("Prog2");
		
		//e - Se recorre e imprime la Lista.
		
		for( String elemento: lista2) {
			System.out.println(elemento);
		}
		
		System.out.println("\n----------------------------------\n");
		
		//f - buscar posición según palabra ("Parcial")
		
		System.out.println(lista2.getPosicion("Parcial")); 
		System.out.println("\n----------------------------------\n");
		
		//g - buscar posición según palabra ("Recuperatorio")
		
		System.out.println(lista2.getPosicion("Recuperatorio")); 
		System.out.println("\n----------------------------------\n");
		
		//h - Se cambie el orden de la lista de strings para que los elementos queden ordenados
		//descendentemente.
		
		ComparadorOrdenInverso<String> stringInverso = new ComparadorOrdenInverso<String>(comparadorS);
		lista2.setOrden(stringInverso);
		
		for( String elemento: lista2) {
			System.out.println(elemento);
		}
		
		System.out.println("\n----------------------------------\n");
		
		//i
		
		Alumno john = new Alumno("John", "Doe", 1200000 , 23);
		john.addIntereses("intercambio");
		
		Alumno federico = new Alumno("Federico", "Lopez", 35999888 , 30);
		federico.addIntereses("redes");
		federico.addIntereses("php");
		federico.addIntereses("java");
		federico.addIntereses("Python");
		
		Alumno juana = new Alumno("Juana", "Garcia", 27123455 , 38);
		juana.addIntereses("programacion");
		juana.addIntereses("php");
		juana.addIntereses("java");
		
		Alumno mora = new Alumno("Mora", "Diaz", 37124425 , 26);
		mora.addIntereses("psicologia");
		mora.addIntereses("Freud");
		
		Alumno flora = new Alumno("Flora", "Rivas", 34555111 , 22);
		flora.addIntereses("historia");
		flora.addIntereses("antigua");
		
		Alumno martin = new Alumno("Martin", "Gómez", 34111222 , 33);
		martin.addIntereses("romanos");
		martin.addIntereses("egipcios");
		martin.addIntereses("griegos");
		
		Alumno roman = new Alumno("Román", "Bazán", 32555111 , 35);
		roman.addIntereses("argentina");
		
		Alumno juan = new Alumno("Juan", "Juarez", 33222444 , 34);
		juan.addIntereses("sucesiones");
		juan.addIntereses("álgebra");
		
		Alumno julio = new Alumno("Julio", "Cesar", 33222111 , 35);
		julio.addIntereses("sucesiones");
		julio.addIntereses("algebra");
		
		Alumno bernardino = new Alumno("Bernardino", "Rivas", 30987654 , 41);
		bernardino.addIntereses("matemáticas");
		
		Alumno jose = new Alumno("José", "Paso", 33322112 , 33);
		jose.addIntereses("problemas");
		
		Alumno isaac = new Alumno("Isaac", "Newton", 12343565 , 126);
		isaac.addIntereses("sucesiones");
		
		Grupo unicen = new Grupo("Unicen");
		Grupo exactas = new Grupo("Exactas");
		Grupo humanas = new Grupo("Humanas");
		Grupo historia = new Grupo("Historia");
		Grupo olimpiadas = new Grupo("Olimpíadas Matemáticas");
		Grupo matea2 = new Grupo("Matea2");
		Grupo losFibo = new Grupo("LosFibo");
		
		unicen.addElemento(exactas);
		unicen.addElemento(humanas);
		unicen.addElemento(john);
		exactas.addElemento(federico);
		exactas.addElemento(juana);
		humanas.addElemento(historia);
		humanas.addElemento(mora);
		historia.addElemento(flora);
		historia.addElemento(martin);
		historia.addElemento(roman);
		olimpiadas.addElemento(matea2);
		olimpiadas.addElemento(losFibo);
		matea2.addElemento(juan);
		matea2.addElemento(julio);
		losFibo.addElemento(bernardino);
		losFibo.addElemento(jose);
		losFibo.addElemento(isaac);
		
		ComparadorCantidadAlumnos comparadorAlumnos = new ComparadorCantidadAlumnos();
		ComparadorOrdenInverso<ElementoAlumno> alumnosOrdenInverso = new ComparadorOrdenInverso<ElementoAlumno>(comparadorAlumnos);
		ListaVinculada<ElementoAlumno> listaUniversidad = new ListaVinculada<ElementoAlumno>(alumnosOrdenInverso);
		
		
		listaUniversidad.addNodo(unicen);
		listaUniversidad.addNodo(olimpiadas);
		
		
		for(ElementoAlumno elemento: listaUniversidad)
			System.out.println(elemento.toString());
	}
}
