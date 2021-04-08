package com.mycompany.algortimodebusqueda;

import java.util.Scanner;

public class SecondPoint {

    static long arreglo[] = {72, 88, 102, 328};
    static int primero, num, ultimo;
    static int central;
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        primero = 0;
        ultimo = arreglo.length - 1;
         for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println("\nAcorde a los anteriores numeros ingrese cual desea buscar");
        num = leer.nextInt();
        int res= BusquedaBinaria(arreglo, primero, ultimo, num);
        if(res!=-1){
            System.out.println("Encontro el numero "+arreglo[res]);
        }else{
            System.out.println(res);
        }

    }

    public static int BusquedaBinaria(long arreglo[], int primero, int ultimo, int num) {

        
        central = (primero + ultimo) / 2;
       
        if (ultimo >= primero) {
            if (arreglo[central] == num) {
                return central;
            } else if (num < arreglo[central]) {
                return BusquedaBinaria(arreglo, primero, central - 1, num);
            } else if (num > arreglo[central]) {
                return BusquedaBinaria(arreglo, central + 1, ultimo, num);
            }
        }

        return -1;
    }
}

