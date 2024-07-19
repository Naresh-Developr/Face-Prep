package Problems.Stack_Queue;

import java.util.*;

class myStack{
	static int size = 1000;
  	int top1 = -1;
  	int top2 = size;
  	int[] arr = new int[size];
  
  void push1(int n){
    if(top1==top2){
    	System.out.println("");
      	return;
    }
    top1++;
    arr[top1] = n;
  }
  void push2(int n){
    if(top1==top2){
    	System.out.println("");
      	return;
    }
    top2--;
    arr[top2] = n;
  }
  
  int pop1(){
  	if(top1 == -1){
    	System.out.println("Stack underflow. pop from stack 1 failed");
      	return Integer.MIN_VALUE;
    }
    int temp = arr[top1];
    arr[top1] = 0;
    top1--;
    return temp;
  }
  
  int pop2(){
  	if(top2 == size){
    	System.out.println("Stack underflow. pop from stack 2 failed");
      	return Integer.MIN_VALUE;
    }
    int temp = arr[top2];
    arr[top2] = 0;
    top2++;
    return temp;
  }

  boolean isEmpty1(){
    return top1==-1;
  }
  boolean isEmpty2(){
    return top2==size;
  }
  
  void display(){
  	System.out.println("Stack 1 Elements:");
    for(int i=top1;i>=0;i--){
    	System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("Stack 2 Elements:");
    for(int j=top2;j<size;j++){
    	System.out.print(arr[j]+" ");
    }
    System.out.println();
  }
  
}

class stackUsingTwoArray
{
  public static void main(String args[])
  {
    myStack st = new myStack();
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    for(int i=0;i<n1;i++){
        int x = sc.nextInt();
    	st.push1(x);
    }
    int n2 = sc.nextInt();
    for(int j=0;j<n2;j++){
        int x = sc.nextInt();
    	st.push2(x);
    }
    st.display();
    int d1 = sc.nextInt();   //number of elements to be deleted from stack1
    int d2 = sc.nextInt();   //number of elements to be deleted from stack2
    
    
    for(int c=0;c<d1;c++){
    	st.pop1();
    }
    for(int k=0;k<d2;k++){
    	st.pop2();
    }
    
    st.display();

    sc.close();
    
  }
}
