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
public class Octagono implements Poligono{
    private int l,apotema;
    
    public double area() {
        return 4*l*apotema;
    }
    
    public double perimeto() {
        return 8*l;
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
