package application;

import java.util.ArrayList;
import java.util.List;

public class ContraVariancia {
    public static void main(String[] args) {

        List<Object> obj = new ArrayList<>();
        obj.add("Vanessa");
        obj.add("Pará");
        obj.add("Manguá");

        List<? super Number> superN = obj;

        superN.add(10);
        superN.add(150);
        System.out.println(superN);
        int i = 4;
        System.out.println("Posicao "+ i + ":  " + superN.get(i));

        Number x = (Number) superN.get(3);
        System.out.println("X: " + x);
    }
}
