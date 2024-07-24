package Problems.BinaryTree;

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
  void levelOrderInput(String arr[]){
    if(arr[0]=="-1"|| arr.length==0)
      	return;
        Queue<TreeNode> q = new LinkedList<>();
        root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        int i=1;
        while(i<arr.length &&!q.isEmpty()){
            TreeNode cur = q.poll();
            if(!arr[i].equals("-1")){
                cur.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(cur.left);
            }
            i++;
            if(arr.length<=i){
                break;
            }
            if(!arr[i].equals("-1")){
                cur.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(cur.right);
            }
          i++;
        }
    }
    public int findMax(TreeNode node, int[]  maxi){
        if(node==null){
            return 0;
        }
        // int left = Math.max(0,findMax(node.left,maxi));
        // int right = Math.max(0,findMax(node.right,maxi));

        int left = Math.max(0,findMax(node.left,maxi));
        int right = Math.max(0,findMax(node.right,maxi));
        
        maxi[0] = Math.max(maxi[0],left+node.data+right);

        return Math.max(left,right)+node.data;
    }
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        findMax(root,max);
        return max[0];         
    }
}
public class MaximumPathSum {
    
}
