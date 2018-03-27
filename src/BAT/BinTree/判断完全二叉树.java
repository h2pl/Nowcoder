package BAT.BinTree;

import BAT.BinTree.basic.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by 周杰伦 on 2018/3/27.
 *  * 0
 *  1   2
      3   4
 */
public class 判断完全二叉树 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        TreeNode treeNode4=new TreeNode(4);
        root.left=treeNode1;
        treeNode1.left=treeNode3;
        treeNode1.right=treeNode4;
        root.right=treeNode2;
        System.out.println(isTotally(root));
    }
    static boolean isTotally(TreeNode t) {
        if (t == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(t);
        int flag = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (flag == 1) {
                if (node.left != null || node.right != null) {
                    return false;
                }
            }
            if (node.left == null && node.right != null) {
                return false;
            }
            else if (node.left == null || node.right == null) {
                flag = 1;
            }
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return true;
    }
}
