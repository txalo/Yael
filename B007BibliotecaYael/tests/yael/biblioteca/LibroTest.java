package yael.biblioteca;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class LibroTest {
	Libro libro1, libro2, libro3;
	
	@Before
	public void setUp() {
		libro1 = new Libro ("El principito", "Saint-Exupery, Antoine", Genero.INFANTIL, 1943, 70);								
		libro2 = new Libro ("It", "King, Stephen", Genero.TERROR, 1986, 518);
	}
	
	@Test
	public void queValideQueDosLibrosSonDistintos() {		
		assertFalse(libro1.equals(libro2));		
	}
	
	@Test
	public void queValideQueLibroNoEsIgualANull() {		
		assertFalse(libro1.equals(libro3));		
	}
	
	@Test
	public void queValideQueLibroIgualAOtroConMismoAutorYTitulo() {		
		libro3 = new Libro ("It", "King, Stephen", Genero.TERROR, 1986, 518);
		assertTrue(libro2.equals(libro3));		
	}
	
	@Test
	public void queValideQueLibroIgualAOtroMismaReferencia() {		
		libro3 = libro2;
		assertTrue(libro2.equals(libro3));		
	}
	
	@Test
	public void queCortaLosTitulos() {
		libro3 = new Libro("Como aprender Java sin morir en el intento", "Videla, Lucas", Genero.AUTOAYUDA, 2021, 978);
		assertEquals("Como aprender J", libro3.getTituloCorto());
	}
	
	@Test
	public void queToStringDevuelveAPA() {
		libro3 = new Libro ("El Hobbit", "Tolkien, John Ronald Reuel", Genero.FANTASIA, 1937, 323);
		System.out.println(libro3.toString());
		System.out.println(libro3.hashCode());	
	}

	@Test
	public void queCompara() {
		libro1 = new Libro ("El principito", "Saint-Exupery, Antoine", Genero.INFANTIL, 1943, 70);								
		libro2 = new Libro ("It", "King, Stephen", Genero.TERROR, 1986, 518);
		
		assertTrue(libro2.compareTo(libro1) > 0);
		assertTrue(libro1.compareTo(libro2) < 0);
		
	}
	
	@Test
	public void queDevuelveTituloNormalizado() {
		libro1 = new Libro ("El principito", "Saint-Exupery, Antoine", Genero.INFANTIL, 1943, 70);
		System.out.println("Normalizado: " + libro1.getTituloNormalizado());
		assertEquals("principito, El", libro1.getTituloNormalizado());
		
	}
	
}
