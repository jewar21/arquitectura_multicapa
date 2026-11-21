
import model.Producto;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Producto[] productos = new Producto[20];
        int cantidad = 0;

        System.out.println("Código: ");
        int codigo = scanner.nextInt();

        System.out.println("Precio: ");
        double precio = scanner.nextDouble();

        if (codigo > 0 && precio > 0 && cantidad < productos.length) {
            productos[cantidad] = new Producto(codigo, "Cuaderno", precio, 10);
            cantidad++;
            System.out.println("Producto registrado");
        }
        scanner.close();
    }
}
