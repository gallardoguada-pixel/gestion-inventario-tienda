package catalogobiblioteca;

public class Libro {
    private static final String TITULO_POR_DEFECTO = "Sin título";
    private static final String AUTOR_POR_DEFECTO = "Autor desconocido";
    private static final String ISBN_POR_DEFECTO = "ISBN pendiente";
    private static final int COPIAS_POR_DEFECTO = 0;
    private static final double PRECIO_REPOSICION_POR_DEFECTO = 15000.0;

    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;

    public Libro(String titulo, String autor, String isbn, int copiasDisponibles,
                 double precioReposicion) {
        if (titulo == null || titulo.isBlank()) {
            System.out.println("Título rechazado: no puede ser nulo ni estar en blanco.");
            this.titulo = TITULO_POR_DEFECTO;
        } else {
            this.titulo = titulo;
        }

        if (autor == null || autor.isBlank()) {
            System.out.println("Autor rechazado: no puede ser nulo ni estar en blanco.");
            this.autor = AUTOR_POR_DEFECTO;
        } else {
            this.autor = autor;
        }

        if (isbn == null || isbn.isBlank()) {
            System.out.println("ISBN rechazado: no puede ser nulo ni estar en blanco.");
            this.isbn = ISBN_POR_DEFECTO;
        } else {
            this.isbn = isbn;
        }

        if (copiasDisponibles < 0) {
            System.out.println("Copias rechazadas: la cantidad no puede ser negativa.");
            this.copiasDisponibles = COPIAS_POR_DEFECTO;
        } else {
            this.copiasDisponibles = copiasDisponibles;
        }

        if (esPrecioReposicionValido(precioReposicion)) {
            this.precioReposicion = precioReposicion;
        } else {
            System.out.println("Precio de reposición rechazado: debe ser mayor a cero.");
            this.precioReposicion = PRECIO_REPOSICION_POR_DEFECTO;
        }
    }

    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 1, PRECIO_REPOSICION_POR_DEFECTO);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    public boolean prestar() {
        if (copiasDisponibles <= 0) {
            System.out.println("No se puede prestar \"" + titulo + "\": no hay copias disponibles.");
            return false;
        }

        copiasDisponibles--;
        System.out.println("Préstamo realizado: \"" + titulo + "\". Copias disponibles: "
                + copiasDisponibles + ".");
        return true;
    }

    public void devolver() {
        copiasDisponibles++;
        System.out.println("Devolución registrada: \"" + titulo + "\". Copias disponibles: "
                + copiasDisponibles + ".");
    }

    public boolean setPrecioReposicion(double precio) {
        if (!esPrecioReposicionValido(precio)) {
            System.out.println("Precio de reposición rechazado: debe ser mayor a cero.");
            return false;
        }

        precioReposicion = precio;
        System.out.println("Precio de reposición actualizado para \"" + titulo + "\": $"
                + precioReposicion + ".");
        return true;
    }

    public void mostrarFicha() {
        System.out.println("------------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Copias disponibles: " + copiasDisponibles);
        System.out.println("Precio de reposición: $" + precioReposicion);
        System.out.println("------------------------------");
    }

    private static boolean esPrecioReposicionValido(double precio) {
        return Double.isFinite(precio) && precio > 0;
    }
}
