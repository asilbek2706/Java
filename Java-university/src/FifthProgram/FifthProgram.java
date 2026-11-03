package FifthProgram;

import java.util.Scanner;

public class FifthProgram {
    public static void passOrNot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter passing mark: ");
        double passingMark = scanner.nextDouble();

        System.out.print("Enter your mark: ");
        double ownMark = scanner.nextDouble();

        if (ownMark >= passingMark) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

    }

}
