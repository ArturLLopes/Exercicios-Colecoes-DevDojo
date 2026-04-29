package optional;

import optional.dominio.Manga;
import optional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalEx2 {
    public static void main(String[] args) {

        //Buscando por nome
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Pokemon");
        mangaByTitle.ifPresent(m -> m.setTitle("Pokemon 2"));
        System.out.println(mangaByTitle);

        //Buscando por id e dando erro
        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalAccessError::new);
        System.out.println(mangaById);

        //Adicionando um novo manga
        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 23));
        System.out.println(newManga);
    }
}
