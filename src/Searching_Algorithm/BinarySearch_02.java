package Searching_Algorithm;
import java.util.*;
public class BinarySearch_02 {
    static int binarySearch(int[] arr,int n,int start,int end){

        if(start>end){
            return -1;
        }
        else {
            int mid=start+(end-start)/2;
            if(arr[mid] == n)
            {
                return mid;
            }
            if (n>arr[mid]) {
                return binarySearch(arr, n, mid+1,end );
            } else {
                return binarySearch(arr, n, start, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,6,8,7};
        int start=0;
        int end=arr.length-1;
        Arrays.sort(arr);
        int search=binarySearch(arr,7,start,end);
        System.out.println(search);

    }
}
