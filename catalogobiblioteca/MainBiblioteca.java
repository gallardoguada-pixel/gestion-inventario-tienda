package catalogobiblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        // new Libro(); // No compila: al declarar constructores propios, ya no existe el constructor sin argumentos.

        Libro libro1 = new Libro(
                "El principito", "Antoine de Saint-Exupéry", "978-0156012195");
        Libro libro2 = new Libro(
                "Cien años de soledad", "Gabriel García Márquez", "978-0307474728", 2, 22000.0);
        Libro libro3 = new Libro(
                "", "Jorge Luis Borges", "978-0802130303", 1, 18000.0);

        System.out.println("\n=== Validación del título ===");
        System.out.println("Título usado: " + libro3.getTitulo());

        System.out.println("\n=== Validación del precio de reposición ===");
        double precioAnterior = libro2.getPrecioReposicion();
        boolean precioActualizado = libro2.setPrecioReposicion(-500.0);
        System.out.println("¿Se aceptó el precio inválido? " + precioActualizado);
        System.out.println("Precio conservado: $" + libro2.getPrecioReposicion()
                + " (anterior: $" + precioAnterior + ").");

        System.out.println("\n=== Préstamos y devolución ===");
        boolean primerPrestamo = libro1.prestar();
        System.out.println("Resultado del primer préstamo: " + primerPrestamo);
        boolean prestamoSinCopias = libro1.prestar();
        System.out.println("Resultado del préstamo sin copias: " + prestamoSinCopias);
        System.out.println("Copias después del intento fallido: " + libro1.getCopiasDisponibles());
        libro1.devolver();
        boolean segundoPrestamo = libro1.prestar();
        System.out.println("Resultado del préstamo después de devolver: " + segundoPrestamo);

        System.out.println("\n=== Fichas del catálogo ===");
        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();
    }
}
