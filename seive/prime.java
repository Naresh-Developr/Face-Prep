package seive;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        for(int i=1;i*i<=Math.sqrt(n);i++){
            if(n%i == 0){
                count++;
            }
            if(n%i != i){
                count++;
            }
        }

        if(count==2){
            System.out.println("Prime");
        }
        else{

            System.out.println("Not a prime");
        }
    }
    
}
