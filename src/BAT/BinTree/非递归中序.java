package BAT.BinTree;

import BAT.BinTree.basic.TreeNode;

import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/27.
 *  * 0
 *  1   2
      3   4
 */
public class 非递归中序 {
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
        inOrder(root);
    }
    public static void inOrder(TreeNode t) {
        if (t == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = t;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode node = stack.pop();
            System.out.println(node.val);
            if (node.right != null) {
                cur = node.right;
            }
        }
    }

}
