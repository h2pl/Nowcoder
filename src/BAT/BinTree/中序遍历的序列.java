package BAT.BinTree;
import BAT.BinTree.basic.TreeNode;

import java.util.ArrayList;

/**
 * Created by 周杰伦 on 2018/3/27.
 *  * 0
 *  1   2
      3   4
 */
public class 中序遍历的序列 {
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

        ArrayList<TreeNode> list = inOrderSeq(root);
        for (TreeNode p : list) {
            System.out.println(p.val);
        }
    }
    static ArrayList<TreeNode> list = new ArrayList<>();
    public static ArrayList<TreeNode> inOrderSeq(TreeNode TreeNode) {
        if (TreeNode == null) return null;
        inOrderSeq(TreeNode.left);
        list.add(TreeNode);
        inOrderSeq(TreeNode.right);
        return list;
    }
}
