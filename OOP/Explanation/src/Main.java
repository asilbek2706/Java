public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Ali");
        person.setSurname("Aliyev");

        person.printDetail();

        Professor professor = new Professor();
        professor.setName("Mulla");
        professor.setSurname("Mullayev");
        professor.setSubjectName("Java");
        professor.printDetail();
        System.out.println(professor.getSubjectName());

    }
}