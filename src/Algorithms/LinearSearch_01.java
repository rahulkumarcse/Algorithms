package Algorithms;

public class LinearSearch_01 {
    static int linearSearch(int[] arr,int n){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,6,8,5,7};
        int search=linearSearch(arr,5);
        System.out.println(search);
    }
}
