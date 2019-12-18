package understandMaven.example;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream(new File("a.txt")));
        oo.writeObject(new Person("张三",12));
        oo.writeObject(new Person("张",22));
        oo.writeObject(new Person("三",32));
        oo.flush();
        oo.close();
        ObjectInputStream op=new ObjectInputStream(new FileInputStream(new File("a.txt")));
        Person p;
        try {
            while((p=(Person) op.readObject())!=null) {
                System.out.println(p.getName() + "---" + p.getAge());
            }
        }catch (EOFException e){
            System.out.println("结束");
        }

        op.close();
    }
}
