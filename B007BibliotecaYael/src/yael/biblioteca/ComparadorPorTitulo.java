package yael.biblioteca;

import java.util.Comparator;

public class ComparadorPorTitulo implements Comparator<Libro>{

	@Override
	public int compare(Libro libro1, Libro libro2) {
		return libro1.getTituloCorto().compareTo(libro2.getTituloCorto());
	}
}
