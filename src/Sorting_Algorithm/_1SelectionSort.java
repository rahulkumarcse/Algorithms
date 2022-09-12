package Sorting_Algorithm;

public class _1SelectionSort {
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            System.out.println("Iteration :"+(i+1));
             for(int k=0;k< arr.length;k++){
                System.out.println(arr[k]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= new int[]{6,3,7,2,8,1};
        selectionSort(arr);
        System.out.println("Final");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
