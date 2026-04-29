package lambdas.dominio;

public class Anime {
    private String title;
    private int episodes;

    public Anime(String title, int quantity) {
        this.title = title;
        this.episodes = quantity;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", quantity=" + episodes +
                '}';
    }
}
