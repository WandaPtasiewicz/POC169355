package videoGames;

public class Game implements Comparable<Game>{
    private  String title;
    private String developer;
    private int yearReleased;
    private String genre;

    @Override
    public int compareTo(Game o) {
        return genre.compareTo(o.genre);
    }

    public Game(String title, String developer, int yearReleased, String genre) {
        this.title = title;
        this.developer = developer;
        this.yearReleased = yearReleased;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", developer='" + developer + '\'' +
                ", yearReleased=" + yearReleased +
                ", genre='" + genre + '\'' +
                '}';
    }
}
