package understandMaven.example.test1.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class StudentAdmin {
     HashMap students=new LinkedHashMap<>();
    public void create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生信息：");
        System.out.println("姓名：");
        String s=sc.next();
        System.out.println("年龄：");
        int age=sc.nextInt();
        Student student= new Student(s,age);
        intindex(student);
        students.put(student.getNumber(),student);
    }
    public void select(Student student){
        if (students.containsValue(student)){
            System.out.println("找到该学生信息---"+student.toString());
        }else {
            System.out.println("该学生不存在");
        }
    }
    public void update(int n,Student student){
        if (students.containsKey(n)) {
            students.put(n, student);
        }else {
            System.out.println("不存在该学生");
        }
    }
    public void delete(int n,Student student){
        if (students.containsKey(n)){
            students.remove(n);
            students.remove(students.get(n));
        }else {
            System.out.println("不存在该学生");
        }
    }
    public void input(int n){
        if (students.containsKey(n)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("python分数：");
            int python = sc.nextInt();
            System.out.println("java分数：");
            int java = sc.nextInt();
            System.out.println("linux分数：");
            int linux = sc.nextInt();
            System.out.println("sql分数：");
            int sql = sc.nextInt();
            Student s=(Student) students.get(n);
            s.setPython(python);
            s.setJava(java);
            s.setLinux(linux);
            s.setSql(sql);
        }else {
            System.out.println("不存在该学生");
        }

    }
    public void menu(){

    }
    public void intindex(Student student){
        System.out.println("请输入学生编号");
        Scanner scanner=new Scanner(System.in);
        student.setNumber(scanner.nextInt());

    }
    public void print(ArrayList list){

    }
}
