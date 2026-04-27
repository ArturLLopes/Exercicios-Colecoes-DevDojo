package set;

import entity.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetManga {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>(); // new LinkedHasSet mantem a ordem de incerssao
        mangas.add(new Manga(1L,"Breserkk", 9.9, 5));
        mangas.add(new Manga(5L,"Hellsing", 19.9, 0));
        mangas.add(new Manga(3L,"Pokemon", 190.9, 0));
        mangas.add(new Manga(5L,"Dragon ball", 21.9, 0));
        mangas.add(new Manga(4L,"Attackk on Titan", 3.9, 2));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }

}
