public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        //person1.name = "Asilbek";
        person1.setName("   Asilbek   ");
        person1.setSurname("  karomatov  ");


        System.out.println(person1.getName());
        System.out.println(person1.getSurname());

        person1.printDetail();
    }

}