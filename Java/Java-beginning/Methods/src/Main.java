import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        String num = minusPlus(number);
        System.out.print(num);

        scanner.close();
    }

    public static String minusPlus(int number) {
        if (number >= 0) return "Musbat";
        else return "Manfiy";
    }
}