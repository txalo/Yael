package yael.biblioteca;

public enum Genero {
	INFANTIL(0,"Infantil"), 
	TERROR(1, "Terror"), 
	FANTASIA(2, "Fantasia"), 
	AUTOAYUDA(3, "Autoayuda"), 
	FICCION(4, "Ficcion");
	
	private int id;
	private String descripcion;
	
	private Genero(int id, String desc) {
		this.id = id;
		this.descripcion = desc;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
}
