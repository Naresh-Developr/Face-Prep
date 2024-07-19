package seive;
import java.util.*;
class Main
{
  static int gcd(int a,int b){
  	  if(a==0){
      	return b;
      }
  	return gcd(b%a,a);
  }
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i=1;i<n;i++){
    	if(gcd(i,n) == 1){
        	sum += i;
        }
    }
    System.out.println(sum);
    sc.close();
  }
}
