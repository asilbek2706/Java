package person;

public class Person {
    String name = "Ali";
    public int age;

    public void printDetail(){
        System.out.println(name + " " + age + " -> " + "person");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
