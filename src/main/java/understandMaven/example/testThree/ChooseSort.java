package understandMaven.example.testThree;

import java.util.Arrays;

public class ChooseSort {

    public static void sort(int arr[]){
//        for (int i=0;i<arr.length-1;i++){
//            int min=i;
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[j]<arr[min]){
//                    min=j;
//                }
//            }
//            if (i != min) {
//                int tmp = arr[i];
//                arr[i] = arr[min];
//                arr[min] = tmp;
//            }
//
//        }


        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            if (i!=min){
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }


    }
    public static void main(String[] args) {
        int arr[]={3,34,76,9,76,56,94,36,13,45,98};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
