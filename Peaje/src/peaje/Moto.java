package peaje;

public class Moto extends Vehiculos {

    public Moto(String placa) {
        super(placa);
    }

    public double getPeaje() {
        return Constantes.P_MOTO;
    }
    
    @Override
    public String toString() {
        return "Moto: " + super.toString();
    }
}
