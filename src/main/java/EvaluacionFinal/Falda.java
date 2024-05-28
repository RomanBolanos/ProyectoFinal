
package EvaluacionFinal;

/**
 *
 * @author Roman
 */
/*
u20232218172
Román Alberto Bolaños Cerquera
*/
public class Falda extends Componente{
    private boolean conCremallera;

    public Falda(int id, String nombre, String talla, String color, boolean escomunitario, double precio, boolean conCremallera) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.conCremallera = conCremallera;
    }


    public boolean isConCremallera() {
        return conCremallera;
    }

    public void setConCremallera(boolean conCremallera) {
        this.conCremallera = conCremallera;
    }

    @Override
    public String toString() {
        return "Falda(" + super.toString() + "conCremallera=" + conCremallera + ")";
               
                
    }
}
    


