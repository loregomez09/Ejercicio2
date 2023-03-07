package Principal;
import java.util.Scanner;
public class Principal {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Coche car1 = new Coche("BMW","sedan","2022",5,"Gris","2400I","12345677890","Automatico","Hibrido","Semi Rigida");
        Bicicleta bici1 = new Bicicleta("Especialized","Ruta","S-works parmac",1,"Negro","0",100324276,2,52-36,"Electricos","Mecanico","Rigida");
        Vehiculo veh1 = new Vehiculo();
        System.out.println(car1.toString());
        System.out.println(bici1.getCambios());
        System.out.println(bici1.toString());


        veh1.setMarca("Renault");
        veh1.setTipo("coupe");
        veh1.setModelo("2011");
        veh1.setCapacidad(5);
        veh1.setColor("Rojo");
        veh1.setMotor("1200");
        System.out.println(veh1.toString());

    }



}
