package Dsa_VN.Day_2_problems;
import java.util.*;
public class binArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            int k = b;
            for(int j=i;j<n;j++){
                if(arr[j] == 1){
                    count++;
                    ans = Math.max(ans, count);
                }else if(arr[j] == 0  && k>0){
                    count++;
                    k--;
                }else{
                    ans = Math.max(ans, count);
                    break;

                }
            }

        }
        System.out.println(ans);
        sc.close();
    }
    
}
