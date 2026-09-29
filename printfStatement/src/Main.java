
public class Main {
    public static void main(String[] args){
        // printf() - is a method used to format output
        // %[flags][width][.precision][specifier-character]

        // [flags]
        // + = output a plus;
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space is positive

        // [width]
        // 0 = zero padding
        // number = right justified number
        // negative number = left justified number

        /*String name = "Asilbek";
        char letter = 'A';
        int age = 20;
        double height = 60.5;
        boolean isEmployee = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", letter);
        System.out.printf("Your age is %d\n", age);
        System.out.printf("Your height is %.1f\n", height);
        System.out.printf("Employed: %b\n", isEmployee);

        System.out.printf("%s is %d years old", name, age);*/

        /*double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -54000.76;

        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);*/

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
