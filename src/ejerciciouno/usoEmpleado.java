package ejerciciouno;

public class usoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sueldoEmpleado empleado1 = new sueldoEmpleado("Nacho", "gerente",0,"excede");
		
		empleado1.setSuledoNeto(empleado1.getCategoria());
		
		System.out.println(empleado1.getSueldoTotal());
		
		empleado1.setBonoPresentismo(empleado1.getDiasAusensia());
		
		System.out.println(empleado1.getSueldoTotal());
		
		empleado1.setBonoResultado(empleado1.getBonoResultado());
		
		
		System.out.println(empleado1.getSueldoTotal());
		
	}

}
