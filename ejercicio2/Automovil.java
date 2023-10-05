package ejercicio2;

public class Automovil {
    private String placa;
    private int numPuerta;
    private String marca;
    private String modelo;
    private Motor motor;

    public Automovil(String placa, int num, String marca, String modelo, Motor motor) {
        this.placa = placa;
        this.numPuerta = num;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPuerta() {
        return numPuerta;
    }

    public void setNumPuerta(int numPuerta) {
        this.numPuerta = numPuerta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        if (motor != null) {
            return "Automovil con motor;    Placa: " + placa + ",   No. Puertas: " + numPuerta + ",   Marca: " + marca +
                    ",   Modelo: " + modelo + ",  " + motor.toString();
        } else {
            return "Automovil sin motor;    Placa: " + placa + ",   No. Puertas: " + numPuerta + ",   Marca: " + marca +
                    ",   Modelo: " + modelo;
        }
    }
}

