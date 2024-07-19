package Dsa_VN.Day_1_problems;

public class rotateKtimes {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,4,5};
        int k = 2;

        rotateByK(arr, n, k);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] rotateByK(int[] arr, int n, int k){
        while(k>0){
            int last = arr[n-1];

            for(int i =n-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
            k--;
        }

        return arr;
    }
    
}
