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
public class Rectangulo extends Cuadrilatero {

    public double area() {
        return ancho * altura;
    }

    public double perimetro() {
        return 2 * ancho + 2 * altura;
    }
}
