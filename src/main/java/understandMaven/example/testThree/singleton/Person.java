package understandMaven.example.testThree.singleton;

public class Person {
    private static Person person=new Person();

    private Person() {
    }

    public static Person create(){
        return person;
    }
}
