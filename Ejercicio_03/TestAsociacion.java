package aaaaaaaa;

public class TestAsociacion {

    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");

        Persona persona1 = new Persona(1, "Fabricio", "Miota", 'C');
        Persona persona2 = new Persona(2, "Mackence", "Torres", 'B');
        Persona persona3 = new Persona(3, "Tony", "Quispe", 'E');

        bcp.agregarCliente(persona1);
        bcp.agregarCliente(persona2);
        bcp.agregarCliente(persona3);

        bcp.darBajaCliente(persona1);

        bcp.clientesTipo('C');

        bcp.buscarCliente(persona3);
    }
}