import java.util.*;
class Main
{
  static int gcd(int a,int b){
  	int x = Math.min(a,b);
    while(x!=0){
    	if(a%x ==0 && b%x ==0){
        	break;
        }
      x--;
    }
    
    return x;
    
  }
  static int lcm(int a,int b ,int g){
  		
      return (a/g)*b;
  
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int gcdvalue = gcd(a,b);
    int lcmValue = lcm(a,b,gcdvalue);
    System.out.println(gcdvalue);
    System.out.println(lcmValue);
  }
}
