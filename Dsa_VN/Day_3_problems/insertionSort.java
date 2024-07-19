package Dsa_VN.Day_3_problems;
import java.util.*;
public class insertionSort {

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,2,5,6,7,4,3,65,3,23,6,7,0};
        
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }

            }
        }
    }

    static void swap(int[] arr,int first,int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
