package ejercicio4;


public class EmpleadoDistribucion extends Asalariado{
	private String zona;
	
	public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, double salarioBase, String region, String zona) {
		super(nombre, dni, diasVacaciones, salarioBase);
		this.zona = zona;
	}
	
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public double calcularNomina() {
		return getSalarioBase() * 1.10;
	}
	

}