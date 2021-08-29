package yael.biblioteca;

import java.util.Comparator;

public class ComparadorPorApellido implements Comparator<Libro> {

	@Override
	public int compare(Libro libro1, Libro libro2) {
		return libro1.getApellidoAutor().compareTo(libro2.getApellidoAutor());
	}

}
