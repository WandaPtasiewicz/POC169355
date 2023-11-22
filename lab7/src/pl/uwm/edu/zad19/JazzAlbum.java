package pl.uwm.edu.zad19;

import java.util.Objects;

class JazzAlbum extends MusicAlbum {

  private String jazzGenre;

  public JazzAlbum(String artist, String tittle, String jazzGenre) {
   super(artist, tittle);
   this.jazzGenre = jazzGenre;
  }

  public String getJazzGenre() {
   return jazzGenre;
  }

  public void setJazzGenre(String jazzGenre) {
   this.jazzGenre = jazzGenre;
  }

  @Override
  public String toString() {
   return super.toString()+
           "jazzGenre='" + jazzGenre + '\'' +
           '}';
  }

  @Override
  public boolean equals(Object o) {
   if (!super.equals(o)) return false;

   JazzAlbum jazzAlbum = (JazzAlbum) o;

   return Objects.equals(jazzGenre, jazzAlbum.jazzGenre);
  }

  @Override
  public int hashCode() {
   int result = super.hashCode();
   result = 31 * result + (jazzGenre != null ? jazzGenre.hashCode() : 0);
   return result;
  }
 }
