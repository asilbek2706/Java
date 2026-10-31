public class Main {
    public static void main(String[] args) {
//        int n = 5;
//        changeValue(n);
//        System.out.println(n);

        Person person = new Person();
        person.name = "Asilbek";
        System.out.println(person.name);
        changeValue(person);
        System.out.println(person.name);
    }

    public static void changeValue(Person person) {
        person.name = "Asil";
    }

    public static void changeValue(int value) {
        value = 15;
    }
}