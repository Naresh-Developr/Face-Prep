package problem300;

//leet 2073
public class timeToBuyTickets {
    
    public int timeRequiredToBuy(int[] arr, int k) {
        int sum=0;
        while(arr[k]!=0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    arr[i] = arr[i]-1;
                    sum+=1;

                    if(arr[k]==0){
                        return sum;
                    }
                }
            
            }
        }
        return sum;
    }
}
