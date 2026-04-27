package list.listaConversao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversao {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(numeros.toArray(new Integer[0]));
        System.out.println(Arrays.toString(listToArray));

        System.out.println("----Uma Lista esta ligada a outra---");

        Integer[] numerosArrray = new Integer[3];
        numerosArrray[0] = 1;
        numerosArrray[1] = 2;
        numerosArrray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArrray);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(numerosArrray));
        System.out.println(arrayToList);

        System.out.println("----Quebrando o vinculo usando asList com a outra---");

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArrray));
        numerosList.add(15);
        System.out.println(numerosList);

        System.out.println("----Criando em uma unica linha--");

        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Integer> integers = List.of(1, 2, 3);
        System.out.println(integers);
    }
}
