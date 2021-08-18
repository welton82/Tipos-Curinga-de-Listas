package application;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaCopy {
    public static void main(String[] args) {

        List<Integer> inteiros = Arrays.asList(1,51,698,74);
        List<Double> flutuantes = Arrays.asList(120.65, 500.87, 12.87, -45.85);
        List<Object> obj = new ArrayList<>();


        System.out.println("Inteiros: " + inteiros);
        copy(inteiros, obj);
        System.out.println("Imprimindo Lista Obj De Inteiros: ");
        printList(obj);

        System.out.println("Flutuantes: " + flutuantes);
        copy(flutuantes, obj);
        System.out.println("Imprimindo Lista obj de flutuantes: ");
        printList(obj);

    }
    public static void copy(List<? extends Number>origem, List<? super Number> destino){
        for(Number x: origem){
            destino.add(x);
        }
    }

    public static void printList(List<?>list){
        for(Object o : list){
            System.out.print(o + " ");
        }
        System.out.println();
    }

}













