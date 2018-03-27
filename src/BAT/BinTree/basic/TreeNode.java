package BAT.BinTree.basic;

/**
 * Created by 周杰伦 on 2018/3/14.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }
    public TreeNode(){

    }

    public static TreeNode getNode() {
        TreeNode t1 = new TreeNode();
        t1.val=1;
        TreeNode t2 = new TreeNode();
        t2.val=2;
        TreeNode t3 = new TreeNode();
        t3.val=3;
        TreeNode t4 = new TreeNode();
        t4.val=4;
        TreeNode t5 = new TreeNode();
        t5.val=5;
        TreeNode t6 = new TreeNode();
        t6.val=6;
        TreeNode t7 = new TreeNode();
        t7.val=7;
        TreeNode t8 = new TreeNode();
        t8.val=8;

        t5.left = t7;
        t5.right = t8;
        t3.left = t5;
        t3.right = t6;
        t2.left = t4;
        t1.left = t2;
        t1.right = t3;
        return t1;
    }
}
