public class Main {

    public static void main(String[] args){
        User user1 = new User();
        user1.name = "Asilbek";
        user1.surname = "Karomatov";
        user1.age = 20;

        User user2 = new User();
        user2.name = "Ali";
        user2.surname = "Valiyev";
        user2.age = 22;

        System.out.println(user1.nameToUpper());
        System.out.println(user2.nameToUpper());

        /*System.out.println(user1.toString());
        System.out.println(user2.toString());*/

        /*user1.printDetail();
        user2.printDetail();*/

//        System.out.println(user1.name + " " + user1.surname + " ");
    }

}