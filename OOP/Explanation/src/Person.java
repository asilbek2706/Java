
public class Person {
    private String name;
    private String surname;

    public Person() {

    }

    public void setName(String name) {
        this.name = name.trim().toUpperCase();
    }

    public void setSurname(String surname) {
        this.surname = surname.trim().toUpperCase();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void printDetail() {
        System.out.println("Name -> " + name + "\n" + "Surname -> " + surname);
    }
}