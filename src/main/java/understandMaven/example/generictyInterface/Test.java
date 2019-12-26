package understandMaven.example.generictyInterface;


import java.util.ArrayList;
import java.util.List;

public class Test implements Point<Integer> {


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        list.add(123);
        list.add(54);
        list.add(13);
        Test test=new Test();
        System.out.println(test.select(23,list));

    }
    @Override
    public  Integer select(Integer param,ArrayList list) {
        if (list.contains(param)){
            return param;
        }

        return null;
    }
}
