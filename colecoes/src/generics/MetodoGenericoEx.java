package generics;

import generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoEx {
    public static void main(String[] args) {
//        criarArrayComUmObj(new Barco("Canoa"));
        List<Barco> barcoList = criarArrayComUmObj(new Barco("Canoa"));
        System.out.println(barcoList);
    }

//    private static <T> void criarArrayComUmObj(T t){
//        List<T> list = new ArrayList<>();
//        list.add(t);
//        System.out.println(list);
//    }
    private static <T> List<T> criarArrayComUmObj(T t){ //<T extends Comparable>
        return List.of(t);
    }
}
