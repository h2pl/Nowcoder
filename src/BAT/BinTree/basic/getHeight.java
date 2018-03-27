package BAT.BinTree.basic;

/**
 * Created by 周杰伦 on 2018/3/27.
 */
public class getHeight {
    public static void main(String[] args) {

    }
    public static int getHeight( TreeNode t) {
        if (t == null) return 0;
        int left = getHeight(t.left);
        int right = getHeight(t.right);
        return (left > right ? left : right) + 1;
    }
}

