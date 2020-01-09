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

    //    public static void main(String[] args) {
//        try {
//            Field []f=Person.class.getDeclaredFields();
//            Method m=Person.class.getDeclaredMethod("getAge",null);
//            m.setAccessible(true);
//            System.out.println(m.invoke(new Person(),null));
//            for (Field p : f) {
//                p.setAccessible(true);
//                System.out.println(p.get(new Person()));
//            }
//            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
//                e.printStackTrace();
//            }
//        int m = 9,n=15;
//       int [][]arr=new int[m][n];
//       int count=644;
//       for (int i=0;i<m;i++){
//           for (int j=0;j<n;j++){
//               arr[i][j]=count;
//               count++;
//           }
//       }
//        System.out.println(arr[2][2]);
//        System.out.println(arr[3][3]);
//        }
//}
    static class Foo {
        public static void main(String args[]) {
            try {
                return;
            } finally {
                System.out.println("Finally");
            }
        }
    }}
