package ejerciciouno;

public class sueldoEmpleado {

	//ATRIBUTOS
	private String nombre;
	
	private String categoria;
	
	private double sueldoNeto;
	
	private int diasAusensia;
	
	private String bonoResultado;
	
	private double sueldoTotal;
	
	//METODO CONSTRUCTOR
	public sueldoEmpleado(String nombre,String categoria, int diasAusensia, String bonoResultado) {
		this.nombre =nombre;
		this.categoria = categoria;
		this.diasAusensia = diasAusensia;
		this.bonoResultado = bonoResultado;
	}
	
	//GETTER
	public String getNombre() {
		return nombre;
	}
	
	//SETTER
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//GETTER
	public String getCategoria() {
		return categoria;
	}
	
	//SETTER
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	//GETTER
	public double getSueldoNeto() {
		return sueldoNeto;
	}
	
	//SETTER
	public void setSuledoNeto(String cat) {
		if (cat.equalsIgnoreCase("gerente")) {
			sueldoNeto = 1500;
			sueldoTotal = sueldoNeto;
		} else {
			sueldoNeto = 1000;
			sueldoTotal = sueldoNeto;
		}
	}
	
	// GETTER
	public int getDiasAusensia() {
		return this.diasAusensia;
	}
	
	//GETTER
	public String getBonoResultado () {
		return this.bonoResultado;
	}
	
	// SETTER
	public void setBonoPresentismo(int dia) {
		double monto;
		switch (dia) {
		case 1:
			monto=50;
			sueldoTotal=sueldoTotal+monto;
			break;
		case 0:
			monto=100;
			sueldoTotal=sueldoTotal+monto;
			break;
		default:
			monto=0;
			sueldoNeto=sueldoTotal+monto;
			break;
		}
	}
	
	//SETTER 
	public void setBonoResultado(String rendimiento) {
		double aux;
		if (rendimiento.equalsIgnoreCase("excede")) {
			aux =sueldoNeto*0.1;
			sueldoTotal=sueldoTotal+aux;
		} else if (rendimiento.equalsIgnoreCase("cumple")) {
			aux=80;
			sueldoTotal=sueldoTotal+aux;
		} else {
			sueldoTotal+=0;
		}
		
	}
	
	//GETTER
	public double getSueldoTotal() {
		return this.sueldoTotal;
	}
	
	
}
