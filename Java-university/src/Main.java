public class Main {
    public static void main(String[] args) {

        System.out.print("===Student form===\n");
        studentForm();

    }


    public static void studentForm() {
        int percentage = 40;

        if (percentage >= 90) {
            System.out.println("A+");
        } else if (percentage >= 80) {
            System.out.println("A");
        } else if (percentage >= 70) {
            System.out.println("B+");
        } else if (percentage >= 60) {
            System.out.println("B");
        } else if (percentage >= 50) {
            System.out.println("C+");
        } else if (percentage >= 40) {
            System.out.println("C");
        } else {
            System.out.println("Fail!!!");
        }
    }

}