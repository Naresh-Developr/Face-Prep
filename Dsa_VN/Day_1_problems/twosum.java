package Dsa_VN.Day_1_problems;
import java.util.*;
public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        int n = 4;
        int[] arr = {2,7,11,15};
        int target = 26;
        int count = 0;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(arr[i]+arr[j] == target){
                    System.out.print(i);
                    System.out.println(j);
                    count = 1;
                }
            }
            if(count==1){
                break;       
            }

        }
        sc.close();
    }
}
