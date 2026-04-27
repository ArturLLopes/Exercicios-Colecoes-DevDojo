package set;

import entity.Manga;
import entity.Pessoa;

import java.util.*;

class PessoaNomeFullComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getNomeFull().compareTo(o2.getNomeFull());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetEx {
    public static void main(String[] args) {
        NavigableSet<Pessoa> set = new TreeSet<>(new PessoaNomeFullComparator());
        Pessoa pessoa = new Pessoa("Maurico", "Ferreira");
        set.add(pessoa);
        System.out.println(pessoa);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(1L,"Breserkk", 9.9, 5));
        mangas.add(new Manga(5L,"Hellsing", 19.9, 0));
        mangas.add(new Manga(3L,"Pokemon", 190.9, 0));
        mangas.add(new Manga(5L,"Dragon ball", 21.9, 0));
        mangas.add(new Manga(4L,"Attackk on Titan", 3.9, 2));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
        System.out.println("----------------------------");

        /* @
        * lower <
        * floor <=
        * higher >
        * ceiling >=
        *  */

       Manga ghanor = new Manga(31L,"Ghanor", 18.9, 10);
        System.out.println(mangas.lower(ghanor));
        System.out.println(mangas.floor(ghanor));
        System.out.println(mangas.higher(ghanor));
        System.out.println(mangas.ceiling(ghanor));
        System.out.println("----------------------------");

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
        System.out.println("----------------------------");

        /* @Quando deve usar o TreeSet
            quando a class crianda usa o comparabol
            ter implementado o comparator
            e sempre ordenara por esses metados
            sem duplicação
        *  */

        for (Manga manga :  mangas.descendingSet())
            System.out.println(manga);
    }
}
