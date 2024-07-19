package Project;
class ArrayList<T>{

    private int  Actual_Size = 10;
    private int size = 0;
    @SuppressWarnings("unchecked")
    T[] arr = (T[])new Object[Actual_Size];

    @SuppressWarnings("unchecked")
    void add(T i){
        if(size == Actual_Size){
            Actual_Size *= 2;
            T[] temp = (T[])new Object[Actual_Size];
            System.arraycopy(arr,0,temp,0,size);
            arr = temp;
            //size++;
        }
        arr[size] = i;
        size++;
    }

    boolean isEmpty(){
        return  size==0;
    }
    
    void set(int index,T element){
        arr[index] = element;
    }

    T get(int index){
       return arr[index]; 
    }

    int size(){
        return size;
    }

    @Override
    public String toString(){
        String temp = "[";
        for(int i=0;i<size;i++){
            temp += arr[i];
            if(i!=size-1){
                temp += ",";
            }
        }
        return temp+"]";
    }



}


public class Main {
       public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(0);
        // arr.add(0);
        // arr.add(0);
        // arr.add(0);
        // arr.add(0);
        // arr.set(1, 1);
        // arr.set(2, 2);
        // arr.set(3, 3);
        for(int i=0;i<12;i++){
            arr.add(i);
        }
        System.out.println(arr.isEmpty());
        arr.get(2);
        System.out.println(arr.toString());
        
    }

    
}
