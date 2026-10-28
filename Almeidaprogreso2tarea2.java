public class Almeidaprogreso2tarea2 {

    static class Producto {
        private String nombre;
        private double precio;
        private int stock;

        public Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public int getStock() {
            return stock;
        }

        public String getInfo() {
            return nombre + " \u00b7 $" + precio + " \u00b7 " + stock + " u.";
        }
    }

    public static void main(String[] args) {
        final int MAX = 3;
        Producto[] inventario = new Producto[MAX];
        int cantidad = 0;

        Producto[] nuevos = {
            new Producto("Cuaderno", 2.50, 10),
            new Producto("Esfero", 0.80, 50),
            new Producto("Mochila", 25.00, 3),
            new Producto("Regla", 1.20, 20)
        };

        for (Producto p : nuevos) {
            if (cantidad < MAX) {
                inventario[cantidad] = p;
                cantidad++;
            } else {
                System.out.println("No hay espacio para " + p.getNombre());
            }
        }

        for (int i = 0; i < cantidad; i++) {
            System.out.println(inventario[i].getInfo());
        }

        double valorTotal = 0;
        Producto masCaro = inventario[0];

        for (int i = 0; i < cantidad; i++) {
            valorTotal += inventario[i].getPrecio() * inventario[i].getStock();
            if (inventario[i].getPrecio() > masCaro.getPrecio()) {
                masCaro = inventario[i];
            }
        }

        System.out.println("Valor del inventario: $" + valorTotal);
        System.out.println("M\u00e1s caro: " + masCaro.getNombre());
    }
}
