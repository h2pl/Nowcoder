package BAT.BinTree;

import java.util.Set;

/**
 * Created by 周杰伦 on 2018/3/16.
 */
public class Serialize {
    static StringBuffer sb = new StringBuffer();
    static String Serialize(TreeNode root) {
        if(root == null) {
            sb.append("#!") ;
        }
        else {
            sb.append(root.val + "!");
            Serialize(root.left);
            Serialize(root.right);
        }

        return sb.toString();
    }

    public static int index = -1;
    static TreeNode Deserialize(String str) {
        index ++;
        int len = str.length();
        if(index >= len) {
            return null;
        }
        String[] strr = str.split("!");
        TreeNode node = null;
        if(!strr[index].equals("#")) {
            node = new TreeNode(Integer.valueOf(strr[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;

    }
    public static void main(String[] args) {
        TreeNode t = TreeNode.getNode();
        System.out.println(Serialize(t));
        PrintByRow.printByRow(Deserialize(Serialize(t)));
    }
}
