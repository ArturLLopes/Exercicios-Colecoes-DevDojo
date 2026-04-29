package lambdas;

import lambdas.dominio.Anime;
import lambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodoReferenceEx4 {
    public static void main(String[] args) {
//        AnimeComparators animeComparators = new AnimeComparators();
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One piece", 100),
                new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpsodesNoStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunctionReplace = Anime::new;
        System.out.println(animeBiFunctionReplace.apply("Super Campeos", 5));
    }
}
