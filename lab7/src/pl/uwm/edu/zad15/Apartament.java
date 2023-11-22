package pl.uwm.edu.zad15;

 class Apartament extends Property{
     private int floorNumber;

     public Apartament(String address, int size, double price, int floorNumber) {
         super(address, size, price);
         this.floorNumber = floorNumber;
     }

     public int getFloorNumber() {
         return floorNumber;
     }

     public void setFloorNumber(int floorNumber) {
         this.floorNumber = floorNumber;
     }

     @Override
     public String toString() {
         return super.toString() +
                 "floorNumber=" + floorNumber +
                 '}';
     }

     @Override
     public boolean equals(Object o) {
         if (!super.equals(o)) return false;

         Apartament that = (Apartament) o;

         return floorNumber == that.floorNumber;
     }

     @Override
     public int hashCode() {
         int result = super.hashCode();
         result = 31 * result + floorNumber;
         return result;
     }
 }
