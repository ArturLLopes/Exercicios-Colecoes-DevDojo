package optional.repositorio;

import optional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Boku no hero", 50),
            new Manga(2, "Overlord", 30),
            new Manga(3, "Pokemon", 200));

    public static Optional<Manga> findByTitle(String title) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (manga.getTitle().equals(title)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

    public static Optional<Manga> findById(Integer id) {
        //usando o metodo criado findBy para simplificar o codigo
        return findBy(m -> m.getTitle().equals(id));
    }

    //---------*********-------------
    //metodo usando o Optional + predicate para generalizar a ação de procura
    //posibilitando um codigo mais compactado

    private static Optional<Manga> findBy(Predicate<Manga> predicate){
            Manga found = null;
            for (Manga manga : mangas){
                if (predicate.test(manga)){
                    found = manga;
                }
            }
            return Optional.ofNullable(found);
    }
}
