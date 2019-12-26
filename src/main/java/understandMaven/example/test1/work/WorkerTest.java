package understandMaven.example.test1.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkerTest {
    public static void main(String[] args) {
        List list=new ArrayList();
        Worker worker1=new Worker("zhang3", 18 ,3000);
        Worker worker2=new Worker("li4", 25 ,3500);
        Worker worker3=new Worker("wang5", 22 ,3200);
        list.add(worker1);
        list.add(worker2);
        list.add(worker3);
        Worker worker4=new Worker("zhao6",24,3300);
        list.add(1,worker4);
        list.remove(worker3);
        for (Object w :
                list) {
            Worker temp=(Worker)w;
            System.out.println("姓名："+temp.getName()+"   年龄："+temp.getAge()+"   工资："+temp.getSalary());
        }
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            Worker wo=(Worker) iterator.next();
            wo.work();
        }
        System.out.println(worker1.hashCode());
    }
}
