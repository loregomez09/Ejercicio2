package Principal;

public class Vehiculo {

    private String Marca;
    private String Tipo;
    private String Modelo;
    private int Capacidad;
    private String Color;
    private String Motor;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String tipo, String modelo, int capacidad, String color, String motor) {
        Marca = marca;
        Tipo = tipo;
        Modelo = modelo;
        Capacidad = capacidad;
        Color = color;
        Motor = motor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Marca='" + Marca + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Capacidad=" + Capacidad +
                ", Color='" + Color + '\'' +
                ", Motor='" + Motor + '\'' +
                '}';
    }
}
