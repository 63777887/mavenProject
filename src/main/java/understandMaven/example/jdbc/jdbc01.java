package understandMaven.example.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class jdbc01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        Connection con=null;
        try {
            //1。加载驱动 mysql(首先加入jar包)
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.使用驱动管理工具    获取链接    url 数据库的地址+数据库名 user  数据库名    password
            String url="jdbc:mysql://localhost:3306/Crush_course";
            con= DriverManager.getConnection(url,"root","Awert159");


            Statement statement=con.createStatement();  //专门对sql语句进行处理的
            String sql="select * from orderitems";
            String s2="delete from orderitems where item_price=2.3";
            String sql1="insert into orderitems (order_num,order_item,prod_id,quantity,item_price) values (20009,6,'SLING',8,2.3);";
            String sql2="update orderitems set item_price=5.5 where order_num=20007";
            System.out.println(sql1);
            statement.executeUpdate(sql2);
            ResultSet resultSet=statement.executeQuery(sql);    //获取处理之后的处理集
            while (resultSet.next()){
                Orderitems s1=new Orderitems();
                s1.setNum(resultSet.getInt(1));
                s1.setId(resultSet.getNString(3));
                s1.setItem(resultSet.getInt(2));
                s1.setQuantity(resultSet.getInt(4));
                s1.setPrice(resultSet.getDouble(5));
                list.add(s1);
            }
            for (Object o :
                    list) {
                Orderitems s = (Orderitems) o;
                System.out.println(s.toString());
            }



        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}