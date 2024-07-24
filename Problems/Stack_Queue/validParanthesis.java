package Problems.Stack_Queue;

import java.util.*;
class validParanthesis
{
    static boolean isBalance(String s){
        if (s == null || s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                default:
            }
        }
        return stack.isEmpty();
    }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    boolean x = isBalance(str);
    if(x){
        System.out.println("Valid");
    }else{
        System.out.println("Not valid");
    }
    sc.close();
    }
  }
