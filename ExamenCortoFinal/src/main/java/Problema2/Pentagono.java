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
public class Pentagono implements Poligono{
    private int l, apotema;

    public double area() {
       return 5*l*apotema;
    }

    public double perimeto() {
        return 5*l;
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
