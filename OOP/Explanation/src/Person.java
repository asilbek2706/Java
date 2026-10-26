public class Person {
    String name;
    String surname;
    String country;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.country = "Uzbekistan";
    }

    public void printDetail() {
        System.out.println(this);
        System.out.println(name + " " + surname + " " + country);
    }
}