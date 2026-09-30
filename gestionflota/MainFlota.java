package gestionflota;

public class MainFlota {
    public static void main(String[] args) {
        Vehiculo[] flota = new Vehiculo[3];
        flota[0] = new Camion("AA123BB", "Volvo", 1200.0, 20.0);
        flota[1] = new Furgoneta("AC456DE", "Mercedes-Benz", 850.0, true);
        flota[2] = new MotoEnvios("AE789FG", "Honda", 300.0);

        double costoTotal = 0;

        for (Vehiculo v : flota) {
            v.mostrarFicha();
            double costoViaje = v.calcularCostoViaje(150.0);
            System.out.println("Costo del viaje: $" + costoViaje);
            costoTotal += costoViaje;
        }

        System.out.println("------------------------------");
        System.out.println("Costo total de la flota: $" + costoTotal);
    }
}
