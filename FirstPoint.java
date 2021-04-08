package com.mycompany.algortimodebusqueda;

import java.util.Scanner;

public class FirstPoint {

    static long arreglo[] = {55, 41, 300, 95};
    static Scanner leer = new Scanner(System.in);
    static long num;

    public static void main(String[] args) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println("\nAcorde a los anteriores numeros ingrese cual desea buscar");
        num = leer.nextInt();
        int res=BusquedaSequencial(arreglo, num);
        if(res!= -1){
        System.out.println("Se encontro el numero "+arreglo[res]);
      }else{System.out.println(res);}  

    }

    public static int BusquedaSequencial(long arreglo[], long num) {
        int numero = -1;
        int j = 0;
        while (j < arreglo.length) {
            if (arreglo[j] == num) {
                return j;
            }
            j++;
        }
        
        return numero;
    }

}

