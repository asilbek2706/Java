public class Main {
    public static void main(String[] args) {

       /* int[] numbers = {1, 2, 3, 4, 5};

        int[] oddNumbers = new int[10_000];

        int[] mixNumbers = new int[10_000];

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.print("---------------\n");

        int n = 0;
        while (n < numbers.length) {
            System.out.println(numbers[n]);
            n++;
        }*/

       int[] a = {3, 6, 8, 31, 7, 9, 2};

       int aIndex = 1;

       int[] b = new int[a.length / 2];

        for (int i = 0; i < b.length; i++) {
            b[i] = a[aIndex];
            aIndex += 2;
        }

        for (int j : b) {
            System.out.println(j);
        }
    }
}
