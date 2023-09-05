/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2exc11;

/**
 *
 * @author omarz
 */

/*Enunciado

    Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
de $450.000, de lo contrario escriba sólo el nombre. 
*/

import java.util.Scanner;

public class Actividad2Exc11 {

    public static void main(String[] args) {
        
        String empName;
        double salPerHour, workHours, totlSalary;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado: ");
        empName = scanner.nextLine();
        
        System.out.println("Ingrese el salario básico por hora: ");
        salPerHour = scanner.nextDouble();
        
        System.out.println("Ingrese el numero de horas trabajadas en el mes: ");
        workHours = scanner.nextDouble();
        
        totlSalary = workHours * salPerHour;
        
        if (totlSalary > 450000){
            System.out.println(empName + " ganó $" + totlSalary + " en el mes");
        }
        else{
            System.out.println(empName);
        }
        
    }
}
