package pl.uwm.edu.zad19;

import java.util.ArrayList;
import java.util.Objects;

class MusicAlbum {
    private String artist;
    private String tittle;
    private ArrayList<Integer> ratings=new ArrayList<>();

    public MusicAlbum(String artist, String tittle) {
        this.artist = artist;
        this.tittle = tittle;

    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public ArrayList<Integer> getRatings() {

        return ratings;
    }

    public void setRatings(ArrayList<Integer> ratings) {

        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "MusicAlbum{" +
                "artist='" + artist + '\'' +
                ", tittle='" + tittle + '\'' +
                ", ratings=" + ratings +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicAlbum that = (MusicAlbum) o;

        if (!Objects.equals(artist, that.artist)) return false;
        if (!Objects.equals(tittle, that.tittle)) return false;
        return Objects.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = artist != null ? artist.hashCode() : 0;
        result = 31 * result + (tittle != null ? tittle.hashCode() : 0);
        result = 31 * result + (ratings != null ? ratings.hashCode() : 0);
        return result;
    }
}
