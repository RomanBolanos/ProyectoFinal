
package EvaluacionFinal;
/*
u20232218172
Román Alberto Bolaños Cerquera
*/
public class Componente {
   private int id;
   private String nombre;
   private String talla;
   private String color;
   private boolean escomunitario;
   private double precio;

    public Componente(int id, String nombre, String talla, String color, boolean escomunitario, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.escomunitario = escomunitario;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public boolean isEscomunitario() {
        return escomunitario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEscomunitario(boolean escomunitario) {
        this.escomunitario = escomunitario;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
   @Override
    public String toString() {
        return "Componente:(" +  "id=" + id + ", nombre='" + nombre  + ", talla='" + talla + ", color='" + color +  ", escomunitario=" + escomunitario +  ", precio=" + precio + ')';
       
    }
    
    @Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Componente that = (Componente) obj;
    return id == that.id;
}

@Override
public int hashCode() {
    return Integer.hashCode(id);
}

public int compareTo(Componente other) {
    return Integer.compare(this.id, other.id);
}
}


