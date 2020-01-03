package understandMaven.example.reflectDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Dynamicproxy implements InvocationHandler {

    private Object object;      //代理类可以代理所有的对象

    public Dynamicproxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行代理目标的方法

        method.invoke(object,args);
        System.out.println("我添加了一个功能");


        return null;
    }
}
