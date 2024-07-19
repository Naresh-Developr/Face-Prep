package Problems.BinaryTree;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int n){
        this.data = n;
    }
}
class Tree{
    TreeNode root;
  	ArrayList<Integer> arr = new ArrayList<>();
  	
  void levelOrderInput(String arr[]){
    	if(arr[0]=="N"|| arr.length==0)
      		return;
        Queue<TreeNode> q = new LinkedList<>();
        root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        int i=1;
        while(i<arr.length &&!q.isEmpty()){
            TreeNode cur = q.poll();
            if(!arr[i].equals("N")){
                cur.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(cur.left);
            }
            i++;
            if(arr.length<=i){
                break;
            }
            if(!arr[i].equals("N")){
                cur.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(cur.right);
            }
          i++;
        }
    }
  
   	void rightView(TreeNode root,int level){
    
    if(root==null){
    	return;
    }
    if(arr.size()==level){
      	System.out.print(root.data+" ");
    	arr.add(root.data);
    }
    rightView(root.right,level+1);
    rightView(root.left,level+1);
  }
  
  int height(TreeNode cur){
  	if(cur==null){
    	return 0;
    }
    return 1+Math.max(height(cur.left),height(cur.right));
  }
  
  int diameter(TreeNode cur){
  	if(cur == null){
    	return 0;
    }
    int incp = 1+height(cur.left)+height(cur.right);
    int excpl = Math.max(height(cur.left),height(cur.right));
    return Math.max(incp,excpl);
  }
}
class rightView
{
  public static void main(String args[])
  {
   Tree t = new Tree();
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   String[] s = str.split(" ");
   t.levelOrderInput(s);
   t.rightView(t.root,0);
   sc.close();
   
  }
}
