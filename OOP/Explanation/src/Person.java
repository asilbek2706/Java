public class Person {
    String name;
    String surname;

    public Person() {
        System.out.println("Person Constructor!");
    }

    public Person(String personName) {
        System.out.println(personName + " Constructor");
    }

    public Person(String name, String surname) {
        System.out.println(name + " " + surname + " Constructor");
    }
}