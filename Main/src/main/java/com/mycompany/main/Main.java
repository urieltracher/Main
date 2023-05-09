/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author 
 */
public class Main {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 10;
    int resultado = sumar(num1, num2);
    System.out.println("El resultado de la suma es: " + resultado);
  }

  public static int sumar(int a, int b) {
    int suma = a + b;
    return suma;
  }
}
