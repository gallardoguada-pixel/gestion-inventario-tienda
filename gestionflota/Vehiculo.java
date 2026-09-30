package gestionflota;

public class Vehiculo {
    protected String patente;
    protected String marca;
    protected double costoBaseKm;

    public Vehiculo(String patente, String marca, double costoBaseKm) {
        this.patente = patente;
        this.marca = marca;
        this.costoBaseKm = costoBaseKm;
    }

    public double calcularCostoViaje(double distanciaKm) {
        return distanciaKm * costoBaseKm;
    }

    public double calcularCostoViaje(double distanciaKm, double peajes) {
        return calcularCostoViaje(distanciaKm) + peajes;
    }

    public void mostrarFicha() {
        System.out.println("------------------------------");
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Costo base por km: $" + costoBaseKm);
        System.out.println("------------------------------");
    }
}
