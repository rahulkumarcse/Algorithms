package Sorting_Algorithm;

public class _3InsertionSort {
    static void insertionSort(int arr[]){
        int len = arr.length;
        for(int i=1;i<len;i++){
            int j =i;
            int key = arr[i];
            while(j>0 && arr[j-1] > key){
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j] = key;
            System.out.println("Iteration :"+(i));
            for(int k=0;k< arr.length;k++){
                System.out.println(arr[k]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= new int[]{6,3,7,2,8,1,0,-15};
        insertionSort(arr);
        System.out.println("Final");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
