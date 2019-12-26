package understandMaven.example.reflectDemo;

import java.lang.reflect.Proxy;

public class Demo {
    public static void main(String[] args) {


        Lawsuit lawsuit=new Person();       //打官司的人
        Dynamicproxy dynamicproxy=new Dynamicproxy(lawsuit);

        Lawsuit o= (Lawsuit)Proxy.newProxyInstance(lawsuit.getClass().getClassLoader(),lawsuit.getClass().getInterfaces(),dynamicproxy);
        o.submit("他偷我东西");
        o.defend();


    }
}
