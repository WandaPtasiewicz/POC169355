package pl.uwm.edu.zad20;

import java.util.Objects;
import java.util.SplittableRandom;

class Book {
     private String author;
     private String tittle;
     private int yearOfPublication;

    public Book(String author, String tittle, int yearOfPublication) {
        this.author = author;
        this.tittle = tittle;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "author='" + author + '\'' +
                ", tittle='" + tittle + '\'' +
                ", yearOfPublication=" + yearOfPublication ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return author != null ? author.hashCode() : 0;
    }

}
