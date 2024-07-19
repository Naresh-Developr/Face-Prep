package Problems.Stack_Queue;
import java.util.*;
public class postFixExp {
    static int prec(char ch){
        if(ch == '+' || ch=='-'){

            return 1;
        }else if(ch=='*'|| ch=='/'){
            return 2;
        }
        else{
            return 3;
        }
    }
    
    static String evaluate(String str){
        Stack<Character> st = new Stack<>();
        String res = "";
        for(char ch : str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                res+=ch;
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch=='+'|| ch=='-'|| ch=='*' || ch=='/'){
                if(st.isEmpty()){
                    st.push(ch);
                }
                else{
                    //System.out.println(st.peek());
                    while(!st.isEmpty() && (prec(st.peek())>=prec(ch))){
                        //System.out.println("enter");
                        res += st.pop();
                    }
                    st.push(ch);
                }
            }
            else{
                while(st.peek()!='('){
                res += st.pop();
            }
            }
            
        }
            
            
            while(!st.isEmpty()){
                res+=st.pop();
            }
            return res;
}
        
        
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = evaluate(str);
        System.out.println(s);
        sc.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    
}
