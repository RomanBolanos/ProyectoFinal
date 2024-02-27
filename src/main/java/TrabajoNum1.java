//1. En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
//del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
//10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
//a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
//40% de descuento. El precio de cada computadora es de U$500.
        import java.util.Scanner;
/**
 *
 * @author Roman
 */

public class TrabajoNum1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el número de computadoras:");
        int cantidadComp = teclado.nextInt();

        double precioPorComputadora = 500;
        double totalCompra = cantidadComp * precioPorComputadora;
        double descuento = 0.0;
        double montoDescuento = totalCompra * descuento;
        double totalPagar = totalCompra - montoDescuento;

        if (cantidadComp < 5) {
            descuento = (0.10);
        } else if (cantidadComp >=5 && cantidadComp< 10) {
            descuento = (0.20);
        } else if(cantidadComp >=10) {
            descuento = (0.40);
        }

        System.out.println("Total de la compra: $" + totalCompra);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Total a pagar: $" + totalPagar);
    }
}
