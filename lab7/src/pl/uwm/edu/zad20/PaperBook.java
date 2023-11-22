package pl.uwm.edu.zad20;

 class PaperBook extends Book{
  private int numberOfPages;

  public PaperBook(String author, String tittle, int yearOfPublication, int numberOfPages) {
   super(author, tittle, yearOfPublication);
   this.numberOfPages = numberOfPages;
  }

  public int getNumberOfPages() {
   return numberOfPages;
  }

  public void setNumberOfPages(int numberOfPages) {
   this.numberOfPages = numberOfPages;
  }

  @Override
  public String toString() {
   return super.toString() +
           ", numberOfPages=" + numberOfPages +
           '}';
  }

  @Override
  public boolean equals(Object o) {
   if (!super.equals(o)) return false;

   PaperBook paperBook = (PaperBook) o;

      return numberOfPages == paperBook.numberOfPages;
  }

  @Override
  public int hashCode() {
   int result = super.hashCode();
   result = 31 * result + numberOfPages;
   return result;
  }
 }
