package yael.biblioteca;

import java.util.Objects;

public class Libro implements Comparable<Libro>, Cloneable {
	
	
	private String titulo;
	private String autor;
	@SuppressWarnings("unused")
	private Genero genero;
	private int anio;
	@SuppressWarnings("unused")
	private int paginas;
	private static final int LARGO_DETERMINADO = 15;
	

	public Libro(String titulo, String autor, Genero genero, int anio, int paginas) {
		this.titulo = titulo;
		this.autor = autor; 
		this.genero = genero; 
		this.anio = anio; 
		this.paginas = paginas;
	}
	
	public Integer getAnio() {
		return anio;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTituloCorto(){		
		return (titulo.length() <= LARGO_DETERMINADO) ? this.titulo : titulo.substring(0, LARGO_DETERMINADO);
	}
	
	public String getTituloNormalizado() {
		String[] articulos = {"el", "la", "lo", "los", "las"};
		Boolean tieneArticulo = false;
		String primeraPalabra = getTitulo().split(" ")[0];
		
		for (String art : articulos) {
		
			if ((primeraPalabra.toLowerCase()).equals(art)) {	
				tieneArticulo = true;
				break;
			}
		}
		if (tieneArticulo) {
			String tituloNormalizado = this.titulo.replaceFirst(primeraPalabra, "") + ", " + primeraPalabra; 
			return tituloNormalizado.strip();			
		}
			
		return this.titulo;
	}
	
	public String getApellidoAutor() {
		return this.autor.split(",")[0];
	}
	
	public Genero getGenero() {
		return this.genero;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(autor, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
	}
	
	/*@Override
	public boolean equals(Object otro) {
		if (this == otro)
			return true;
		if (otro == null)
			return false;
		if (getClass() != otro.getClass())
			return false;
		Libro castOtro = (Libro) otro;
		if (this.titulo != castOtro.titulo)
			return false;
		if (this.autor != castOtro.autor)
			return false;
		return true;
		
	}*/
	
	@Override
	public String toString() {
		//Formato APA: "King, S. (1986). It"
		String apellidos = this.autor
							.split(",")[0];
		String[] nombres =  this.autor
							.split(",")[1]
							.trim()
							.split(" ");
		String iniciales = "";
		for (String nombre : nombres)
			iniciales = iniciales + nombre.substring(0, 1).toUpperCase() + ". ";
		String APA = apellidos
					+", " + iniciales
					+"(" + this.anio + "). "
					+this.titulo;// + "\n";
		return APA;
	}

	@Override
	public int compareTo(Libro otro) {
		return this.paginas - otro.paginas;
	}
	
	
	
	@Override
	public Libro clone() throws CloneNotSupportedException {
		return (Libro) super.clone();
	}
	

}
