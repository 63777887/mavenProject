package understandMaven.example.testThree.cgilb;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Cgilb2 implements MethodInterceptor {

    public void add(){
        System.out.println("增加了一个动态方法");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {


        methodProxy.invokeSuper(o,objects);
        add();


        return null;
    }
}
