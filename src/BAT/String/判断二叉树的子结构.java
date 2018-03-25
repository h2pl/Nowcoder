package BAT.String;

import BAT.BinTree.TreeNode;

/**
 * Created by 周杰伦 on 2018/3/24.
 */
public class 判断二叉树的子结构 {
    //这种方法是错的，因为前序遍历不能确定一个二叉树
    public static void main(String[] args) {
        System.out.println(("8!8#").contains("!8"));
        System.out.println(1 + "!#");
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2 == null) return false;
        if (root1 == null) return false;
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = new StringBuffer();
        Serialize(root1, sb);
        midSerialize(root1, sb1);
        String str1 = sb.toString();
        String str11 = sb1.toString();
        Serialize(root2 ,sb2);
        midSerialize(root1, sb3);
        String str2 = sb2.toString();
        String str22 = sb3.toString();
        return str1.contains(str2) && str11.contains(str22);
    }

    void Serialize(TreeNode root, StringBuffer sb) {
        if(root == null) {
            sb.append("#!") ;
            return;
        }

        sb.append(root.val + "!");
        Serialize(root.left, sb);
        Serialize(root.right, sb);
    }

    void midSerialize(TreeNode root, StringBuffer sb) {

        Serialize(root.left, sb);
        if(root == null) {
            sb.append("#!") ;
            return;
        }
        sb.append(root.val + "!");
        Serialize(root.right, sb);
    }
}
