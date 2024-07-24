package problem300;
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
}
public class minimumDepthOfTree {
    
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        if(root.left==null){
            return minDepth(root.right)+1;
        }
        if(root.right==null){
            return minDepth(root.left)+1;
        }
        
        return 1 + Math.min(minDepth(root.left) , minDepth(root.right));
    }
}
