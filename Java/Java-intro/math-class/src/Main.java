import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        // HYPOTENUSE c = Math.sqrt(a^2 + b^2)
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side c) is: " + c + "cm");

        scanner.close();*/

        // circumference  = 2 * Math.PI * radius
        // area  = Math.PI * Math.pow(radius, 2)
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm", circumference);
        System.out.printf("\nThe area is: %.1fcm^2", area);
        System.out.printf("\nThe volume is: %.1fcm^3", volume);


        scanner.close();
    }
}
