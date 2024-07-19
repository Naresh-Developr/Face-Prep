package seive;
import java.util.*;


public class rangeSegSeive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        segmentedSeive(low,high);
        sc.close();
    }

    private static void segmentedSeive(int low, int high) {
        boolean[] isPrime = new boolean[high-low+1];
        Arrays.fill(isPrime,true);
        List<Integer> basePrime = seive((int)Math.sqrt(high));
        
        for(int prime: basePrime){
            int firstMul = (low/prime)*prime;
            if(firstMul < low){
                firstMul+=prime;
            }
            for(int i=firstMul;i<=high;i+=prime){
                isPrime[i-low] = false;
            }
        }
        for(int i=low;i<=high;i++){
            if(isPrime[i-low]){
                System.out.println(i+" ");
            }

        }
    }

    private static List<Integer> seive(int n) {
        boolean[] arr = new boolean[n+1];
        //@SuppressWarnings("rawtypes")
        List<Integer> basePrime =  new ArrayList<Integer>();
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
    
}
