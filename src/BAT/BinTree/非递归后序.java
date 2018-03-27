package BAT.BinTree;

import BAT.BinTree.basic.TreeNode;

import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/27.
 *    0
 *  1   2
      3   4
 */
public class 非递归后序 {
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
        postOrder(root);
        postOrder2(root);
    }
    public static void postOrder(TreeNode t) {
        if (t == null) return;
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> res = new Stack<>();
        stack.push(t);
        while (!stack.isEmpty()) {
            TreeNode n = stack.pop();
            res.push(n);
            if (n.left != null) {
                stack.push(n.left);
            }
            if (n.right != null) {
                stack.push(n.right);
            }
        }
        while (!res.isEmpty()) {
            System.out.println(res.pop().val);
        }
    }
    public static void postOrder2(TreeNode t) {
        if (t == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode h = t;
        TreeNode c = null;
        stack.push(t);
        while (!stack.isEmpty()) {
            c = stack.peek();
            if (c.left != null && c.left != h && c.right != h) {
                stack.push(c.left);
            }
            else if (c.right != null && c.right != h) {
                stack.push(c.right);
            }
            else {
                h = stack.pop();
                System.out.println(h.val);
            }
        }
    }
}
