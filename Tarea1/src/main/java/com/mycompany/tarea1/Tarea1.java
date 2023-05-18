/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea1;

/**
 *
 * @author ulacit
 */

import java.util.Scanner;

public class Tarea1 {

    public static void main(String[] args){
        int selection;
        boolean estado;
        Scanner input = new Scanner(System.in);

        while(estado=true){/***************************************************/
        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Crear Dependiente");
        System.out.println("2 - Crear Ingeniero");
        System.out.println("3 - Recibe Salario por ingeniero");
        System.out.println("4 - Recibe Salario por dependiente");
        System.out.println("5 - Salir");

        selection = input.nextInt();
        
        if (selection == 1){
            System.out.println("Nuevo Dependiente:\n");  
            
        } else if (selection == 2){
            System.out.println("Nuevo Ingeniero:\n");
        }else if (selection == 3){
            System.out.println("Salario por ingeniero:\n");
        }else if (selection == 4){
            System.out.println("Salario por dependiente:\n");
        }else if (selection == 5){
            System.out.println("Saliendo...\n");
          System.exit(0);
        }
       }
}
    
    
}
