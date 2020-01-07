package understandMaven.example.testThree;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int arr[],int left,int right){
//        int key=arr[left];
//        while (left<right){
//            while (left<right&&arr[right]>=key){
//                right--;
//            }
//            arr[left]=arr[right];
//            while (left<right&&arr[left]<=key){
//                left++;
//            }
//            arr[right]=arr[left];
//        }
//        arr[left]=key;
//        return left;

        int key=arr[left];
        while (left<right){
            while (left<right&&arr[right]<=key){
                right--;
            }
            arr[left]=arr[right];
            while (left<right&&arr[left]>=key){
                left++;
            }
            arr[right]=arr[left];
        }
        arr[left]=key;
        return left;

    }
    public static void sort(int []arr,int left,int right){
//        int pivot=0;
//        if (left<right){
//            pivot=partition(arr,left,right);
//            sort(arr,left,pivot-1);
//            sort(arr,pivot+1,right);
//        }
        int temp=0;
        if (right>left){
            temp=partition(arr,left,right);
            sort(arr,left,temp-1);
            sort(arr,temp+1,right);
        }
    }

    public static void main(String[] args) {
        int arr[]={12,32,43,98,53,76,1,54,87,56,34,3,64,23,33};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
