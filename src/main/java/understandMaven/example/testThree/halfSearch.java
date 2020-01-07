package understandMaven.example.testThree;

public class halfSearch {

    public static int halfSearch(int [] arr,int num){
        int min=0;
        int max=arr.length-1;
        int mid;
        while(min<max){
            mid=(min+max)/2;
            if (arr[mid]>num){
                max=mid-1;
            }else if (arr[mid]<num){
                min=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,6,7,8};
        System.out.println(halfSearch(a,3));
    }
}
