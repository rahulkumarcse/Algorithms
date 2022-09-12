package Sorting_Algorithm;

public class BubbleSort_2 {
    static void bubbleSort(int[] arr){
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
            System.out.println("Iteration :"+(i+1));
            for(int k=0;k< arr.length;k++){
                System.out.println(arr[k]);
            }
        }

    }
    public static void main(String[] args) {
        int[] arr= new int[]{6,3,7,2,8,1,-15};
        bubbleSort(arr);
        System.out.println("Final");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
