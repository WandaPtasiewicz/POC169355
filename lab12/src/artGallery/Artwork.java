package artGallery;

public class Artwork {
    private int artworkId;
    private String title;
    private String lastName;

    public Artwork(int artworkId, String title, String lastName) {
        this.artworkId = artworkId;
        this.title = title;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "artworkId=" + artworkId +
                ", title='" + title + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
