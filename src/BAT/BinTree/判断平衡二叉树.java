package BAT.BinTree;

import BAT.BinTree.basic.TreeNode;
import BAT.BinTree.basic.getHeight;

/**
 * Created by 周杰伦 on 2018/3/27.
 */
public class 判断平衡二叉树 {
    boolean isBanlance(TreeNode t) {

        if (t == null) return true;
        int left = getHeight.getHeight(t.left);
        int right = getHeight.getHeight(t.right);
        if(Math.abs(left - right) > 1) {
            return false;
        }
        return isBanlance(t.left) && isBanlance(t.right);


    }
}
