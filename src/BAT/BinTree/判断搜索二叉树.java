package BAT.BinTree;

import BAT.BinTree.basic.TreeNode;

import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/27.
 *根据中序遍历的非递归来写，前一个节点要比后一个节点小
 * 或者直接中序遍历，序列有序即可
 *  * 1
 *  0   3
      2  4
 */
public class 判断搜索二叉树 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1=new TreeNode(0);
        TreeNode treeNode2=new TreeNode(3);
        TreeNode treeNode3=new TreeNode(2);
        TreeNode treeNode4=new TreeNode(4);
        root.left=treeNode1;
        treeNode2.left=treeNode3;
        treeNode2.right=treeNode4;
        root.right=treeNode2;
        System.out.println(isSearch(root));
    }

    public static boolean isSearch(TreeNode t) {
        if (t == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = t;
        TreeNode pre = null;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode node = stack.pop();
            if (pre != null && pre.val >= node.val) return false;
            pre = node;

            if (node.right != null) {
                cur = node.right;
            }
        }
        return true;
    }


}
