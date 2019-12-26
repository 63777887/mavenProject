package understandMaven.example.jdbc.student;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class JdbcTest {
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement sta=null;
        List list=new ArrayList();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Crush_course";
            con= DriverManager.getConnection(url,"root","Awert159");
//            sta=con.createStatement();
//            String sql="create table student("+
//                    "id INTEGER primary key,"+
//                    "name varchar(255),"+
//                    "score INTEGER,"+
//                    "address varchar(255),"+
//                    "date varchar(255));";
//            String sql1="alter table student modify id INTEGER auto_increment;";
//            String sql2="insert into student (name,score,address,date) values ('张三',68,'南京','2019,12,23');";
//            String sql3="insert into student (name,score,address,date) values ('李四',87,'北京','2019,12,25');";
//            String sql4="insert into student (name,score,address,date) values ('王五',97,'上海','2019,12,22');";
//            String sql5="insert into student (name,score,address,date) values ('赵六',56,'杭州','2019,12,29');";
//            String sql6="insert into student (name,score,address,date) values ('王麻子',68,'深圳','2019,11,13');";
//            String sql7="insert into student (name,score,address,date) values ('张小狗',63,'云南','2019,12,19');";
//            String sql10="insert into student (name,score,address,date) values ('张花狗',63,'云南','2019,12,19');";
//            String sql12="insert into student (name,score,address,date) values ('周大生',63,'云南','2019,12,19');";
//            String sql13="insert into student (name,score,address,date) values ('周打卡',63,'云南','2019,12,19');";
//            String sql14="insert into student (name,score,address,date) values ('周快乐',63,'云南','2019,12,19');";
//            String sql8="delete from student where name='王五';";
//            String sql9="update student set name='亚索' where id=3";
//            String sql11="select * from student where name like '%花%';";
//            System.out.println(sql8);
//            ResultSet resultSet= sta.executeQuery(sql11);
//            while (resultSet.next()){
//                Student student=new Student();
//                student.setId(resultSet.getInt(1));
//                student.setName(resultSet.getNString(2));
//                student.setScore(resultSet.getInt(3));
//                student.setAddress(resultSet.getNString(4));
//                student.setDate(resultSet.getNString(5));
//                System.out.println("dasjkl"+resultSet.getNString(2));
//                list.add(student);
//            }
//
//            for (Object o :
//                    list) {
//                Student temp=(Student)o;
//                System.out.println(temp.toString());
//            }
//            List list1=new ArrayList();
//            HashMap hashMap=new LinkedHashMap();
//            String s="select * from student where name like '%周%';";
//            ResultSet resultSet1= sta.executeQuery(s);
//            while (resultSet1.next()){
//                int n=resultSet1.getInt(1);
//                int n1=resultSet1.getInt(3);
//                list1.add(n);
//                hashMap.put(n,n1);
//            }
//            for (int i = 0; i < list1.size(); i++) {
//                int sc1=(int)hashMap.get(list1.get(i))+5;
//                sta.executeUpdate("update student set "+"score = "+sc1 +" where id= "+list1.get(i)+';');
//                System.out.println("update student set "+"score = "+sc1 +" where id= "+list1.get(i)+';');
//            }
            String ss1="delete from student where name like ?";
            String sql40="insert into student (name,score,address,date) values (?,?,?,?);";
            sta=con.prepareStatement(ss1);
            Student student=new Student("周快乐",63,"云南","2019,12,19");
            Student student1=new Student("周操作",34,"云南","2019,12,19");
            Student student2=new Student("周离开",98,"云南","2019,12,19");
            List list1=new ArrayList();
            list1.add(student);
            list1.add(student1);
            list1.add(student2);
            List list2=new ArrayList();
            list2.add("周%");
            list2.add("张%");
            for (Object o :
                    list2) {
//                Student stu=(Student)o;
//                sta.setString(1,stu.getName());
//                sta.setInt(2,stu.getScore());
//                sta.setString(3,stu.getAddress());
//                sta.setString(4,stu.getDate());
//                sta.addBatch();
               String sss=(String)o;
               sta.setString(1,sss);
               sta.addBatch();
//                sta.executeUpdate();
            }

            int []result=sta.executeBatch();
            if (result.length>0){
                System.out.println("成功"+result.length);
            }



        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
