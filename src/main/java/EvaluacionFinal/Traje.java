
package EvaluacionFinal;

import java.util.ArrayList;

/*
u20232218172
Román Alberto Bolaños Cerquera
*/
public class Traje {
     private ArrayList<Componente> piezas;
    private String nombre;

    public Traje(String nombre) {
        this.piezas = new ArrayList<>();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public ArrayList<Componente> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Componente> piezas) {
        this.piezas = piezas;
    }

    
    @Override
    public String toString(){
        return "Traje:(" + "nombre=" + nombre +", piezas=" + piezas + ")";
       
 
           
    }
}


