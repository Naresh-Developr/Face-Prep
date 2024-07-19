package Dsa_VN.Day_1_problems;
import java.util.*;
public class stockProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 6;
        int[] arr = {6,5,1,4,5,7};
        int profit = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                int max = arr[j]-arr[i];
                if(profit < max){
                    profit = max;
                }
            }
        }

        System.out.println("Profit: "+ profit);
        sc.close();
    }
    
}
