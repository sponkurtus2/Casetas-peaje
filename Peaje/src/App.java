import peaje.*;

public class App {
    public static void main(String[] args) throws Exception {
        Caseta sacramento = new Caseta();

        sacramento.agregarVehiculo(new Carro("1122-AB"));
        
        sacramento.agregarVehiculo(new Camion("2211-BA", 8));

        sacramento.agregarVehiculo(new Moto("12-AB"));


    }
}
