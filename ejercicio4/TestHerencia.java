package ejercicio4;

public class TestHerencia {

    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado("Juan Perez", 28339187, 5, 3500.0);
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Rocio Fernandez", 35289129, 10, 4000.0, "tarde");
        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Deny Cruz", 2718935, 0, 3800.0, "centro", null);

        System.out.println("El nombre del empleado 1 es: " + empleado1.getNombre());
        System.out.println("El salario base del empleado 1 es: " + empleado1.getSalarioBase());
        System.out.println("Los dias de vacaciones del empleado 1 es: " + empleado1.getDiasVacaciones());
        System.out.println("La nómina del empleado 1 es: " + empleado1.calcularNomina());
        System.out.println();


        System.out.println("El nombre del empleado 2 es: " + empleado2.getNombre());
        System.out.println("El turno del empleado 2 es: " + empleado2.getTurno());
        System.out.println("Los dias de vacaciones del empleado 2 es: " + empleado2.getDiasVacaciones());
        System.out.println("La nómina del empleado 2 es: " + empleado2.calcularNomina());
        System.out.println();

        System.out.println("El nombre del empleado 3 es: " + empleado3.getNombre());
        System.out.println("La zona del empleado 3 es: " + empleado3.getZona());
        System.out.println("Los dias de vacaciones del empleado 3 es: " + empleado3.getDiasVacaciones());
        System.out.println("La nómina del empleado 3 es: " + empleado3.calcularNomina());
    }
}
