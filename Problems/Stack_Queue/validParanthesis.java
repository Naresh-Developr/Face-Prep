package Problems.Stack_Queue;

import java.util.*;
class validParanthesis
{
    static boolean isBalance(char[] ch){
        Stack<Character> st = new Stack<>();
        for(char c : ch){
            if(c != '}' && c != ')' && c != ']'){
                st.push(c);
                continue;
            }
            else if(c == ')'){
                if(st.peek() == '[' || st.peek() == '{'){
                    return false;
                }
            }
            else if(c == ']'){
                if(st.peek() == '(' || st.peek() == '{'){
                    return false;
                }
            }
            else if(c == '}'){
                if(st.peek() == '(' || st.peek() == '['){
                    return false;
                }
            }
            st.pop();
        }
        return true;  


    }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char[] ch = str.toCharArray();
    boolean x = isBalance(ch);
    if(x){
        System.out.println("Valid");
    }else{
        System.out.println("Not valid");
    }
    sc.close();
    }
  }
