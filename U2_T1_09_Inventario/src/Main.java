public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario(3);

        Producto producto1 = new Producto("05487", "Lapiz", 5);
        inventario.agregarProducto(producto1);

        Producto producto2 = new Producto("05412", "Goma", 10);
        inventario.agregarProducto(producto2);

        Producto producto3 = new Producto("11254", "Pluma", 7);
        inventario.agregarProducto(producto3);

        Producto producto4 = new Producto("105448", "Regla", 3);
        System.out.println("Se pudo agregar el producto 4?: " + inventario.agregarProducto(producto4));

        System.out.println("Total de ítems en inventario: " + inventario.totalItems());

        Producto buscado1 = inventario.buscar("05487");
        System.out.println("Producto buscado: " + (buscado1 != null ? buscado1.getNombre() : "No encontrado"));

        boolean eliminado = inventario.eliminarProducto("05412");
        System.out.println("Producto eliminado?: " + eliminado);

        System.out.println("Total de ítems final: " + inventario.totalItems());
    }
}


