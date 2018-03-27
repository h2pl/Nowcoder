package BAT.BinTree.basic;

import java.util.LinkedList;
import java.util.Queue;

public class levelprint {
    public static void initTree(TreeNode root){
        root.val=0;
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(3);
        TreeNode treeNode3=new TreeNode(2);
        TreeNode treeNode4=new TreeNode(4);
        root.left=treeNode1;
        treeNode2.left=treeNode3;
        treeNode2.right=treeNode4;
        root.right=treeNode2;

    }
    public static void levelvisit(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root!=null){
            queue.offer(root);

        }
        while(!queue.isEmpty()){
            TreeNode p=queue.poll();
            System.out.println(p.val);
            if(p.left!=null){
                queue.offer(p.left);
            }
            if(p.right!=null){
                queue.offer(p.right);
            }

        }
    }
    public static void main(String args[]){
         TreeNode T=new TreeNode();
         initTree(T);
        levelvisit(T);
    }

}
