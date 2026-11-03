package FirstProgram;

import java.util.Scanner;

public class FirstProgram {
    public static void positiveNegative() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

}
