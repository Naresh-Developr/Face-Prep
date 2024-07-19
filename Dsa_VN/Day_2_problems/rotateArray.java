package Dsa_VN.Day_2_problems;
import java.util.*;
public class rotateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        r = r%n;
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, r-1);
        reverseArray(arr, r, n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        sc.close();

    }
    
    static void reverseArray(int[] arr,int start,int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    
}
