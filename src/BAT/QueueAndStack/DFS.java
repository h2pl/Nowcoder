package BAT.QueueAndStack;

import BAT.BinTree.basic.TreeNode;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/25.
 */
public class DFS {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode treeNode1=new TreeNode(5);
        TreeNode treeNode2=new TreeNode(12);
        TreeNode treeNode3=new TreeNode(4);
        TreeNode treeNode4=new TreeNode(7);
        treeNode1.left=treeNode3;
        treeNode1.right=treeNode4;
        root.left=treeNode1;
        root.right=treeNode2;
        TreeNode treeNode = TreeNode.getNode();
        dfs(treeNode);
    }
    static Stack<Integer> stack = new Stack<>();
    public static void dfs(TreeNode t) {
        if (t == null)return;
        HashMap<Integer, Integer> map = new HashMap<>();
        stack.push(t.val);
        if (!stack.isEmpty()) {
            int top = stack.peek();
            if (map.getOrDefault(top, 0) == 0) {
                System.out.println(top);
                map.put(top, 1);
            }
        }
        dfs(t.left);
        dfs(t.right);
        stack.pop();

    }
}
