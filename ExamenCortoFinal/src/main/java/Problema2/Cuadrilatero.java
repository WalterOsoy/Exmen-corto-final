package Problema2;
import java.security.Policy;
/**
 * @author walte
 */
public class Cuadrilatero implements Poligono {
    protected int ancho = 0;
    protected int altura = 0;
    public double area() {
        return ancho * altura;
    }
    public double perimeto() {
        return (2 * ancho) + (2 * altura);
    }
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
}
