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
  	static int maxSum = 0;
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
  	void preOrder(Node cur){
        if(cur.left!=null && cur.right!=null){
          preOrder(cur.left);
          preOrder(cur.right);
        }
      	else if(cur.left!=null){
        	System.out.print(cur.left.data+" ");
           	preOrder(cur.left);
        }
      else if(cur.right!=null){
        	System.out.print(cur.right.data+" ");
           	preOrder(cur.right);
        }
      	
    }
}
class nodeWithoutSibling
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] s = str.split(" ");
    Tree t = new Tree();
    t.levelOrderInput(s);
    t.preOrder(t.root);
    sc.close();
    
  }
}
