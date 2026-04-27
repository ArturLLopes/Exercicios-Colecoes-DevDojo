package binarySearch;

import entity.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchManga {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Hellsing", 19.9));
        mangas.add(new Manga(1L,"Breserkk", 9.9));
        mangas.add(new Manga(3L,"Pokemon", 190.9));
        mangas.add(new Manga(4L,"Attackk on Titan", 3.9));
        mangas.add(new Manga(5L,"Dragon ball", 21.9));

        Collections.sort(mangas);//usando para compara por ordem alfabetica

        //mangas.sort(new MangaByIdCompartator()); //usado para comparar por id

        for(Manga manga : mangas){
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(5L,"Dragon ball", 21.9);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
