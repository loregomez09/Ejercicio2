package Principal;

public class Coche extends Vehiculo {

    private String ID;
    private String Transmision; //automatica o manual
    private String Combustible; //Gasolina,diesel,hibrido,electrico
    private String Suspension;//Rigida,SemiRigida,Independiente

    public Coche() {
    }

    public Coche(String marca, String tipo, String modelo, int capacidad, String color, String motor, String ID, String transmision, String combustible, String suspension) {
        super(marca, tipo, modelo, capacidad, color, motor);
        this.ID = ID;
        Transmision = transmision;
        Combustible = combustible;
        Suspension = suspension;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTransmision() {
        return Transmision;
    }

    public void setTransmision(String transmision) {
        Transmision = transmision;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String combustible) {
        Combustible = combustible;
    }

    public String getSuspension() {
        return Suspension;
    }

    public void setSuspension(String suspension) {
        Suspension = suspension;
    }

    @Override
    public String toString() {
        return super.toString()+"Coche{" +
                "ID='" + ID + '\'' +
                ", Transmision='" + Transmision + '\'' +
                ", Combustible='" + Combustible + '\'' +
                ", Suspension='" + Suspension + '\'' +
                '}';
    }
}
