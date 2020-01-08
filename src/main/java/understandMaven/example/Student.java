package understandMaven.example;

import com.sun.deploy.util.ReflectionUtil;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        try {
            Field []f=Person.class.getDeclaredFields();
            Method m=Person.class.getDeclaredMethod("getAge",null);
            m.setAccessible(true);
            System.out.println(m.invoke(new Person(),null));
            for (Field p :
                    f) {
                p.setAccessible(true);
                System.out.println(p.get(new Person()));
            }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }



        }
}
