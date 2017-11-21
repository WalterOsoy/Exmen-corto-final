package Problema2;
import java.security.Policy;
/**
 * @author walte
 */
public class Cuadrilatero implements Poligono {
    /**
     * atributos 
     */
    protected int ancho = 0;
    protected int altura = 0;
    /**
     * @return la multiplicacion de la base por la altura
     */
    public double area() {
        return ancho * altura;
    }
    /**
     * @return  la suma de todos los lados externos de la figura
     */
    public double perimeto() {
        return (2 * ancho) + (2 * altura);
    }
    /**     
     * @return valor de la base
     */
    public int getAncho() {
        return ancho;
    }
    /**      
     * @param ancho fija valor a la base
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    /** 
     * @return el valor de la altura
     */
    public int getAltura() {
        return altura;
    }
    /**      
     * @param altura fija valor a la altura
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
}
