package understandMaven.example.testThree.JDK;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Lawsuit lawsuit=new Person();
        Dynamicproxy dynamicproxy=new Dynamicproxy(lawsuit);
        Lawsuit l=(Lawsuit) Proxy.newProxyInstance(lawsuit.getClass().getClassLoader(),lawsuit.getClass().getInterfaces(),dynamicproxy);
        l.show();
    }
}
