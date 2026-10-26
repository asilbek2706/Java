public class Person {
    String name;
    String surname;
    String country;

    public Person() {
        this("Asilbek", "Karomatov");
        this.country = "Uzbekistan";
    }


    public Person(String name, String surname) {
//        this();
        this.name = name;
        this.surname = surname;
    }

    public void printDetail() {
        System.out.println(name + " " + surname + " " + country);
//        sayHello();
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}