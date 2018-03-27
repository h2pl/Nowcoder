package BAT.BinTree;
import java.util.ArrayList;

/**
 * Created by 周杰伦 on 2018/3/27.
 *  * 0
 *  1   2
      3   4
 */
public class 中序遍历的序列 {
    public static void main(String[] args) {
        PNode root = new PNode(0);
        PNode treeNode1=new PNode(1);
        PNode treeNode2=new PNode(2);
        PNode treeNode3=new PNode(3);
        PNode treeNode4=new PNode(4);
        root.left=treeNode1;
        treeNode2.left=treeNode3;
        treeNode2.right=treeNode4;
        root.right=treeNode2;

        ArrayList<PNode> list = inOrderSeq(root);
        for (PNode p : list) {
            System.out.println(p.val);
        }
    }
    static ArrayList<PNode> list = new ArrayList<>();
    public static ArrayList<PNode> inOrderSeq(PNode pNode) {
        if (pNode == null) return null;
        inOrderSeq(pNode.left);
        list.add(pNode);
        inOrderSeq(pNode.right);
        return list;
    }
}
