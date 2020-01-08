1.输出结果
public static void main(String[] args) {
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
}

Integer范围是-128-127,超出范围会重新增加一段，地址就改变了


2.为什么不能根据返回类型来区分重载
因为你调用时，编译器无法根据返回类型判断你想调用哪个函数

3.写出数据库脏读，幻读，重复读的sql语句,并用自己的话总结这三个，mysql数据库的默认事务的隔离级别是什么
(https://blog.csdn.net/qq_41776884/article/details/81608777)
(https://www.cnblogs.com/Vieat/p/11172784.html)
Url:understandMaven/example/i.png
                                                            脏读      不可重复读       幻读
读未提交(Read uncommitted)                        -->          Y            Y          Y
读已提交(Read committed) --- 大多数数据库默认       -->          N            Y          Y
可重复读(Repeatable read) --- mysql默认           -->          N            N          Y
串行(Serializable)                               -->          N            N          N


脏读就是指当一个事务正在访问数据，并且对数据进行了修改，而这种修改还没有提交到数据库中，
这时，另外一个事务也访问这个数据，然后使用了这个数据。


不可重复读：是指在一个事务内，多次读同一数据。在这个事务还没有结束时，
另外一个事务也访问该同一数据。那么，在第一个事务中的两次读数据之间，
由于第二个事务的修改，那么第一个事务两次读到的的数据可能是不一样的。
这样就发生了在一个事务内两次读到的数据是不一样的，因此称为是不可重复读。

幻读：是指当事务不是独立执行时发生的一种现象，例如第一个事务对一个表中的数据进行了修改，
这种修改涉及到表中的全部数据行。同时，第二个事务也修改这个表中的数据，
这种修改是向表中插入一行新数据。那么，以后就会发生操作第一个事务的用户发现表中还有没有修改的数据行，
就好象发生了幻觉一样。

4.jdbc对事物的处理步骤
在JDBC中，事务操作默认是自动提交。也就是说，一条对数据库的更新表达式代表一项事务操作。操作成功后，系统将自动调用commit()来提交，否则将调用rollback()来回退。

5.如何通过反射获取和设置对象私有字段的值？
        获取一个字段的值
      ``` try {
            Field f=Object.class.getDeclaredField("String");
            f.setAccessible(true);
            System.out.println(f.get(new Object()));
            } catch (IllegalAccessException | NoSuchFieldException e) {
                e.printStackTrace();
            }
            获取所有字段的值
            try {
                        Field f[]=Person.class.getDeclaredFields();
                        for (Field p :
                                f) {
                            p.setAccessible(true);
                            System.out.println(p.get(new Person()));
                        }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        获取私有方法
        Method m=Person.class.getDeclaredMethod("getAge",null);
                                            m.setAccessible(true);
                                            System.out.println(m.invoke(new Person(),null));```
        
        