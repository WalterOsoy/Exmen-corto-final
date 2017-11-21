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
public class Cuadrado extends Cuadrilatero{
    /**
     * 
     * @param x base del cuadrado
     * @param y altura del cuadrado
     * @return 
     */    
    public int area(int x, int y) {
        return x*y;
    }

    /**
     * 
     * @param x base del cuadrado
     * @param y altura del cuadrado
     * @return 
     */    
    public int perimeto(int x, int y) {
        return (2*x)+(2*y);
    }
    
}
