package understandMaven.example.generictyTest;

public class Genericty1<T extends Number> {
    private T []arr;

    public Genericty1(T[] arr) {
        this.arr = arr;
    }

    public void min(){
        T temp=arr[0];
        for (int i=0;i<arr.length;i++){
            temp=Double.parseDouble(temp.toString())>=Double.parseDouble(arr[i].toString())?arr[i]:temp;
        }
        T a=(T)temp;
        System.out.println(a);
    }

    public void max(){
        T temp=arr[0];
        for (int i=0;i<arr.length;i++){
            temp=Double.parseDouble(temp.toString())<=Double.parseDouble(arr[i].toString())?arr[i]:temp;
        }
        T a=(T)temp;
        System.out.println(a);
    }

    public void avg(){
        Double temp=0.0;
        for (int i=0;i<arr.length;i++){
            temp = Double.parseDouble(temp.toString()) + Double.parseDouble(arr[i].toString());
        }
        Double avg=(temp/arr.length);
        T a=(T)avg;
        System.out.println(a);
    }
}
