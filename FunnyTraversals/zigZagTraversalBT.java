package FunnyTraversals;
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
    void inOrder(TreeNode cur){
        if(cur==null){
            return;
        }
        inOrder(cur.left);
        System.out.print(cur.data+" ");
        inOrder(cur.right);
    }
    void postOrder(TreeNode cur){
        if(cur==null){
            return;
        }
        postOrder(cur.left);
        postOrder(cur.right);
        System.out.print(cur.data+" ");
    }
    void preOrder(TreeNode cur){
        if(cur==null){
            return;
        }
        System.out.print(cur.data+" ");
        preOrder(cur.left);
        preOrder(cur.right);
    }

    void levelOrder(){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            System.out.print(cur.data+" ");

            if(cur.left!=null){
                q.add(cur.left);
            }

            if(cur.right != null){
                q.add(cur.right);
            }
        }
    }
}

public class zigZagTraversalBT {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> subList = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                subList.add(0); 
            }
            for(int i=0;i<size;i++){
                TreeNode tN = q.poll();
                int index = leftToRight ? i : (size - 1 - i);
                subList.set(index,tN.data);

                if(tN.left!=null){
                    q.add(tN.left);
                }
                if(tN.right!=null){
                    q.add(tN.right);
                }
            }
            leftToRight = !leftToRight;
            ans.add(subList);
        }
        return ans;

    }
    public static void main(String[] args) {
        
    }
}
