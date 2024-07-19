package Problems.BinaryTree;
import java.util.*;
class Node{
	int data;
  	Node left;
  	Node right;
  	Node(int n){
    	this.data = n;
    }
}
class Tree{
	Node root;
 	void levelOrderInput(String[] s){
  	  	Queue<Node> q = new LinkedList<>();
      	if(s[0]=="-1"||s.length == 0){
        	return;
        }
      	root = new Node(Integer.parseInt(s[0]));
      	q.add(root);
      	int i=1;
      	while(i<s.length && !q.isEmpty()){
        	Node cur = q.poll();
          	if(!s[i].equals("-1")){
            	cur.left = new Node(Integer.parseInt(s[i]));
              	q.add(cur.left);
            }
               i++;
               if(s.length<=i){
               	break;
               }
            if(!s[i].equals("-1")){
            	cur.right = new Node(Integer.parseInt(s[i]));
              	q.add(cur.right);
            }
         i++;
        }
  	}
    Node LCAncestor(Node root,int n1,int n2){
        if(root==null||n1==root.data||n2==root.data){
            return root;
        }

        Node left = LCAncestor(root.left, n1, n2);
        Node right = LCAncestor(root.right, n1, n2);

        if(left!=null && right!=null){
            return root;
        }
        return left!=null ? left:right;

    }
}
public class leastCommonAncestor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        Tree t = new Tree();
        t.levelOrderInput(s);
        Node d = t.LCAncestor(t.root, 2, 3);
        System.out.println(d.data);
        sc.close();
    }
    
}
