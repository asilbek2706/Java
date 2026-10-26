public class Person {
    String name;
    String surname;
    String country;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.country = "Uzbekistan";
        this.sayHello();
    }

    public void printDetail() {
        System.out.println(name + " " + surname + " " + country);
        sayHello();
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}