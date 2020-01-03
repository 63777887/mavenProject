package understandMaven.example.testThree.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Dynamicproxy implements InvocationHandler {

    Object o;

    public Dynamicproxy(Object o) {
        this.o=o;
    }

    public void add(){
        System.out.println("增加了一个静态方法");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        method.invoke(o,args);
        add();

        return null;
    }
}
