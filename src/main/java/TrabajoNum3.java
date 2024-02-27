//3. Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
//de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
//5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
//cualquiera por la compra de su aparato. El IVA es del 19%.
 import java.util.Scanner;
/**
 *
 * @author Roman
 */
public class TrabajoNum3 {
    public static void main(String[] args) {
      Scanner prec = new Scanner(System.in);
        System.out.println("ingrese el valor de su compra: ");
        double valor = prec.nextDouble();  
    double precio = 0; // El precio sin IVA del reproductor
    double descuento; // El descuento aplicado al precio
    double iva; // El IVA del 19%
    double precioFinal; // El precio final con descuento e IVA
    
   

    // Calcular el descuento
    if (precio >= 500) {
      // Si el precio es mayor o igual a 500, se aplica un 10% de descuento
      descuento = (precio * 0.10)-precio;
    } else {
      // Si no, no hay descuento
      descuento = 0;
    }

    // Calcular el IVA
    iva = (precio - descuento) * 0.19;

    // Calcular el precio final
    precioFinal = precio - descuento + iva;

    // Mostrar el resultado
    System.out.println("El precio final del reproductor es: " + precioFinal);
  }
}


