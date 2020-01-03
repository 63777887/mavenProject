package understandMaven.example.testThree.singleton;

public class Person2 {
    private Person2() {
    }

    static Person2 person;

    public static Person2 create(){
        if (person==null){
            person=new Person2();
        }
        return person;
    }
}
