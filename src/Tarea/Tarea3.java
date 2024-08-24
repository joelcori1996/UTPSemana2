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
public class Tarea3 {
     public static void main(String[] args) {
        String  Mensaje = "";
        Integer Suma,MinValor,ValorAnterior;
        Suma = 0;
        ValorAnterior=0;
        MinValor = 0;  
        for(Integer a =1;a<=5;a++)
        {
            Integer Valor = (int) (Math.random() * 100);
            Suma = Suma + Valor;
            if (a ==5) Mensaje += Valor + "";
            else Mensaje +=  Valor + "-";
            if (ValorAnterior==0)  ValorAnterior = Valor;
            else
            {
            MinValor =  Math.min(Valor,ValorAnterior);     
            ValorAnterior = MinValor;
            }
        }
        System.out.print("Los numeros aleatorios son : " +  Mensaje+ "\n");
        System.out.print("La suma de los numeros aleatorios es : " +  Suma+ "\n");
        System.out.print("El minimo valor es : " + MinValor+ "\n");
    }
}
