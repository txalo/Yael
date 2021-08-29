package yael.biblioteca;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class BibliotecaTest {

	Biblioteca biblio;
	
	@Before
	public void setUp() {
		Libro[] libros = {
				new Libro ("El principito", "Saint-Exupery, Antoine", Genero.INFANTIL, 1943, 70),
				new Libro ("It", "King, Stephen", Genero.TERROR, 1986, 518),
				new Libro ("El Hobbit", "Tolkien, John Ronald Reuel", Genero.FANTASIA, 1937, 310),
				new Libro ("TODO LO QUE NUNCA FUIMOS", "Kellen, Alice", Genero.FICCION, 2020, 323),
				new Libro ("UNA FAMILIA ANORMAL Y EL CRUCE DE LOS UNIVERSOS", "Vallejos, Lyna", Genero.INFANTIL, 2019, 28),
				new Libro ("El Resplandor", "King, Stephen", Genero.TERROR, 1977, 619),
				new Libro ("Codigo Limpio", "Martin, Robert", Genero.FANTASIA, 1977, 464), 
				new Libro ("Como aprender Java sin morir en el intento", "Videla, Lucas", Genero.AUTOAYUDA, 2021, 978)
		};
		biblio = new Biblioteca(libros);
	}
	
	@Test
	public void queCreaUnaBiblioteca() {
		assertNotNull(biblio);
	}
	
	@Test
	public void queCuentaPorGenero() {
		int[] esperado = {2,2,2,1,1};
		assertArrayEquals(esperado, biblio.librosPorGenero());
	}
	
	@Test
	public void queOrdenaPorPaginas() {
		System.out.println("Pag " + Arrays.toString(biblio.ordenarPorCantidadDePaginas()));
	}
	
	@Test
	public void queOrdenaPorAutor() {
		System.out.println("Autor " + Arrays.toString(biblio.ordenarPorAutor()));
	}
	
	@Test
	public void queOrdenaPorTitulo(){
		System.out.println("Titulo " + Arrays.toString(biblio.ordenarPorTitulo()));
	}
	
	

}
