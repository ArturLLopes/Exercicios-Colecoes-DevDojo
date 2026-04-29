package lambdas;

import lambdas.dominio.Anime;
import lambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodoReferenceEx2 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One piece", 100),
                new Anime("Naruto", 500)));

        //usando o metodo sem ser statico
        AnimeComparators animeComparators = new AnimeComparators();
        //animeList.sort((a1,a2) -> animeComparators.compareByEpsodesNoStatic(a1,a2);
        animeList.sort(animeComparators::compareByEpsodesNoStatic);
        System.out.println(animeList);
    }
}
