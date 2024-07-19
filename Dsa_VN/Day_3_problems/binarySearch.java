package Dsa_VN.Day_3_problems;
import java.util.*;
public class binarySearch {
    public static void main(String args[])
  {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++){
    	arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    
    int start = 0;
    int end = n-1;
    while(start<=end){
    	int mid = (start+end)/2;
      	if(arr[mid] == target){
        	System.out.println(target + " is present at location "+ (mid+1));
          	return;
        }else if(target>arr[mid]){
        	start = mid+1;
        }else{
        	end = mid-1;
        }
    }
    
    System.out.println("Not found");
    
  }
    
}





