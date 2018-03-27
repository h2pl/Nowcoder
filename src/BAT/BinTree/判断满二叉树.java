package BAT.BinTree;

import BAT.BinTree.basic.TreeNode;
import BAT.BinTree.basic.getHeight;

/**
 * Created by 周杰伦 on 2018/3/27.
 */
public class 判断满二叉树 {
    public static void main(String[] args) {

    }
    public boolean isFull(TreeNode t) {
        if (t == null) return true;
        int l = getHeight.getHeight(t);
        int count = count(t);
        if (Math.pow(2,l)-1 == count) {
            return true;
        }
        else return false;
    }
    int count = 0;
    public int count(TreeNode t) {
        if (t == null)return 0;
        if (t != null)count ++;
        count(t.left);
        count(t.right);
        return count;
    }
}
