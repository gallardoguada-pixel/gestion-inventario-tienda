package gestioninventario;

public class Producto {
    public String nombre;
    public String codigo;
    public double precio;
    public int stock;

    public void venderUnidades(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a vender debe ser mayor a cero.");
        } else if (cantidad > stock) {
            System.out.println("Error: no hay stock suficiente de " + nombre
                    + ". Disponible: " + stock + ", solicitado: " + cantidad + ".");
        } else {
            stock -= cantidad;
            System.out.println("Venta exitosa: " + cantidad + " unidad(es) de "
                    + nombre + ". Stock restante: " + stock + ".");
        }
    }

    public void reponerStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a reponer debe ser mayor a cero.");
        } else {
            stock += cantidad;
            System.out.println("Reposicion confirmada: " + cantidad + " unidad(es) de "
                    + nombre + ". Stock actual: " + stock + ".");
        }
    }

    public void actualizarPrecio(double precio) {
        double precioAnterior = this.precio;
        this.precio = precio;
        System.out.println("Precio de " + nombre + " actualizado: $"
                + precioAnterior + " -> $" + this.precio + ".");
    }

    public void mostrarFicha() {
        System.out.println("------------------------------");
        System.out.println("Producto: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("------------------------------");
    }
}
