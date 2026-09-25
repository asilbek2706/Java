import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();
//        String name = scanner.next(); --> next() doesn't read any spaces

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old!");

        if (isStudent) {
            System.out.println("You are a student");

            System.out.print("What is your gpa: ");
            double gpa = scanner.nextDouble();

            if (gpa > 3.0) {
                System.out.println("Your gpa is good: " + gpa);
            } else {
                System.out.println("Your gpa is low: " + gpa);
            }

        } else {
            System.out.println("You are not a student");
        }

        // COMMON ISSUES
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favourite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color);

        scanner.close();*/

        // Calculate area of a rectangle
       /* double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The rectanle are is: " + area + "cm²");

        scanner.close();*/

        // Calculate perimetr of rectangle

        double width = 0;
        double height = 0;
        double perimeter = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        System.out.print("Enter height: ");
        height = scanner.nextDouble();

        perimeter = 2 * (width + height);

        System.out.println("The rectangle peremeter is: " + perimeter);

        scanner.close();

    }
}