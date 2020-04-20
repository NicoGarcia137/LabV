package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Ejercicio1

        List<Integer> arrayGenerico = new ArrayList<>();
        Integer int1 = 1;
        Integer int2 = 10;
        arrayGenerico.add(int1);
        arrayGenerico.add(int2);


       GenericaClase clasista =new GenericaClase(arrayGenerico);

        System.out.println("El valor 10 esta en el arreglo : " + clasista.exists(10));

        System.out.println("El max en el array generico es : " + clasista.getMax());
        System.out.println("El min en el array generico es : " + clasista.getMin());


        //Ejercicio 2

        //espero resolucion en la clase










        // Ejercicio 3

        Pila pilita = new Pila();

        pilita.push(new Integer(10));
        pilita.push(new Integer(15));
        pilita.push(new Integer(20));



        System.out.println("El primer elemento es : " + pilita.pop());

        System.out.println("La cantidad de elementos es : " + pilita.size());

    }
}
