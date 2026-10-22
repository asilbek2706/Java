import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean b = true;

        while (b) {
            menu();
            int n = getMenuNumber();

            switch (n) {
                case 1:
                    //
                    break;
                case 2:
                    //
                    break;
                case 3:
                    //
                    break;
                case 4:
                    //
                    break;
                case 0:
                    b = false;
                    break;
                default:
                    System.out.println("Mazgi, invalid input!");
            }
        }

        System.out.println("The end!");
    }

    public static void menu() {

        System.out.println("--- Menu ---");
        System.out.println("1 - Add Contact");
        System.out.println("2 - Contact List");
        System.out.println("3 - Search");
        System.out.println("4 - Delete Contact");
        System.out.println("0 - EXIT");

    }

    public static int getMenuNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose Menu: ");
        int num = scanner.nextInt();

        scanner.close();
        return num;

    }
}