package Problems.Stack_Queue;
import java.util.*;
class infixToPostfix{
    static int prec(char ch){
        if(ch == '+' || ch=='-'){

            return 1;
        }else if(ch=='*'|| ch=='/'){
            return 2;
        }
        else if(ch=='^'){
            return 3;
        }
        return -1;
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
            st.pop();
            }
            
        }
            
            
            while(!st.isEmpty()){
                res+=st.pop();
            }
            return res;
}

    static String InfixToPostFix(String str){
        StringBuilder strB = new StringBuilder(str).reverse();

        for(int i=0;i<strB.length();i++){
            if(strB.charAt(i)=='('){
                strB.setCharAt(i, ')');
            }
            else if(strB.charAt(i)==')'){
                strB.setCharAt(i, '(');
            }
        }
        str = evaluate(strB.toString());
        return new StringBuilder(str).reverse().toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = InfixToPostFix(str);
        System.out.println(s);
        sc.close();
    }
}