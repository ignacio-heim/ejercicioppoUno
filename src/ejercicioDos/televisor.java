package ejercicioDos;

public class televisor extends Objeto {

	private String marca;
	
	private String modelo;
	
	private int pulgadas;
	
	public televisor(String nombre, String categoria, double peso, int alto, int largo, int ancho, String marca, String modelo, int pulgadas) {
		super(nombre, categoria, peso, alto, largo, ancho);
		this.marca=marca;
		this.modelo=modelo;
		this.pulgadas=pulgadas;
	}
	
}
