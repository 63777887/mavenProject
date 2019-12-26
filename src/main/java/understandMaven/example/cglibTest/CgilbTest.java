package understandMaven.example.cglibTest;


import net.sf.cglib.proxy.Enhancer;

public class CgilbTest  {

    public static void main(String[] args) {

        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback(new Cglib1());
        Person person=(Person)enhancer.create();
        person.submit("打我");
        person.defend();

    }

}
