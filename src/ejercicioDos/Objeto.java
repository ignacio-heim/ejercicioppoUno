package ejercicioDos;

public class Objeto {
	
	private String nombre;
	
	private String categoria;
	
	private double peso;
	
	private int alto;
	
	private int largo;
	
	private int ancho;

	public Objeto(String nombre, String categoria, double peso, int alto, int largo, int ancho) {
		
		this.nombre = nombre;
		this.categoria = categoria;
		this.peso = peso;
		this.alto = alto;
		this.largo = largo;
		this.ancho = ancho;
	}
	
	// GETTER
	public String getNombre() {
		return this.nombre;
	}
	
	// SETTER
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// GETTER
	public String getCategoria() {
		return this.categoria;		
	}
	
	// SETTER 
	public void setCategoria(String categoria) {
		this.categoria=categoria;
	}
	
	//GETTER
	public double getPeso() {
		return this.peso;
	}
	
	//SETTER
	public void setPeos(double peso) {
		this.peso=peso;
	}
	
	//GETTER 
	public int getAlto() {
		return this.alto;
	}
	
	// SETTER 
	public void setAlto(int alto) {
		this.alto=alto;
	}
	
	// GETTER
	public int getLargo() {
		return this.largo;
	}
	
	// SETTER
	public void setLargo(int largo) {
		this.largo=largo;
	}
	
	// GETTER
	public int getAncho() {
		return this.ancho;
	}
	
	// SETTER 
	public void setAncho(int ancho) {
		this.ancho=ancho;
	}
	
}
