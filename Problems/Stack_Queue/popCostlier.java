package Problems.Stack_Queue;
import java.util.*;
//leetcode 255..

class popCostlier {

    Queue<Integer> q1;
    Queue<Integer> q2;
    public popCostlier() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        
    }
    
    public void push(int x) {
        q2.add(x);
    }
    
    public int pop() {
        while(q2.size()>1){
            q2.add(q1.poll());
        }
        int temp = q1.poll();
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
        return temp;
    }
    
    public int top() {
        while(q2.size()!=1){
            q2.add(q1.poll());
        }
        int temp = q1.poll();
        q2.add(temp);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
        return temp;
    }
    
    public boolean empty() {
        return q1.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */