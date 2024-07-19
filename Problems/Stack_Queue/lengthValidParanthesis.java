package Problems.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;
public class lengthValidParanthesis
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Balanced(str) ? "Balanced" : "Not Balanced");
        sc.close();
    }
    public static int isBalanced(String s){
        int max=0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int i=0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty())
                {
                    st.push(i);
                }
                else
                {
                    int cl = i-st.peek();
                    max = Math.max(max, cl);
                }
            }
            i++;
        }
        return max;
    }
    public static boolean Balanced(String str){
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='{'){
                st.push(ch);
            }
            else if(st.isEmpty()){
                return false;
            }
            else if(ch==')'){
                if(st.peek()=='[' || st.peek()=='{'){
                    return false;
                }
                else{
                    st.pop();
                }
            }
            else if(ch==']'){
                if(st.peek()=='(' || st.peek()=='{'){
                    return false;
                }
                else{
                    st.pop();
                }
            }
            else if(ch=='}'){
                if(st.peek()=='[' || st.peek()=='('){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
