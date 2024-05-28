
package EvaluacionFinal;

/*
u20232218172
Román Alberto Bolaños Cerquera
*/
public class Chaqueta extends Componente {
    private int numBotones;
    
    public Chaqueta(int id, String nombre, String talla, String color, boolean escomunitario, double precio, int numBotones) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.numBotones = numBotones;
    }

    public int getNumBotones() {
        return numBotones;
    }

    public void setNumBotones(int numBotones) {
        this.numBotones = numBotones;
    }
    @Override
    public String toString() {
        return "Chaqueta(" + super.toString() + "conCremallera=" + numBotones + ")";
    
}
}