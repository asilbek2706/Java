import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Contact[] contactArr = new Contact[10];

        int currentIndex = 0;

        boolean b = true;

        while (b) {
            menu();
            int n = getMenuNumber();

            switch (n) {
                case 1:
                    Contact contact = addContact();
                    if (isValidContact(contact)) {
                        contactArr[currentIndex] = contact;
                        currentIndex++;
                        System.out.println("Contact added.");
                    }
                    break;
                case 2:
                    for (Contact c : contactArr) {
                        if (c != null) {
                            System.out.println("Name   |   Surname |   Phone   ");
                            System.out.println(c.name + " | " + c.surname + " | " + c.phone);
                        }
                    }
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

    public static Contact addContact() {
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

    public static boolean isValidContact(Contact contact) {

        if (contact.name == null || contact.name.trim().length() < 3) {
            System.out.println("Name is wrong");
            return false;
        }

        if (contact.surname == null || contact.surname.trim().length() < 3) {
            System.out.println("Surname is wrong");
            return false;
        }

        if (contact.phone == null || contact.phone.trim().length() != 12 || !contact.phone.startsWith("998")) {
            System.out.println("Enter phone like this: 998505343434");
            return false;
        }

        char[] phoneArr = contact.phone.toCharArray();

        for (char c : phoneArr) {
            //if (!Character.isDigit(c))

            if (c < '0' || c > '9') {
                System.out.println("The phone must include numbers!!!");
                return false;
            }
        }
        return true;
    }
}