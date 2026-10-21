import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int age = getAge();
        System.out.printf("Your age is %d", age);*/

        Object[] userDetail = getUserDetail();
        String name = (String) userDetail[0];
        String surname = (String) userDetail[1];
        int age = (int) userDetail[2];

        System.out.printf("Your name is %s\n", name);
        System.out.printf("Your surname is %s\n", surname);
        System.out.printf("Your age is %d\n", age);
    }

    public static int getAge() {
        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        scanner.close();
        return age;
    }

    public static Object[] getUserDetail() {
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        String surname;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your surname: ");
        surname = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        scanner.close();

//        return new Object[]{name, surname, age};

        Object[] obj = new Object[3];
        obj[0] = name;
        obj[1] = surname;
        obj[2] = age;

        return obj;
    }

}