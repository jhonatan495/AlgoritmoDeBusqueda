package com.mycompany.algortimodebusqueda;

import java.util.Scanner;

public class thirdPoint {

    static String arreglo[] = {"colombia","corea","canada","canarias"};
    static Scanner leer = new Scanner(System.in);
    static String pais;

    public static void main(String[] args) {

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println("\nAcorde a los anteriores paises ingrese cual desea buscar");
        pais = leer.next();
        int res = BusquedaSequencial(arreglo, pais);
        if (res != -1) {
            System.out.println("Se encontro el pais " + arreglo[res]);
        } else {
            System.out.println(res);
        }
    }

    public static int BusquedaSequencial(String arreglo[], String num) {
        int numero = -1;
        int j = 0;
        while (j < arreglo.length) {
            if (arreglo[j].equalsIgnoreCase(num)) {
                return j;
            }
            j++;
        }

        return numero;
    }

}
