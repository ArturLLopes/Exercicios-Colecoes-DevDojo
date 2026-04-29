package streams.test;

import streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEx {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violete", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchmist", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.99)

    ));
    public static void main(String[] args) {
        //ordenando por titulo
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovels);

        //buscando por valor e com um numero especifico de obj
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels){
            if (lightNovel.getPrice() <= 4.99){
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >=3){
                break;
            }
        }
        System.out.println(titles);





    }
}
