/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seno.del.ángulo;
import java.util.Scanner; 
/**
 *
 * @author elver
 */
public class SenoDelÁngulo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable del ángulo
        int opEntrada;
        double a;
        Scanner kb= new Scanner(System.in);
        // Dar a conocer el ángulo 
        System.out.println("introduce el ángulo");
        a= kb.nextDouble();
        a= Math.toRadians(a);
        System.out.println("El seno del ángulo que buscas es" + Math.sin(a));
        System.out.println("Utiliza bien el resultado");
    }
    
}
