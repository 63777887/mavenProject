package understandMaven.example.testThree.singleton;

public class Person3 {
    private Person3() {
    }

    static Person3 person3;

    public static Person3 create(){
        if (person3==null) {
            synchronized (Person3.class) {
                if (person3 == null) {
                    person3 = new Person3();
                }
            }
        }
        return person3;
    }
}
