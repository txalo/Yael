package yael.biblioteca;

import java.util.Comparator;

public class ComparadorPorTituloNormalizado implements Comparator<Libro> {

	@Override
	public int compare(Libro libro1, Libro libro2) {
		return libro1.getTituloNormalizado().toLowerCase().compareTo(libro2.getTituloNormalizado().toLowerCase());
	}

}
