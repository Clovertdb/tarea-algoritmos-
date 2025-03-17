/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.impuesto;

import java.util.Scanner;

/**
 *
 * @author mvmin
 */
public class Impuesto {

    public static void main(String[] args) {
        int salarioBruto, porcentajeImpuesto, deducciones;
        double impuesto,salarioNeto;
         Scanner teclado = new Scanner(System.in);

        
        System.out.print("Ingrese su salario bruto mensual: ");
        salarioBruto = teclado.nextInt();

        System.out.print("Ingrese el porcentaje de impuestos (número entero): ");
        porcentajeImpuesto = teclado.nextInt();

        System.out.print("Ingrese las deducciones adicionales: ");
        deducciones = teclado.nextInt();

        
        impuesto = salarioBruto * (porcentajeImpuesto / 100.0);

        
        salarioNeto = salarioBruto - impuesto - deducciones;

        
        System.out.println("El impuesto a pagar es: " + impuesto);
        System.out.println("El salario neto es: " + salarioNeto);
    }
}
