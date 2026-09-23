public class Main {

    public static void main(String[] args) {

        // PRIMITIVE DATA TYPES
        int age = 21;
        int year = 2026;
        int quantity = 1;

        double price = 90.98;
        double gpa = 4.65;
        double temp = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = true;

        if (isStudent) {
//            System.out.println("You are a student");
        } else {
//            System.out.println("You are not a student");
        }

        // REFERENCE DATA TYPES
        String name = "Asilbek";
        String food = "pizza";
        String email = "fake1234@gmail.com";
        String color = "red";
        String car = "bmw";

        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is " + currency + price);

        if (forSale) {
            System.out.println("There is a " + car + " for sale.");
        } else {
            System.out.println("The " + car + " is not for sale.");

        }
    }

}