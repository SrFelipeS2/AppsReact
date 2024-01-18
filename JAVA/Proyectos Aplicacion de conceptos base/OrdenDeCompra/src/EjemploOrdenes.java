public class EjemploOrdenes {
    public static void main(String[] args) {

        OrdenDeCompra ordenDeCompraNumero1 = new OrdenDeCompra("Esta es la Primer orden de compra");

        Cliente cliente1 = new Cliente("Juan Felipe", "Lopez Grajales", "Cll 32b # 50 - 6" , 852963,1053895632);

        ordenDeCompraNumero1.setCliente(cliente1);

        ordenDeCompraNumero1
                .addProducto(new Producto("Mantequilla","Rama",25000))
                .addProducto(new Producto("Sal","Refi Sal",30000))
                .addProducto(new Producto("Tostadas","La Abuelita",50000))
                .addProducto(new Producto("Pastas","Dorian",5000));
        imprimirOrden(ordenDeCompraNumero1 , cliente1);


        OrdenDeCompra ordenDeCompraNumero2 = new OrdenDeCompra("Esta es la Segunda orden de compra");

        Cliente cliente2 = new Cliente("Pablo", "Escobar", "Cll 25m # 23 - 16" , 985632147,30365312);

        ordenDeCompraNumero2.setCliente(cliente2);

        ordenDeCompraNumero2
                .addProducto(new Producto("Usb","Kingstong",50000))
                .addProducto(new Producto("telefono","Samsung",750000))
                .addProducto(new Producto("Mouse","Corsair",63000))
                .addProducto(new Producto("teclado","Corsair",90000));

        imprimirOrden(ordenDeCompraNumero2 , cliente2);

        OrdenDeCompra ordenDeCompraNumero3 = new OrdenDeCompra("Esta es la Tercera orden de compra");

        Cliente cliente3 = new Cliente("Luis Eduardo", "Corrales", "Carrera 85b # 51 - 56" , 123456789,12358664);

        ordenDeCompraNumero3.setCliente(cliente3);

        ordenDeCompraNumero3
                .addProducto(new Producto("Billetera","Nappa",25800))
                .addProducto(new Producto("Camiseta","Levis",35400))
                .addProducto(new Producto("Pantalones","Levis",89000))
                .addProducto(new Producto("Zapatos","Nike",150000));

        imprimirOrden(ordenDeCompraNumero3 , cliente3);
    }
    private static void imprimirOrden(OrdenDeCompra orden, Cliente cliente) {
        System.out.println("*********************************************");
        System.out.println("ID: " + orden.getId());
        System.out.println("Descripción: " + orden.getDescripcion());
        System.out.println("Cliente: " + cliente.getNombre()+ " " + cliente.getApellido());
        System.out.println("Total: $" + orden.sumProductos());

        System.out.println("Productos:");
        for (Producto p : orden.getProductos()) {
            if (p != null) {
                System.out.println(" - Nombre: " + p.getNombreProducto()
                        + ", Fabricante: " + p.getFabricante()
                        + ", Precio: $" + p.getPrecio());
            }
        }
        System.out.println("*********************************************");
    }
}

