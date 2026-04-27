package Map;

import entity.Consumidor;
import entity.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Artur Lopes");
        Consumidor consumidor2 = new Consumidor("Mauricio Lopes");

        Manga manga1 = new Manga(1L,"Breserkk", 9.9);
        Manga manga2 = new Manga(5L,"Hellsing", 19.9);
        Manga manga3 = new Manga(3L,"Pokemon", 190.9);
        Manga manga4 = new Manga(5L,"Dragon ball", 21.9);
        Manga manga5 = new Manga(4L,"Attackk on Titan", 3.9);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }

        System.out.println("----------------------------");
        //Desta forma é possivel usar um chave com uma lista de obj
        List<Manga> consumdorManga1 = List.of(manga1,manga3,manga5);
        List<Manga> consumdorManga2 = List.of(manga2,manga4);
        Map<Consumidor, List<Manga>> consumidorListMap = new HashMap<>();
        consumidorListMap.put(consumidor1, consumdorManga1);
        consumidorListMap.put(consumidor2, consumdorManga2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorListMap.entrySet()){
            System.out.println("------"+ entry.getKey().getNome());
            for (Manga manga : entry.getValue()){
                System.out.println("---------" + manga.getNome());
            }

        }

    }
}
