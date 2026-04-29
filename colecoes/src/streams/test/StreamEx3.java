package streams.test;

import streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx3 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violete", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchmist", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.99)

    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.stream().forEach(System.out::println);
        long count = stream.filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count);

        //quando uma steam é finalizada devese instaciar novamente para evitar erro
        System.out.println("---------------");
        long count2 = lightNovels.stream()
                .distinct()//usando o ecos e hashcode para evitar duplicado
                .filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println(count2);
    }
}
