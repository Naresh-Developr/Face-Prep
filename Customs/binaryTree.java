package Customs;
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

    void levelOrderInput(String arr[]){
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        int i=1;
        while(i<arr.length &&!q.isEmpty()){
            TreeNode cur = q.poll();
            if(!arr[i].equals("-1")){
                cur.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(cur.left);
            }
            i++;
            if(arr.length<i){
                break;
            }
            if(!arr[i].equals("-1")){
                cur.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(cur.right);
            }

            
        }
    }
}
public class binaryTree {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new TreeNode(1);
        t.root.left = new TreeNode(2);
        t.root.right = new TreeNode(3);
        t.root.left.left = new TreeNode(4);
        t.root.left.right = new TreeNode(5);
        t.root.right.left = new TreeNode(6);
        t.root.right.right = new TreeNode(7);

        System.out.println("PreOrder: ");
        t.preOrder(t.root);
        System.out.println("\nPostOrder: ");
        t.postOrder(t.root);
        System.out.println("\nInOrder: ");
        t.inOrder(t.root);
        System.out.println("\nLevelOrder: ");
        t.levelOrder();
        System.out.println();
    }
}
