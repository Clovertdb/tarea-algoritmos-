/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedio;

import java.util.Scanner;

/**
 *
 * @author mvmin
 */
public class Promedio {

    public static void main(String[] args) {
        int num1, num2, num3, suma, promedio;
         Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = teclado.nextInt();

        System.out.print("Ingrese el tercer número: ");
        num3 = teclado.nextInt();

        suma = num1 + num2 + num3;
        promedio = suma / 3;

        System.out.println("El promedio es: " + promedio);
    }
}
