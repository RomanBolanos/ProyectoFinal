//9. Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si a este se le asigna
//un porcentaje de su salario mensual que depende de su antigüedad en la empresa de acuerdo
//con la siguiente tabla:

//Tiempo                Utilidad
//Menos de 1 año 5 % del salario
//1 año o más y menos de 2 años 7% del salario
//2 años o más y menos de 5 años 10% del salario
//5 años o más y menos de 10 años 15% del salario
//10 años o más 20% del salario
import java.util.Scanner; 
public class TrabajoNum9 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        System.out.println("ingrese su salario mensual: ");
        double salario = util.nextDouble();
        System.out.println("ingrese sus años de "
                + "antiguedad: ");
        double añosAnt = util.nextDouble();
        double TotalPago;
        double SalarioAd;
        
        if (añosAnt <1){
            SalarioAd = (salario*0.05);
            System.out.println("el salario adicional sería: " + SalarioAd);
            TotalPago = (salario + SalarioAd);
            System.out.println("la utilidad recibida sería: " + TotalPago);
        }
        else if (añosAnt >=1 && añosAnt <2){
            SalarioAd = (salario*0.07);
            System.out.println("el salario adicional sería: " + SalarioAd);
            TotalPago = (salario + SalarioAd);
            System.out.println("la utilidad recibida sería: " + TotalPago);
        }
        else if (añosAnt >=2 && añosAnt < 5){
             SalarioAd = (salario*0.10);
            System.out.println("el salario adicional sería: " + SalarioAd);
            TotalPago = (salario + SalarioAd);
            System.out.println("la utilidad recibida sería: " + TotalPago);
        }
        else if (añosAnt >=5 && añosAnt < 10){
             SalarioAd = (salario*0.15);
            System.out.println("el salario adicional sería: " + SalarioAd);
            TotalPago = (salario + SalarioAd);
            System.out.println("la utilidad recibida sería: " + TotalPago);
        }
        else if (añosAnt >=10){
             SalarioAd = (salario*0.20);
            System.out.println("el salario adicional sería: " + SalarioAd);
            TotalPago = (salario + SalarioAd);
            System.out.println("la utilidad recibida sería: " + TotalPago);
        }
        
    }
}
