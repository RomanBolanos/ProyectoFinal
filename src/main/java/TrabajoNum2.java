//2. En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
//en lo siguiente:
//• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
//compran de cinco a 10 y de U$50 si se compran más de 10.
//• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
//que compra y la que tiene que pagar por el total de la compra.

import java.util.Scanner;
/**
 *
 * @author Roman
 */
public class TrabajoNum2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de llantas que desea comprar:");
        int cantidadLlantas = teclado.nextInt();

        double precioPorLlanta = 0;

        if (cantidadLlantas < 5) {
            precioPorLlanta = (100.0);
        } else if (cantidadLlantas >5 && cantidadLlantas< 10) {
            precioPorLlanta = (75.0);
        } else if(cantidadLlantas <=10){
            precioPorLlanta = (50.0);
        }

        double totalCompra = (cantidadLlantas * precioPorLlanta);

        System.out.println("Precio por llanta: $" + precioPorLlanta);
        System.out.println("Total de la compra: $" + totalCompra);
    }
}
    

