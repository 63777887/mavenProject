package understandMaven.example.testThree.cgilb;

import net.sf.cglib.proxy.Enhancer;

public class CgilbTest {
    public static void main(String[] args) {

        Enhancer enhancer=new Enhancer();   //创建Enhancer对象，类似于JDK动态代理的proxy类，然后就是设置参数

        enhancer.setSuperclass(Person.class);   //设置目标类的字节码文件，设为父对象

        enhancer.setCallback(new Cgilb2()); //设置回调函数

        Person person=(Person) enhancer.create();   //create方法，正式创建代理类
        person.show();

    }
}
