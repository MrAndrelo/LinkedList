package comparadores;

import java.util.Comparator;


public class ComparadorOrdenInverso<T> implements Comparator<T> {
	private Comparator<T> comp;
	
	public ComparadorOrdenInverso(Comparator<T> comp) {
		this.comp=comp;
	}

	@Override
	public int compare(T o1, T o2) {
		return (comp.compare(o1, o2) * (-1));
	}
}