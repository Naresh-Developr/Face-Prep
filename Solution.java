// import java.util.*;

// public class Solution {
//     static int prec(char ch){
//         if(ch == '+' || ch=='-'){

//             return 1;
//         }else if(ch=='*'|| ch=='/'){
//             return 2;
//         }
//         else{
//             return 3;
//         }
//     }
    
//     static String evaluate(String str){
//         Stack<Character> st = new Stack<>();
//         String res = "";
//         for(char ch : str.toCharArray()){
//             if(Character.isLetterOrDigit(ch)){
//                 res+=ch;
//             }
//             else if(ch=='('){
//                 st.push(ch);
//             }
//             else if(ch=='+'|| ch=='-'|| ch=='*' || ch=='/'){
//                 if(st.isEmpty()){
//                     st.push(ch);
//                 }
//                 else{
//                     //System.out.println(st.peek());
//                     while(!st.isEmpty() && (prec(st.peek())>=prec(ch))){
//                         //System.out.println("enter");
//                         res += st.pop();
//                     }
//                     st.push(ch);
//                 }
//             }
//             else{
//                 while(st.peek()!='('){
//                 res += st.pop();
//             }
//             }
            
//         }
            
            
//             while(!st.isEmpty()){
//                 res+=st.pop();
//             }
//             return res;
// }
        
        
    

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String s = evaluate(str);
//         System.out.println(s);
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }


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
      int peekQueue(){
        if(s2.isEmpty()){
            while(!(s1.isEmpty())){
                s2.add(s1.pop());
            }
        }
        return s2.peek();
    }
}
public class Solution {

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
                    System.out.println(ts.peekQueue());
                    break;
            }
        }
        sc.close();
    }
}