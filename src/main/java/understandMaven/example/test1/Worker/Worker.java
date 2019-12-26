package understandMaven.example.test1.Worker;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

 class Worker {
    String name;
    int age;
    double salary;
    public Worker(){}
    public Worker(String name, int age, double salary){
        this.name= name;
        this.age = age;
        this.salary = salary;
    }

     @Override
     public int hashCode() {
         return Objects.hash(name, age, salary);
     }

     int hashCode(String a){
         return (int) (name.hashCode() + age + salary);
     }
    public boolean equals(Worker w){
        if (w.name == name && w.salary == salary && w.age == age){
            return true;
        }else return false;
    }
}
  class TestWorker{
    public static void main(String args[]){
        Set set = new HashSet();
        set.add(new Worker("tom", 18, 2000));
        set.add(new Worker("tom", 18, 2000));
        set.add(new Worker("jerry", 18, 2000));
        System.out.println(set.size());
    }
}
