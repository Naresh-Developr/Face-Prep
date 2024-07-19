package seive;
import java.util.*;
class segSeive
{
  static List<Integer> segmentedSeive(int n){
      int limit =(int) Math.sqrt(n) + 1;
      List<Integer> basePrime = seive(limit);
      int low = limit; 
      int high = (int)Math.sqrt(n) * 2;
      while(low <=n){
          boolean[] isPrime = new boolean[(int)Math.sqrt(n) ];
          Arrays.fill(isPrime,true);
      	  for(int bp : basePrime){
            int firstMultiple = (low/bp)*bp;
            if(firstMultiple<low){
            	firstMultiple += bp;
            }
            for(int i=firstMultiple;i<=high;i+=bp){
            	isPrime[i-low] = false;
            }
          }
        for(int i=low;i<=high;i++){
        	if(isPrime[i-low]){
            	basePrime.add(i);
            }
        }
        low += (int)Math.sqrt(n);
        high +=(int)Math.sqrt(n);
        if(high>n){
        	high = n;
        	}
      }
    return basePrime;
  	
  }
  static List<Integer> seive(int n){
  	boolean[] arr = new boolean[n+1];
    List<Integer> basePrime = new ArrayList<>();
    Arrays.fill(arr,true);
    
    for(int i=2;i*i<=n;i++){
    	if(arr[i]){
        	for(int j = i*i;j<=n;j+=i){
            	arr[j]= false;
            }
        }
    }
    for(int i=2;i<=n;i++){
    	if(arr[i]){
        	basePrime.add(i);
        }
    }
    return basePrime;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> arr = segmentedSeive(n);
    //stem.out.println(arr.toString());
    for(int prime : arr){
    	System.out.print(prime+" ");
    }
    sc.close();
  }
}
