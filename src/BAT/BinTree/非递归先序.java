package BAT.BinTree;

import BAT.BinTree.basic.TreeNode;

import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/27.
 *    0
 *  1   2
      3   4
 */
public class 非递归先序 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        TreeNode treeNode4=new TreeNode(4);
        root.left=treeNode1;
        treeNode2.left=treeNode3;
        treeNode2.right=treeNode4;
        root.right=treeNode2;
        preOrder(root);

    }
    static Stack<TreeNode> stack = new Stack<>();
    public static void preOrder(TreeNode t) {
        if (t == null) {
            return;
        }
        stack.push(t);
        while (!stack.isEmpty()) {
            TreeNode next = stack.pop();
            System.out.println(next.val);
            if (next.right != null) {
                stack.push(next.right);
            }
            if (next.left != null) {
                stack.push(next.left);
            }
        }

    }
}
