import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean b = true;

        while (b) {
            menu();
            int n = getMenuNumber();

            switch (n) {
                case 1:
                    Contact contact = addContact();
                    System.out.println(contact.name + " " + contact.surname + " " + contact.phone);
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

        return num;

    }

    public static Contact addContact(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter surname: ");
        String surname = scanner.next();

        System.out.print("Enter phone number: ");
        String phone = scanner.next();

        Contact contact = new Contact();
        contact.name = name;
        contact.surname = surname;
        contact.phone = phone;

        return contact;
    }
}