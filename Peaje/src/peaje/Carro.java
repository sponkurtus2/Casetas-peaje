package peaje;

public class Carro extends Vehiculos {

    public Carro(String placa) {
        super(placa);
        //TODO Auto-generated constructor stub
    }

    public double getPeaje() {
        return Constantes.P_CARRO;
    }
    
    @Override
    public String toString() {
        return "Carro: " + super.toString();
    }
  

}
