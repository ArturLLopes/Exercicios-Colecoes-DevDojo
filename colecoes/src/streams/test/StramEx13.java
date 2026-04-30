package streams.test;

import streams.dominio.Category;
import streams.dominio.LightNovel;
import streams.dominio.PROMOTION;

import java.util.*;
import java.util.stream.Collectors;

public class StramEx13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violete", 5.99, Category.DRAMA),
            new LightNovel("No game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchmist", 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.99, Category.ROMANCE)

    ));

    public static void main(String[] args) {
        System.out.println("--------------------ListaPorCategoria------------------------------");
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
        System.out.println("--------------------ListaPorPromoção------------------------------");

        Map<PROMOTION, List<LightNovel>> promotionListMap = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? PROMOTION.UNDER_PROMOTION : PROMOTION.NORMAL_PRICE));
        System.out.println(promotionListMap);

        System.out.println("--------------------------ListaComAsDuas------------------------------");
        Map<Category, Map<PROMOTION, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.groupingBy(ln -> ln.getPrice() < 6 ? PROMOTION.UNDER_PROMOTION : PROMOTION.NORMAL_PRICE)));
        System.out.println(collect1);

        System.out.println("--------------------------QuantidadeTotalCategoria------------------------------");
        Map<Category, Long> countingAll = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(countingAll);


        System.out.println("--------------------------MaiorValorCategory------------------------------");
        Map<Category, Optional<LightNovel>> maxBy = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors
                        .maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(maxBy);
        //removendo o lightNovel do optinal
        Map<Category, LightNovel> maxByNoOptional = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)),
                        Optional::get)));


    }
}
