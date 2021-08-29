package yael.biblioteca;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class ComparadoresTests {

	private Libro[] biblioteca = {
			new Libro ("El principito", "Saint-Exupery, Antoine", Genero.INFANTIL, 1943, 70),
			new Libro ("It", "King, Stephen", Genero.TERROR, 1986, 518),
			new Libro ("El Hobbit", "Tolkien, John Ronald Reuel", Genero.FANTASIA, 1937, 310),
			new Libro ("Todo lo que nunca fuimos", "Kellen, Alice", Genero.FICCION, 2020, 323),
			new Libro ("Una familia anormal y el cruce de los universos", "Vallejos, Lyna", Genero.INFANTIL, 2019, 128),
			new Libro ("El resplandor", "King, Stephen", Genero.TERROR, 1977, 619),
			new Libro ("Codigo limpio", "Martin, Robert", Genero.FANTASIA, 1977, 464), 
			new Libro ("Como aprender Java sin morir en el intento", "Videla, Lucas", Genero.AUTOAYUDA, 2021, 978)
	};
	
	@Test
	public void queOrdenaPorApellido() {
		
		Arrays.sort(biblioteca, new ComparadorPorApellido());
		
		assertEquals("Kellen", biblioteca[0].getApellidoAutor());
		assertEquals("Tolkien", biblioteca[5].getApellidoAutor());
	}
	
	@Test
	public void queOrdenaPorTitulo() {
		
		Arrays.sort(biblioteca, new ComparadorPorTitulo());
		
		assertEquals("Codigo limpio", biblioteca[0].getTitulo());
		assertEquals("El resplandor", biblioteca[4].getTitulo());
		
	}
	
	@Test
	public void queOrdenaPorAnio() {
		
		Arrays.sort(biblioteca, new ComparadorPorAnio());
		
		assertEquals(1937, (int) biblioteca[0].getAnio());
		assertEquals(1986, (int) biblioteca[4].getAnio());

	}
	
	@Test
	public void queOrdenaPorTituloNormalizado() {
		
		Arrays.sort(biblioteca, new ComparadorPorTituloNormalizado());
		
		assertEquals("Codigo limpio", biblioteca[0].getTituloNormalizado());
		assertEquals("principito, El", biblioteca[4].getTituloNormalizado());
	}
	
	

}
