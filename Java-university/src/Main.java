public class Main {
    public static void main(String[] args) {
        System.out.println("--- Eligible or not voting---");
        voting();

        System.out.println();

        System.out.println("--- Eligible for Write exam or not ---");
        writeExam();

    }

    public static void voting() {
        int age = 18;

        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }
    }

    public static void writeExam() {
        int attendence = 70;

        if (attendence >= 70) {
            System.out.println("Eligible for Write an exam");
        } else {
            System.out.println("You can't Write!");
        }
    }
}