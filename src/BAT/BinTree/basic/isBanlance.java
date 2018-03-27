package BAT.BinTree.basic;

/**
 * Created by 周杰伦 on 2018/3/27.
 */
public class isBanlance {
    public static void main(String[] args) {

    }
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
