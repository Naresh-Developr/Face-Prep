package Problems.Stack_Queue;

import java.util.*;
class evaluateInfixToPostfix
{
  static int operate(int e1,int e2,char ch){
    int res=0;
  	switch(ch){
      case '+':
        res = e1+e2;
        break;
      case '-':
        res =  e1-e2;
        break;
      case '*':
        res =  e1*e2;
        break; 
      case '/':
        res = e1/e2;
        break;
    }
    return res;
  }
  static void evalvate(){
    Scanner sc = new Scanner(System.in);
    Stack<Integer> st = new Stack<>();
  	String str = sc.nextLine();
      	for(int i=0;i<str.length();i++){
        	char x = str.charAt(i);
          	if(Character.isDigit(x)){ 
            	st.push(x-'0');
            }
          	else{
            	int ele2 = st.pop();
              	int ele1 = st.pop();
              	st.push(operate(ele1,ele2,x));
            }
          	
        }
        System.out.println(st.peek());
        sc.close();
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=0;i<t;i++){
    	evalvate();
    }
    sc.close();
    
    
  }
}