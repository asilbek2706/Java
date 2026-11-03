package SecondProgram;

import java.util.Scanner;

public class SecondProgram {
    public static void evenOdd() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

}
