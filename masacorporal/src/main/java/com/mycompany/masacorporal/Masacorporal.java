/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.masacorporal;

import java.util.Scanner;

/**
 *
 * @author mvmin
 */
public class Masacorporal {

    public static void main(String[] args) {
        int peso, alturaCm;
        double altura, imc;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg (número entero): ");
        peso = teclado.nextInt();

        System.out.print("Ingrese su altura en centímetros (número entero): ");
        alturaCm = teclado.nextInt();

       
        altura = alturaCm / 100.0;

        
        imc = (double) peso / (altura * altura);

        System.out.println("Su Índice de Masa Corporal (IMC) es: " + imc);
    }
}
