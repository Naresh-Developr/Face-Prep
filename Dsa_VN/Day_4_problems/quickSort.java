package Dsa_VN.Day_4_problems;

public class quickSort {
    static void QuickSort(int[] arr,int start,int end){
        if(start<end){
            int pivot = findPivot(arr,start,end);
            QuickSort(arr, start, pivot-1);
            QuickSort(arr, pivot+1,end);
        }
    }
    static int findPivot(int[] arr,int start,int end){
        int pivotEle = arr[end];
        int pI = start;

        for(int i= start;i<end;i++){
            if(arr[i]<pivotEle){
                swap(arr,i,pI);
                pI++;
            }
        }

        swap(arr, end,pI);
        return pI;

    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {9,8,5,3,7};
        int n = arr.length;

        QuickSort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //System.out.println(arr.toString());

        
    }
    
}
