package SixthProgram;

import java.util.Scanner;

public class SixthProgram {
    public static void zeroOrNot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println(num + " is Zero");
        } else {
            System.out.println(num + " is non-zero");
        }
    }

}
