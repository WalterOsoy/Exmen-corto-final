/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;

/**
 *
 * @author walte
 */
public class Hexagono implements Poligono{    
    /**
     * atributos de la clase
     */
    private int l,apotema;
    /**
     * uso de formula del area para el hexagono
     * @return 
     */
    public double area() {
        return 3*l*apotema;
    }
    /**
     * suma de todos los lados externos de figura
     * @return 
     */
    public double perimeto() {
      return 6*l;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getApotema() {
        return apotema;
    }

    public void setApotema(int apotema) {
        this.apotema = apotema;
    }
    
}
