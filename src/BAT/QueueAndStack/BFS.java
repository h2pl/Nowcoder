package BAT.QueueAndStack;

import BAT.BinTree.basic.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by 周杰伦 on 2018/3/25.
 */
public class BFS {
    public static void main(String[] args) {
        TreeNode t = TreeNode.getNode();
        bfs(t);
    }
    public static void bfs(TreeNode t) {
        if (t == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(t);
        while (!queue.isEmpty()) {
            TreeNode p = queue.poll();
            System.out.println(p.val);
            if (p.left != null) {
                queue.offer(p.left);
            }
            if (p.right != null) {
                queue.offer(p.right);
            }
        }
    }
}
