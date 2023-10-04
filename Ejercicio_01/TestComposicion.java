package asas;
public class TestComposicion {
    public static void main(String[] args) {
        // Crear personas
        Persona persona1 = new Persona(1, "Fabricio", "Miota", 'C');
        Persona persona2 = new Persona(2, "Mackence", "Torres", 'B');
        Persona persona3 = new Persona(3, "Tony", "Quispe", 'E');

        // Mostrar información de las personas
        persona1.getCuenta().depositar(100.0);
        persona2.getCuenta().depositar(10.0);
        persona3.getCuenta().depositar(1.0);

        Persona persona4 = new Persona(1, "Jose", "Quispe");
        Persona persona5 = new Persona(2, "Marcelo", "Quispe");
        Persona persona6 = new Persona(3, "Gallardo", "Quispe");

        persona4.getCuenta().retirar(100.0);
        persona5.getCuenta().retirar(10.0);
        persona6.getCuenta().retirar(1.0);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println("-------------------------------------");
        System.out.println(persona4);
        System.out.println(persona5);
        System.out.println(persona6);
    }
}
