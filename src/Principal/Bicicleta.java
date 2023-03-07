package Principal;

public class Bicicleta extends Vehiculo{

    private int ID;
    private int llantas;
    private int Relacion; //numero de piñones del plato
    private String Cambios; //Hidraulicos,Electronicos,Mecanicos
    private String Freno; //Disco o Rin
    private String Suspension; //Hidraulica, aire

    public Bicicleta() {
    }

    public Bicicleta(String marca, String tipo, String modelo, int capacidad, String color, String motor, int ID, int llantas, int relacion, String cambios, String freno, String suspension) {
        super(marca, tipo, modelo, capacidad, color, motor);
        this.ID = ID;
        this.llantas = llantas;
        Relacion = relacion;
        Cambios = cambios;
        Freno = freno;
        Suspension = suspension;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getRelacion() {
        return Relacion;
    }

    public void setRelacion(int relacion) {
        Relacion = relacion;
    }

    public String getCambios() {
        return Cambios;
    }

    public void setCambios(String cambios) {
        Cambios = cambios;
    }

    public String getFreno() {
        return Freno;
    }

    public void setFreno(String freno) {
        Freno = freno;
    }

    public String getSuspension() {
        return Suspension;
    }

    public void setSuspension(String suspension) {
        Suspension = suspension;
    }

    @Override
    public String toString() {
        return super.toString()+"Bicicleta{" +
                "ID=" + ID +
                ", llantas=" + llantas +
                ", Relacion=" + Relacion +
                ", Cambios='" + Cambios + '\'' +
                ", Freno='" + Freno + '\'' +
                ", Suspension='" + Suspension + '\'' +
                '}';
    }
}
