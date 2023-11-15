package pl.edu.uwm.zad1;

import java.util.Objects;

class Person {
     private String lastName;
     private String firstName;
     private int age;

     public Person(String lastName, String firstName, int age){

      this.firstName=(firstName==null || firstName.isEmpty())?"" :firstName;
      this.firstName=(lastName==null || lastName.isEmpty())?"" :lastName;
      this.age=(age<0)?0:age;
     }

  public String getFirstName() {
   return firstName;
  }

  public void setFirstName(String firstName) {
   this.firstName = firstName;
  }

  public String getLastName() {
   return lastName;
  }

  public void setLastName(String lastName) {
   this.lastName = lastName;
  }

  public int getAge() {
   return age;
  }

  public void setAge(int age) {
   this.age = age;
  }

  @Override
  public String toString() {
   return "Person: " + lastName+" "+firstName+
           ", Age=" + age +
           '.';
  }


  @Override
  public boolean equals(Object o){
      if(this==o) return true;
      if(o==null || getClass() !=o.getClass()) return false;

      Person person = (Person)o;

      if(age != person.age)return false;
      if(!Objects.equals(firstName,person.firstName))return false;
      return Objects.equals(lastName,person.lastName);
  }



 @Override
 public int hashCode(){
    int result = firstName.hashCode();
    result = 31 + result + lastName.hashCode();
    result = 31 + result + age;
    return result;

  }
 }
