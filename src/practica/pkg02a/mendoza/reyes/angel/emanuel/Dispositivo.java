package practica.pkg02a.mendoza.reyes.angel.emanuel;

public class Dispositivo {
private String color;
private String tipo;
private double peso;

    //constructor
    public Dispositivo(String color, String tipo, double peso) {
        this.color = color;
        this.tipo = tipo;
        this.peso = peso;
    }
    
    //Setters
    public void setColor(String color) {
        this.color = color;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //Getters
    public String getColor() {
        return color;
    }
    public String getTipo() {
        return tipo;
    }
    public double getPeso() {
        return peso;
    }
}
