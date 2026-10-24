import java.util.Scanner;

public class ContactManager {
    Contact[] contactArr = new Contact[10];
    int currentIndex = 0;

    public void start() {
        boolean b = true;
        while (b) {
            menu();
            int n = getMenuNumber();

            switch (n) {
                case 1:
                    Contact contact = addContact();
                    addToArray(contact);
                    break;
                case 2:
                    printContactList();
                    break;
                case 3:
                    String query = getQuery();
                    search(query);
                    break;
                case 4:
                    String phone = deleteContact();
                    deleteContactFromArr(phone);
                    break;
                case 0:
                    b = false;
                    break;
                default:
                    System.out.println("Mazgi, invalid input!");
            }
        }
    }

    public void menu() {

        System.out.println("--- Menu ---");
        System.out.println("1 - Add Contact");
        System.out.println("2 - Contact List");
        System.out.println("3 - Search");
        System.out.println("4 - Delete Contact");
        System.out.println("0 - EXIT");

    }

    public int getMenuNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose Menu: ");

        return scanner.nextInt();

    }

    public Contact addContact() {
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

    public void addToArray(Contact contact) {
        if (!isValidContact(contact)) {
            return;
        }

        if (isPhoneExist(contact.phone)) {
            System.out.println("Phone number exists, Mazgi!");
            return;
        }

        if (currentIndex == contactArr.length) {
            Contact[] newArr = new Contact[contactArr.length * 2];

            System.arraycopy(contactArr, 0, newArr, 0, contactArr.length);
            contactArr = newArr;
        }

        contactArr[currentIndex] = contact;
        currentIndex++;
        System.out.println("Contact added.");

    }

    public boolean isPhoneExist(String phone) {
        for (Contact contact : contactArr) {
            if (contact != null && contact.phone.equals(phone)) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidContact(Contact contact) {

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

    public void printContactList() {
        for (Contact c : contactArr) {
            if (c != null) {
                System.out.println("Name   |   Surname |   Phone   ");
                System.out.println(c.name + " | " + c.surname + " | " + c.phone);
            }
        }
    }

    public String getQuery() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter query: ");

        return scanner.next();
    }

    public void search(String query) {
        query = query.toLowerCase();
        for (Contact contact : contactArr) {
            if (contact == null) {
                continue;
            }

            if (contact.name.toLowerCase().contains(query) || contact.surname.toLowerCase().contains(query) || contact.phone.contains(query)) {
                System.out.println(contact.name + " | " + contact.surname + " | " + contact.phone);

            }
        }
        System.out.println("Mazgi, Contact not found!");
    }

    public String deleteContact() {
        System.out.print("Enter phone: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void deleteContactFromArr(String phone) {
        for (int i = 0; i < contactArr.length; i++) {
            Contact contact = contactArr[i];
            if (contact != null && contact.phone.equals(phone)) {
                contactArr[i] = null;
                System.out.println("Contact deleted, Mazgi!");
                break;
            }
        }
        System.out.println("Contact didn't delete, Mazgi!!!");
    }
}
