
package EvaluacionFinal;

/*
u20232218172
Román Alberto Bolaños Cerquera
*/

public class Blusa extends Componente {
    private boolean mangaLarga;

    public Blusa(int id, String nombre, String talla, String color, boolean escomunitario, double precio, boolean mangaCorta) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.mangaLarga = mangaCorta;
    }

    public boolean isMangaCorta() {
        return mangaLarga;
    }

    public void setMangaCorta(boolean mangaCorta) {
        this.mangaLarga = mangaCorta;
    }
    @Override
    public String toString() {
        return "Blusa(" + super.toString() + "conCremallera=" + mangaLarga+ ")";
}

    boolean isMangaLarga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    }

