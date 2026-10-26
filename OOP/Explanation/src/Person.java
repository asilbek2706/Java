
public class Person {
    private String name;
    String surname;

    public Person() {

    }

    public void setName(String name){
        this.name = name.trim().toUpperCase();
    }

    public void printDetail() {
        System.out.println(name + " " + surname);
    }
}