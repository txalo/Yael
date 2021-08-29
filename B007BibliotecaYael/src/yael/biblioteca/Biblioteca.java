package yael.biblioteca;

import java.util.Arrays;

public class Biblioteca {
	private Libro[] libros;
	
	public Biblioteca (Libro[] libros) {
		this.libros = libros;
	}
	
	public int[] librosPorGenero() {
		
		int[] totalPorGenero = new int[Genero.values().length];
		for(Libro l : libros)
			totalPorGenero[l.getGenero().getID()] ++;
		return totalPorGenero;
	}
	
	public Libro[] ordenarPorCantidadDePaginas() {
		Arrays.sort(this.libros);
		return this.libros;
	}
	
	public Libro[] ordenarPorAutor() {
		Arrays.sort(this.libros, new ComparadorPorApellido());
		return this.libros;
	}
	
	public Libro[] ordenarPorTitulo() {
		Arrays.sort(this.libros, new ComparadorPorTitulo());
		return this.libros;
	}
}
