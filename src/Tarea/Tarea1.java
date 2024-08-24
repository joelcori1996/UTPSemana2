/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author PRV
 */

import java.lang.Math;
import java.util.Scanner;

public class Tarea1 {
    
    public static void main(String[] args) {
        
        Integer Edad_Juan, Edad_Jose, Edad_Maria, Edad_Mayor;
        double Resultado;
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese edad de Juan: ");
        Edad_Juan= dato.nextInt();
        System.out.print("Ingrese edad de Jose: ");
        Edad_Jose= dato.nextInt();
        System.out.print("Ingrese edad de Maria: ");
        Edad_Maria= dato.nextInt();
        
        Edad_Mayor =  Math.max(Edad_Maria, Math.max(Edad_Juan, Edad_Jose));
        Resultado = Math.sqrt(Edad_Mayor);
        System.out.print("La raiz cuadra del mayor de los tres hermanos es : " +  Resultado+ "\n");
        
    }
}
