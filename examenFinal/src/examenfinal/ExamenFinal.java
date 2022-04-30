/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ramos
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Comparación de 2 números");
            System.out.println("2. Piramide Impar");
            System.out.println("3. Vacas Lecheras");
            System.out.println("4. Salir");
 
            try {
 
                System.out.print("Elige una de las opciones: ");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("\n" + "Has elegido la opcion 1 (Comparación de 2 números)");
                        System.out.print("Ingresa un número entero: ");
                        int numero1 = sn.nextInt();
                        System.out.print("Ingresa otro número entero: ");
                        int numero2 = sn.nextInt();
                        comparacion(numero1, numero2);
                        break;
                    case 2:
                        System.out.println("\n" + "Has seleccionado la opcion 2 (Piramide Impar)");
                        System.out.print("Ingresa un número entero impar: ");
                        int filas = sn.nextInt();
                        piramideImpar(filas);
                        break;
                    case 3:
                        System.out.println("\n" + "Has seleccionado la opcion 3");
                        lechero();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
    
    static void comparacion(int a, int b){
        if(a > b){
            System.out.println("El número mayor es: " + a + "\n");
        }
        else{
            System.out.println("El número mayor es: " + b + "\n");
        }
    }
    
    static void piramideImpar(int filas){
        if(filas % 2 == 0){
            System.out.println("Debes insertar solo números impares \n");
        }
        else{
            System.out.println();
            for (int altura = 1; altura <= Math.ceil((float)filas/2); altura++) {
                for (int blancos = 1; blancos <= filas-altura; blancos++) {
                    System.out.print(" ");                    
                }
                for (int asteriscos = 1; asteriscos <= (altura*2)-1; asteriscos++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("\n");
        }
    }
    
    static void lechero(){
        //Para 8 vacas
        int[] vacas = new int[8];
        int[] leche = new int[8];
        System.out.println("La cantidad de vacas disponibles para la venta son: " + vacas.length + "\n");
        vacas[0] = 223; leche[0] = 30;
        vacas[1] = 243; leche[1] = 34;
        vacas[2] = 100; leche[2] = 28;
        vacas[3] = 200; leche[3] = 45;
        vacas[4] = 200; leche[4] = 31;
        vacas[5] = 155; leche[5] = 50;
        vacas[6] = 300; leche[6] = 29;
        vacas[7] = 150; leche[7] = 1;
        
        int totalLeche = leche[1] + leche[3] + leche[5] +leche[6] + leche[2];
        System.out.println("El peso de las vacas a comprar: " + vacas[1] + ", " + vacas[3] + ", " + vacas[5] + ", " + vacas[6] + ", " + vacas[2]);
        System.out.println("El total de litros de leche que generan son: " + totalLeche + "\n");
        
    }
    
}
