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
  	static int maxSum;
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
  
  int maxSumNode(Node cur){
  	if(cur==null){
    	return 0;
    }
    int left =  maxSumNode(cur.left);
    int right = maxSumNode(cur.right);
    int curSum = cur.data + left + right ;
    maxSum = Math.max(curSum,maxSum);
    return cur.data + Math.max(left,right);
  }
  
  
}
class maximumPathNodes
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] s = str.split(" ");
    Tree t = new Tree();
    t.levelOrderInput(s);
    //int path = t.maxSumNode(t.root);
    System.out.println(Tree.maxSum);
    sc.close();
    
  }
}
