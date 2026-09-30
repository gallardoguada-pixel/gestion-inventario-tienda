package gestionflota;

public class Camion extends Vehiculo {
    private double capacidadToneladas;

    public Camion(String patente, String marca, double costoBaseKm, double capacidadToneladas) {
        super(patente, marca, costoBaseKm);
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        return (distanciaKm * costoBaseKm) * (1 + capacidadToneladas * 0.05);
    }
}
