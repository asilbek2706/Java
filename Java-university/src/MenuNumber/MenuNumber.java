package MenuNumber;

import java.util.Scanner;

public class MenuNumber {
    public static int getMenuNumber() {
        System.out.print("Choose Menu: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
