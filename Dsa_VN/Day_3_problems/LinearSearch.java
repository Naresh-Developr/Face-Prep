package Dsa_VN.Day_3_problems;

public class LinearSearch {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {6,5,4,3,2,9,1,0,8,9,99
        };
        int target = 0;

        for(int i=0;i<n;i++){
            if(arr[i] == target){
                System.out.println("Found at index of:"+ i);
                return;
            }
        }
        System.out.println("-1");
    
    }
    
}
