package test;

import person.Person;

public class TestCase {
    public void startTest(){
        Person person = new Person();
        person.name = "Ali";
        person.age = 19;
        person.printDetail();

    }
}
