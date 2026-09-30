package gestionflota;

public class MotoEnvios extends Vehiculo {
    public MotoEnvios(String patente, String marca, double costoBaseKm) {
        super(patente, marca, costoBaseKm);
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        return (distanciaKm * costoBaseKm) * 0.85;
    }
}
