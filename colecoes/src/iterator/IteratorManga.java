package iterator;

import entity.Manga;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorManga {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L,"Hellsing", 19.9, 0));
        mangas.add(new Manga(1L,"Breserkk", 9.9, 5));
        mangas.add(new Manga(3L,"Pokemon", 190.9, 0));
        mangas.add(new Manga(4L,"Attackk on Titan", 3.9, 2));
        mangas.add(new Manga(5L,"Dragon ball", 21.9, 0));

        //nao fazer remoção com forEach


        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()){
            //manga manga = mangaInterator.next();
            if (mangaIterator.next().getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);

        //usando programação funcional
        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);
    }
}
