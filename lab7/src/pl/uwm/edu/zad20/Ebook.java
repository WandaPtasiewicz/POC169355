package pl.uwm.edu.zad20;

 class Ebook extends Book {
  private int fileSize;

  public Ebook(String author, String tittle, int yearOfPublication, int fileSize) {
   super(author, tittle, yearOfPublication);
   this.fileSize = fileSize;
  }

  public int getFileSize() {
   return fileSize;
  }

  public void setFileSize(int fileSize) {
   this.fileSize = fileSize;
  }

  @Override
  public String toString() {
   return super.toString() +
           ", fileSize=" + fileSize +
           '}';
  }

  @Override
  public boolean equals(Object o) {
   if (!super.equals(o)) return false;

   Ebook ebook = (Ebook) o;

      return fileSize == ebook.fileSize;
  }

  @Override
  public int hashCode() {
   int result = super.hashCode();
   result = 31 * result + fileSize;
   return result;
  }
 }
