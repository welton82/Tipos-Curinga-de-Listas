package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Variancia {

    public static void main(String[] args) {
// VARIANCIA: QUANDO ACEITA ACESSAR LISTA MAS NÃO ACEITA ADICIONAR
        List<Integer>numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(15);
        numeros.add(150);
        numeros.add(25);
        System.out.print(numeros);
        System.out.println();
        List<? extends Number> est = numeros;
        //não aceita adicionar
        /*est.add(58);*/
        System.out.println("Acessando Posicao: " + est.get(3));


        List<Double> numerosD = new ArrayList<>();
        numerosD.add(15.6);
        numerosD.add(25.97);
        numerosD.add(150.874);
        System.out.print(numerosD);
        est = numerosD;
        System.out.println();
        System.out.println("Acessando Double: " + est.get(2));

    }
        //finalizou aula no 11:26 inicio de contravariancia

}
