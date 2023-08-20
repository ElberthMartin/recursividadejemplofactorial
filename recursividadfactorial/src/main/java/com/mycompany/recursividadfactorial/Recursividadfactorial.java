/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividadfactorial;

/**
 *
 * @author USER
 */
public class Recursividadfactorial {
// definimos la funcion factorial e igualamos
    public static int factorial(int n) {
        
        if (n == 0) {
            return 1;
        } else {
          
            return n * factorial(n - 1);
        }
    }
    //agregamos un main y llamamos a la funcion factorial
    
    public static void main(String[] args) {
   
    int numero = 5;

   int resultado = factorial(numero);
   //imprimir
       System.out.println("El factorial de " + numero + " es " + resultado);
}
}