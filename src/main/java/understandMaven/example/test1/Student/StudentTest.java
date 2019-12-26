package understandMaven.example.test1.Student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        StudentAdmin studentAdmin=new StudentAdmin();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入编号执行操作。10：添加学生"+'\n'+"11:查找学生"+'\n'+"12根据编号更新学生信息"+'\n'+"根据编号删除学生"+'\n'+"14:根据编号录入成绩"+'\n'+"15:根据某门成绩排序"+'\n'+"16:根据总成绩排序");
            switch (sc.nextInt()){
                case 10:
            }
        }

    }
}
