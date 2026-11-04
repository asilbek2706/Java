public class Main {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.print(c);
        } catch (ArithmeticException e) {
            System.out.println("Error is happening");
        } finally {
            System.out.println("Cleanup function");
        }
    }
}