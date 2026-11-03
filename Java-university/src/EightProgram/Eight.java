package EightProgram;

import java.util.Scanner;

public class Eight {
    public static void gradesDisplay() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("A Grade");
        } else if (grade >= 75 && grade < 90) {
            System.out.println("B Grade");
        } else if (grade >= 50 && grade < 75) {
            System.out.println("C Grade");
        } else {
            System.out.println("Fail");
        }
    }

}
