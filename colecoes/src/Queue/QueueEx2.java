package Queue;


import entity.Manga;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class QueueEx2 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(1L, "Breserkk", 9.9, 5));
        mangas.add(new Manga(5L, "Hellsing", 19.9, 0));
        mangas.add(new Manga(3L, "Pokemon", 190.9, 0));
        mangas.add(new Manga(2L, "Dragon ball", 21.9, 0));
        mangas.add(new Manga(4L, "Attackk on Titan", 3.9, 2));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
