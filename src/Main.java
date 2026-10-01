import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nested-if statement

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.8;
            } else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }

        } else {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;

            } else {
                price *= 1;
            }
        }

        System.out.printf("The price of a ticket is: $%.2f", price);

    }
}