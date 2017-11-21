/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1;

/**
 *
 * @author walte
 */
public class CifradoCesar {

    String cifrarCesar(String frase, int distancia) {
        StringBuilder codigo = new StringBuilder();
        distancia = distancia % 26;
        for (int x = 0; x < frase.length(); x++) {
            if (frase.charAt(x) >= 'a' && frase.charAt(x) <= 'z') {
                if ((frase.charAt(x) + distancia) > 'z') {
                    codigo.append((char) (frase.charAt(x) + distancia - 26));
                } else {
                    codigo.append((char) (frase.charAt(x) + distancia));
                }
            } else if (frase.charAt(x) >= 'A' && frase.charAt(x) <= 'Z') {
                if ((frase.charAt(x) + distancia) > 'Z') {
                    codigo.append((char) (frase.charAt(x) + distancia - 26));
                } else {
                    codigo.append((char) (frase.charAt(x) + distancia));
                }
            }
        }
         return codigo.toString();
    }

    String cifrarCesar(String frase, String alfabeto, int distancia) {
        String cadena = "";
        return cadena;
    }

}
