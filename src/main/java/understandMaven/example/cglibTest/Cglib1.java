package understandMaven.example.cglibTest;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Cglib1 implements MethodInterceptor {

    private void add(){
        System.out.println("我增加了一个功能...");
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        System.out.println("调用前");
        Object result = methodProxy.invokeSuper(o, objects);
//        System.out.println("杀人啦。。。");
        add();
        return null;
    }
}
