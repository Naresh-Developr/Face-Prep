package Dsa_VN.Day_3_problems;
import java.util.*;
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {2,5,4,7,3,6,3,9};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
        
    }
    
    static void bubbleSort(int[] arr){
        // decesnding order
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]>arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        

        

    }
}
