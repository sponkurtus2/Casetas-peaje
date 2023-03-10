package peaje;

public class Camion extends Vehiculos{
    private int num_ejes;

    public int getNum_ejes() {
        return num_ejes;
    }
 

    public Camion(String placa) {
        super(placa);
        this.num_ejes = 2;
    }

    public Camion(String placa, int num_ejes) {
        super(placa);
        this.num_ejes = num_ejes;
    }

    public double getPeaje() {
        return Constantes.P_CAMION * num_ejes;
    }

    @Override
    public String toString() {
        return "Camion: " + super.toString() + ", con " + getNum_ejes() + " ejes.";
    }
    
}
