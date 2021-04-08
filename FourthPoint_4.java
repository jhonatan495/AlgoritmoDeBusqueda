package com.mycompany.algortimodebusqueda;

import java.util.Scanner;

public class FourthPoint_4 {

    static String arreglo[] = {"colombia", "corea", "canada", "canarias"};
    static Scanner leer = new Scanner(System.in);
    static String pais;
    static int primero, ultimo;
    static int central;

    public static void main(String[] args) {
        primero = 0;
        ultimo = arreglo.length - 1;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println("\nAcorde a los anteriores PAIS ingrese cual desea buscar");
        pais = leer.next();
        int res = BusquedaBinaria(arreglo, primero, ultimo, pais);
        if (res != -1) {
            System.out.println("Encontro el pais " + arreglo[res]);
        } else {
              System.out.println(res);
            
        }

    }

    public static int BusquedaBinaria(String arreglo[], int primero, int ultimo, String pais) {
        
      
        central = (primero + ultimo) / 2;
        
      
        if (ultimo >= primero) {
            if (arreglo[central].compareTo(pais)==0) {
                return central;
            } else if (arreglo[central].compareTo(pais)<0) {
                return BusquedaBinaria(arreglo, primero, central - 1, pais);
             
           } else if (arreglo[central].compareTo(pais)>0) {
                return BusquedaBinaria(arreglo, central + 1, ultimo, pais);
                }
            }

          return -1; 
        }

    }
