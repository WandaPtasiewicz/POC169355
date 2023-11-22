package pl.edu.uwm.smartphones;

import java.util.Objects;

class Smartphone {
     private String model;

     public Smartphone(String model) {
         this.model = model;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         Smartphone that = (Smartphone) o;

         return Objects.equals(model, that.model);
     }

     @Override
     public int hashCode() {
         return model != null ? model.hashCode() : 0;
     }
 }
