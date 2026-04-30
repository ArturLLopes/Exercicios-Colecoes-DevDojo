package streams.test;

import streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEx6 {
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
        boolean any = lightNovels.stream()
                .anyMatch(ln -> ln.getPrice() > 8);//existe algum OBJ com o OBJ > 8
        System.out.println(any);

        boolean all = lightNovels.stream()
                .allMatch(ln -> ln.getPrice() < 0);
        System.out.println(all);

        boolean none = lightNovels.stream()
                .noneMatch(ln -> ln.getPrice() < 0);
        System.out.println(none);


        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);


        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);
        //--------simplificando o de cima--------------
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
