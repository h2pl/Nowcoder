package BAT.BinTree;

import BAT.BinTree.basic.TreeNode;

import java.util.ArrayList;

import static BAT.BinTree.中序遍历的序列.inOrderSeq;

/**
 * Created by 周杰伦 on 2018/3/27.
 */
public class 有父节点的树找后继节点 {

    public static void main(String[] args) {

    }
    public PNode findNextNode(PNode anynode) {
        if (anynode == null) return null;
        PNode p = anynode;
        while (p.parent != null) {
            p = p.parent;
        }
        ArrayList<PNode> list = inOrderSeq(p);
        for (int i = 0;i < list.size();i ++) {
            if (list.get(i) == anynode) {
                if (i + 1 < list.size()) {
                    return list.get(i + 1);
                }
                else return null;
            }
        }
        return null;

    }
}
class PNode {
    public int val;
    public PNode left;
    public PNode right;
    public PNode parent;

    public PNode(int val){
        this.val = val;
    }
    public PNode(){}
}
