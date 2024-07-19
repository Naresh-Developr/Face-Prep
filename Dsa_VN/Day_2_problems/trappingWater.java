package Dsa_VN.Day_2_problems;
import java.util.*;
public class trappingWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        int[] min = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];   
            }
            left[i] = max;
            
        }
        max = 0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                
            }
            right[i] = max;
            
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            min[i] = Math.min(left[i], right[i]); 
        }

        for(int i=0;i<n;i++){
            //System.out.println(min[i]);
            ans+= min[i]-arr[i];
        }
        
        System.out.println(ans);
        sc.close();
    }
    
}
