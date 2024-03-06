package edu.udelp.POO.examen;
import java.util.Scanner;


public class TiendaRopa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("1. Alta de prenda");
			System.out.println("2. Mostrar inventario");
			System.out.println("3. Venta de prenda");
			System.out.println("4. Salir");
			System.out.println("Ingrese su opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				altaPrenda();
				break;
			case 2:
				mostrarInventario();
				break;
			case 3:
				ventaPrenda();
				break;
			case 4:
				System.out.println("Saliendo del sistema...");
				break;
			default:
				System.out.println("Opción inválida.");
			}
		} while (opcion != 4);
	}

	static Prenda[] inventario = new Prenda[100];
	static int totalPrendas = 0;

	static void altaPrenda() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Tipo de prenda (pantalon, camisa, falda, blusa, playera): ");
		String tipo = scanner.nextLine();

		System.out.println("Género (hombre, mujer): ");
		String genero = scanner.nextLine();

		System.out.println("Talla (CH, M, G, EX): ");
		String talla = scanner.nextLine();

		System.out.println("Cantidad: ");
		int cantidad = scanner.nextInt();

		System.out.println("Precio de compra: ");
		double precioCompra = scanner.nextDouble();

		inventario[totalPrendas++] = new Prenda(tipo, genero, talla, cantidad, precioCompra);
	}

	static void mostrarInventario() {
		System.out.println("Prenda    | Tamaño | Cantidad | Precio Compra | Precio Venta");
		System.out.println("-------------------------------------------------------------");
		for (int i = 0; i < totalPrendas; i++) {
			inventario[i].mostrarPrenda();
		}
		System.out.println();
	}

	static void ventaPrenda() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Tipo de prenda a vender: ");
		String tipo = scanner.nextLine();

		System.out.println("Talla: ");
		String talla = scanner.nextLine();

		System.out.println("Cantidad: ");
		int cantidad = scanner.nextInt();

		double totalVenta = 0;
		for (int i = 0; i < totalPrendas; i++) {
			Prenda prenda = inventario[i];
			if (prenda.tipo.equals(tipo) && prenda.talla.equals(talla) && prenda.cantidad >= cantidad) {
				totalVenta += prenda.calcularTotalVenta(cantidad);
				System.out.println("Venta realizada con éxito.");
				break;
			}
		}
		System.out.println("Total a pagar: " + totalVenta);
	}
}

class Prenda {
	String tipo;
	String genero;
	String talla;
	int cantidad;
	double precioCompra;
	double precioVenta;

	Prenda(String tipo, String genero, String talla, int cantidad, double precioCompra) {
		this.tipo = tipo;
		this.genero = genero;
		this.talla = talla;
		this.cantidad = cantidad;
		this.precioCompra = precioCompra;

		if (talla.equals("CH") || talla.equals("M")) {
			this.precioVenta = precioCompra * 1.1;
		} else {
			this.precioVenta = precioCompra * 1.2;
		}
	}

	void mostrarPrenda() {
		System.out.printf("%-10s | %-6s | %-8d | %-13.2f | %.2f\n", tipo, talla, cantidad, precioCompra, precioVenta);
	}

	double calcularTotalVenta(int cantidad) {
		this.cantidad -= cantidad;
		return precioVenta * cantidad;
	}
}