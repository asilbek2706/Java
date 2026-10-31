public class Person {
    public static String nickname;
    public String name;

    static {
        System.out.println("Inside Static Block");
        nickname = "Mazgi";
    }

    public void printDetail() {
        System.out.println(name + " " + nickname);
        testStatic();
    }

    public static void testStatic() {
        System.out.println(nickname);
    }

}
