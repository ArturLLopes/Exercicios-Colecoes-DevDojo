package list;

import entity.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class ListSortMangaEx {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Hellsing", 19.9));
        mangas.add(new Manga(1L,"Breserkk", 9.9));
        mangas.add(new Manga(3L,"Pokemon", 190.9));
        mangas.add(new Manga(4L,"Attackk on Titan", 3.9));
        mangas.add(new Manga(5L,"Dragon ball", 21.9));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("____________________________________");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas,new MangaByIdComparator());
        //mangas.sort(new MangaByIdComparator());
        System.out.println("____________________________________");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
