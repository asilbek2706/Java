public class Person {
    String name;
    String surname;

    public Person() {
       name = "Mazgi";
       surname = "Mazgiyev";
    }

    public Person(String personName) {
        System.out.println(personName + " Constructor");
    }

    public Person(String name, String surname) {
        System.out.println(name + " " + surname + " Constructor");
    }
}