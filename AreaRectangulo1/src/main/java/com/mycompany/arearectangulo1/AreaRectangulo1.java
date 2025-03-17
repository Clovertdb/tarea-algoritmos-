/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arearectangulo1;

import java.util.Scanner;

/**
 *
 * @author mvmin
 */
public class AreaRectangulo1 {

    public static void main(String[] args) {
        int base, altura, area;
   Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
         base = teclado.nextInt();

        System.out.print("Ingrese la altura: ");
         altura = teclado.nextInt();

         area = base * altura;

        System.out.println("El área del rectángulo es: " + area);
    
    
    }
}
