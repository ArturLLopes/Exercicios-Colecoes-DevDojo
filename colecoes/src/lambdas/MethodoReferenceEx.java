package lambdas;

import lambdas.dominio.Anime;
import lambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodoReferenceEx {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One piece", 100),
                new Anime("Naruto", 500)));
        //sem usar a class
        //Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        //usando a calss AnimeComparators
        animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpsodes);
        System.out.println(animeList);
    }
}
