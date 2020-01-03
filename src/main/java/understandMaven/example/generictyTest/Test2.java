package understandMaven.example.generictyTest;

public class Test2 {
    public static void main(String[] args) {
        Integer [] i=new Integer[]{12,354,653,321,654,324,};
        Genericty1 g=new Genericty1(i);
        g.min();
        g.max();
        g.avg();


        Double [] d=new Double[]{12.23,43.45,23.54,76.54,13.45};
        Genericty1 g1=new Genericty1(d);
        g1.min();
        g1.max();
        g1.avg();

    }
}
