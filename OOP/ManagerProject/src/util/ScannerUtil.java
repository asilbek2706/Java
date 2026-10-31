package util;

import java.util.Scanner;

public class ScannerUtil {
    public static int getMenuNumber() {
        System.out.print("Choose Menu: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
