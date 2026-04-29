package streams.test;

import streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violete", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchmist", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.99)

    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                //ordenando por titulo
                .sorted(Comparator.comparing(LightNovel::getTitle))
                //buscando por valor e com um numero especifico de obj
                .filter(ln -> ln.getPrice() <= 4.99)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);


    }
}
