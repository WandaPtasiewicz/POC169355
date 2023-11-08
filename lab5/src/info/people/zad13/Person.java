package info.people.zad13;

class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    public Person(String firstName,String lastName,String address, int age){
        this.address=address;
        this.age=age;
        this.lastName=lastName;
        this.firstName=firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
            this.firstName = firstName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String introduceYourself(){
      return this.firstName+ " "+ this.lastName+" "+this.address+" "+this.age;
    }
}
