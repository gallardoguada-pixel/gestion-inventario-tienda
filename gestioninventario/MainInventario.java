package gestioninventario;

public class MainInventario {
    public static void main(String[] args) {
        Producto productoUno = new Producto();
        productoUno.nombre = "Teclado";
        productoUno.codigo = "TEC-001";
        productoUno.precio = 25000.0;
        productoUno.stock = 12;

        Producto productoDos = new Producto();
        productoDos.nombre = "Mouse";
        productoDos.codigo = "MOU-002";
        productoDos.precio = 12000.0;
        productoDos.stock = 20;

        Producto productoTres = new Producto();
        productoTres.nombre = "Monitor";
        productoTres.codigo = "MON-003";
        productoTres.precio = 180000.0;
        productoTres.stock = 5;

        System.out.println("=== Operaciones de inventario ===");
        productoUno.venderUnidades(3);
        productoDos.reponerStock(5);
        productoTres.actualizarPrecio(175000.0);

        System.out.println("\n=== Productos independientes ===");
        productoUno.mostrarFicha();
        productoDos.mostrarFicha();
        productoTres.mostrarFicha();

        System.out.println("\n=== Alias de referencia ===");
        Producto copia = productoUno;
        copia.stock = 29;
        System.out.println("Stock de copia: " + copia.stock);
        System.out.println("Stock de productoUno: " + productoUno.stock
                + " (ambas variables apuntan al mismo objeto).");
    }
}
