package understandMaven.example.generictyTest;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        User user=new User(1,"张三");
         user.save(user.getName(),user.getId());
         Map map= user.getMap();
        System.out.println(map.entrySet());
        user.get("张三");
        user.update("张三",2);
        user.save(user.getName(),user.getId());
        List list=user.list();
        for (Object o :
                list) {
            System.out.println((int)o);
        }
        user.delete("张三");
        System.out.println(user.getMap().containsKey("张三"));

    }
}
