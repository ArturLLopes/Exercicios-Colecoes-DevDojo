package List;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Artur");
        nomes.add("Diego");
//        nomes.add(1000); sem List<> é add tudo
        for (String nome:nomes){
            System.out.println(nome);
        }

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }
}
