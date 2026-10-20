import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] number = {10, 2, 3, 4, 5, 6};



        String[] names = {"Asilbek", "Ali", "Azizbek", "Shoxjahon"};
        System.out.println(Arrays.toString(names));

        Arrays.sort(number);
        System.out.println(Arrays.binarySearch(number, 4));
        System.out.println(Arrays.toString(number));
    }
}