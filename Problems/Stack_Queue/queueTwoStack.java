package Problems.Stack_Queue;
import java.util.*;

class twoStack{
    
     Stack<Integer> s1 = new Stack<>();
     Stack<Integer> s2 = new Stack<>();
    

    void enqueue(int n){
        s1.add(n);
        
    }

    void peek(){
        System.out.println(s1.peek());
    }

    void dequeue(){
        if(s2.isEmpty()){
            while(!(s1.isEmpty())){
                s2.add(s1.pop());
            }
        }
        s2.pop();
    }
      void peekQueue(){
        if(s2.isEmpty()){
            while(!(s1.isEmpty())){
                s2.add(s1.pop());
            }
        }
        s2.peek();
    }
}
public class queueTwoStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        twoStack ts = new twoStack();

        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int op = sc.nextInt();
            switch(op){
                case 1:
                    ts.enqueue(sc.nextInt());
                    break;
                case 2:
                    ts.dequeue();
                    break;
                case 3:
                    ts.peekQueue();
            }
        }
        sc.close();
    }
}