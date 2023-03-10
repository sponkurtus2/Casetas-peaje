package peaje;

import java.util.ArrayList;

import javax.swing.text.View;

public class Caseta {
    private String nombre;
    private String dpto;
    private int totalMoto, totalCamiones, totalCarros;
 
    //private Vehiculos vehiculos; NO SE USA, LO PUSO DE EJEMPLO

    private ArrayList<Vehiculos> vehiculos;
    //Al array le pedimos que guarde cualquier tipo de "Vehiculos". 
    
    public Caseta(){
        this("Sacramento", "Chihuahua");
        /* this.nombre = "Sacramento";
        this.dpto = "Chihuahua";
        this.totalCamiones = 0;
        this.totalCarros = 0;
        this.totalMoto = 0;

        this.vehiculos = new ArrayList<>(); 
        */
    }
 
    public Caseta(String nombre, String dpto) {
        this.nombre = nombre;
        this.dpto = dpto;
        this.totalCamiones = 0;
        this.totalCarros = 0;
        this.totalMoto = 0;
        this.vehiculos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public int getTotalMoto() {
        return totalMoto;
    }

    public void setTotalMoto(int totalMoto) {
        this.totalMoto = totalMoto;
    }

    public int getTotalCamiones() {
        return totalCamiones;
    }

    public void setTotalCamiones(int totalCamiones) {
        this.totalCamiones = totalCamiones;
    }

    public int getTotalCarros() {
        return totalCarros;
    }

    public void setTotalCarros(int totalCarros) {
        this.totalCarros = totalCarros;
    }

    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }


    public void agregarVehiculo(Vehiculos v) {
        vehiculos.add(v);

        if (v instanceof Moto) totalMoto++;

        if (v instanceof Camion) totalCamiones++;

        if (v instanceof Carro) totalCarros++;
    }

    public int calcularPeaje(Vehiculos vehiculos) {
        return 0;
    }

    private double calcularPeaje() {
        return 0;
    }

    @Override
    public String toString() {
        return "Caseta: " + getNombre() + "\n se acumulo un total de: " + calcularPeaje() +
        "\n total de vehiculos: " + vehiculos.size() + 
        "\n , Lista de vehiculos: " + vehiculos.toString();
    }

    

}
