package understandMaven.example.generictyTest;

public class Test2 {
    public static void main(String[] args) {
        Integer [] i=new Integer[]{12,354,653,321,654,324,};
        GenerictyInterface g=new GenerictyInterface(i);
        g.min();
        g.max();
        g.avg();


        Double [] d=new Double[]{12.23,43.45,23.54,76.54,13.45};
        GenerictyInterface g1=new GenerictyInterface(d);
        g1.min();
        g1.max();
        g1.avg();

    }
}
