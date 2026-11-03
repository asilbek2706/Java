package ThirdProgram;

import java.util.Scanner;

public class ThirdProgram {
    public static void vote() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not eligible for vote");

        }
    }

}
