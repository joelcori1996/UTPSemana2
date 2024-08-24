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

public class Tarea2 {
    
    public static void main(String[] args) {
        
        Integer Radio1, Radio2, Radio3;
        double Volumen1,Volumen2,Volumen3, Resultado;
        
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese radio 1: ");
        Radio1= dato.nextInt();
        System.out.print("Ingrese radio 2: ");
        Radio2= dato.nextInt();
        System.out.print("Ingrese radio 3: ");
        Radio3= dato.nextInt();
        
        Volumen1 = (4/3)* Math.PI* Math.pow(Radio1, 3);
        Volumen2 = (4/3)* Math.PI* Math.pow(Radio2, 3);
        Volumen3 = (4/3)* Math.PI* Math.pow(Radio3, 3);
        
        Resultado =Volumen1+  Volumen2+Volumen3;
   
        System.out.print("La suma de los volumenes de las tres esferas es : " +  Resultado+ "\n");
        
    }
}
