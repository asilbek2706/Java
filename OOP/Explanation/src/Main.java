public class Main {

    public static void main(String[] args){

        Person person1 = new Person();
        person1.name = "Alish";
        person1.surname = "Aliyev";

        Person person2 = new Person("Vali");

        Person person3 = new Person("Asilbek", "Karomatov");


        System.out.println(person1.name + " " + person1.surname);
        System.out.println(person2.name);
    }

}