package Proyecto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa("Los Globitos", "Av. Principal 123", "contacto@losglobitos.com");

        while (true) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Crear Pedido");
            System.out.println("3. Agregar Producto al Pedido");
            System.out.println("4. Generar Factura");
            System.out.println("5. Mostrar Pedidos");
            System.out.println("6. Mostrar Inventario");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    agregarCliente(empresa, scanner);
                    break;
                case 2:
                    crearPedido(empresa, scanner);
                    break;
                case 3:
                    agregarProductoAPedido(empresa, scanner);
                    break;
                case 4:
                    generarFactura(empresa, scanner);
                    break;
                case 5:
                    empresa.mostrarPedidos();
                    break;
                case 6:
                    empresa.getInventario().mostrarInventario();
                    break;
                case 7:
                    System.out.println("Saliendo del sistema. ¡Adiós!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }

    private static void agregarCliente(Empresa empresa, Scanner scanner) {
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese contacto del cliente: ");
        String contacto = scanner.nextLine();
        System.out.print("Ingrese dirección del cliente: ");
        String direccion = scanner.nextLine();
        Cliente cliente = new Cliente(nombre, contacto, direccion);
        System.out.println("Cliente " + nombre + " agregado con éxito.");
    }

    private static void crearPedido(Empresa empresa, Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente para el pedido: ");
        String nombreCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nombreCliente, "contacto", "direccion");
        System.out.print("Ingrese la fecha del pedido (YYYY-MM-DD): ");
        String fecha = scanner.nextLine();
        Pedido pedido = new Pedido(empresa.getInventario().hashCode(), fecha, cliente);
        empresa.agregarPedido(pedido);
        System.out.println("Pedido creado para el cliente " + nombreCliente + " en la fecha " + fecha + ".");
    }

    private static void agregarProductoAPedido(Empresa empresa, Scanner scanner) {
        System.out.print("Ingrese ID del Pedido: ");
        int pedidoID = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        Pedido pedido = empresa.getPedidoPorID(pedidoID);
        if (pedido == null) {
            System.out.println("No se encontró pedido con ID: " + pedidoID);
            return;
        }

        System.out.print("Ingrese nombre del producto: ");
        String nombreProducto = scanner.nextLine();
        System.out.print("Ingrese tipo de producto (Importado/Local): ");
        String tipoProducto = scanner.nextLine();
        System.out.print("Ingrese cantidad de producto: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        Producto producto = new Producto(nombreProducto, tipoProducto, cantidad);
        pedido.agregarProducto(producto);
        System.out.println("Producto agregado al pedido ID " + pedidoID + ".");
    }

    private static void generarFactura(Empresa empresa, Scanner scanner) {
        System.out.print("Ingrese ID del Pedido para generar factura: ");
        int pedidoID = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        Pedido pedido = empresa.getPedidoPorID(pedidoID);
        if (pedido == null) {
            System.out.println("No se encontró pedido con ID: " + pedidoID);
            return;
        }

        pedido.generarFactura();
        System.out.println("Factura generada para el pedido ID " + pedidoID + ".");
    }
}
