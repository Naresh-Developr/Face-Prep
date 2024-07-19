package Dsa_VN.Day_2_problems;
import java.util.*; 
public class binArray2 {

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N"); 

        int n = sc.nextInt();
        int[] arr = new int[n];
    
        System.out.println("Enter the Array Elements");
          
        for(int i=0;i<n;i++) {

            arr[i]=sc.nextInt();
    
        }
              
        System.out.println("Enter K");
             
        int k=sc.nextInt();
       
        int r=0,l=0,zc=0,max =0;
       
        while(r<n) {
       
            if(arr[r]==0)
            zc++;       
            
            while(zc>k) {
                if(arr[l]==0)
                zc--;
                l++;
            }
    
            max = Math.max(max, r-l+1);
            r++;   
        }
        System.out.println(max);
       
        sc.close();
        }
       
       
       
    
}
