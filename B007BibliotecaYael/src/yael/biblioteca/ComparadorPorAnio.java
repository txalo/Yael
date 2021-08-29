package yael.biblioteca;

import java.util.Comparator;

public class ComparadorPorAnio implements Comparator<Libro> {

	@Override
	public int compare(Libro libro1, Libro libro2) {
		return libro1.getAnio().compareTo(libro2.getAnio());
	}

}
