package peaje;

public abstract class Vehiculos {
    protected String placa;

    public Vehiculos(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Placa: " + this.placa;
    }

}
