package ejercicio2;

public class testComosicion {
    public static void main(String[] args) {
      
        Motor motor1 = new Motor(3728, 1000);

 
        Automovil autoConMotor = new Automovil("VB742", 5, "Nissan", "Versa", motor1);


        Automovil autoSinMotor = new Automovil("AU398", 3, "Toyota", "Corolla", null);


        System.out.println("información:");
        System.out.println(autoConMotor.toString());

        System.out.println("\ninformación:");
        System.out.println(autoSinMotor.toString());
    }
}



