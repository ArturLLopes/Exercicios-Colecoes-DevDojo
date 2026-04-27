package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortEx {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Breserkk");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");
        mangas.add("Attack on titan");
        mangas.add("Hellsing Ultimate");

        Collections.sort(mangas); //ordem alfabetica

        for (String manga: mangas){
            System.out.println(manga);
        }

        List<Double> dinheiro = new ArrayList<>();
        dinheiro.add(100.21);
        dinheiro.add(23.98);
        dinheiro.add(21.21);
        dinheiro.add(98.10);

        for (Double dinehiro:dinheiro){
            System.out.println(dinehiro);
        }
        System.out.println("____________");
        Collections.sort(dinheiro);

        for (Double dinehiro:dinheiro){
            System.out.println(dinehiro);
        }

    }
}
