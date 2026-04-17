package List;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Artur");
        nomes.add("Diego");
//        nomes.add(1000); sem List<> é add tudo
        List<String> nomes2 = new ArrayList<>();

        nomes.add("Rayane");
        nomes.add("Jessica");

        nomes.addAll(nomes2);

        for (String nome:nomes){
            System.out.println(nome);
        }

        int size = nomes.size();// fixando o valor do tamanho do array
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println(nomes);

        nomes.remove("Diego");
        System.out.println(nomes);

    }
}
