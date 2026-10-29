import person.Person;
import test.TestCase;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Asilbek";
        student.age = 20;
        student.printDetail();

        TestCase testCase = new TestCase();
        testCase.startTest();

    }
}
