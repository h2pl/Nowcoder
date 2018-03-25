package BAT.QueueAndStack;

import BAT.BinTree.TreeNode;
import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/25.
 */
public class DFS {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.getNode();
        dfs(treeNode);
    }
    public static void dfs(TreeNode t) {
        if (t == null)return;
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        stack.push(t.val);
        if (!stack.isEmpty()) {
            int top = stack.pop();
            if (map.getOrDefault(top, 0) == 0) {
                System.out.println(top);
                map.put(top, 1);
            }
        }
        dfs(t.left);
        dfs(t.right);

    }
}
