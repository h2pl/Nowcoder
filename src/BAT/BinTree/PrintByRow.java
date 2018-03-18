package BAT.BinTree;

import java.util.*;

/**
 * Created by 周杰伦 on 2018/3/14.
 */
public class PrintByRow {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = pRoot;
        if(root == null) {
            return new ArrayList<>();
        }
        TreeNode last = root;
        TreeNode nlast = root;
        queue.offer(root);
        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(root);
        list.add(null);
        while (!queue.isEmpty()){

            TreeNode t = queue.poll();

            if(t.left != null) {
                queue.offer(t.left);
                list.add(t.left);
                nlast = t.left;
            }
            if(t.right != null) {
                queue.offer(t.right);
                list.add(t.right);
                nlast = t.right;
            }
            if(t == last) {
                if(!queue.isEmpty()) {
                    list.add(null);
                    last = nlast;
                }
            }
        }

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(TreeNode t :list) {
            if( t != null) {
                list1.add(t.val);
            }
            else {

                ArrayList<Integer> temp = new ArrayList<>();
                temp.addAll(list1);
                arr.add(temp);
                list1.clear();
            }
        }

        return arr;
    }


    public static void main(String[] args) {

        TreeNode t1 = new TreeNode();
        t1.val=1;
        TreeNode t2 = new TreeNode();
        t2.val=2;
        TreeNode t3 = new TreeNode();
        t3.val=3;
        TreeNode t4 = new TreeNode();
        t4.val=4;
        TreeNode t5 = new TreeNode();
        t5.val=5;
        TreeNode t6 = new TreeNode();
        t6.val=6;
        TreeNode t7 = new TreeNode();
        t7.val=7;
        TreeNode t8 = new TreeNode();
        t8.val=8;

        t5.left = t7;
        t5.right = t8;
        t3.left = t5;
        t3.right = t6;
        t2.left = t4;
        t1.left = t2;
        t1.right = t3;
        printByRow(t1);
        for(ArrayList<Integer> list : printByRow(t1)) {
            for(Integer i : list) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> printByRow(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) {
            return null;
        }
        TreeNode last = root;
        TreeNode nlast = root;
        queue.offer(root);
        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(root);
        list.add(null);
        while (!queue.isEmpty()){
            TreeNode t = queue.poll();
            if(t.left != null) {
                queue.offer(t.left);
                list.add(t.left);
                nlast = t.left;
            }
            if(t.right != null) {
                queue.offer(t.right);
                list.add(t.right);
                nlast = t.right;
            }
            if(t == last) {
                if(!queue.isEmpty()) {
                    list.add(null);
                    last = nlast;
                }
            }
        }
        for(TreeNode t: list) {
            if(t != null) {
                System.out.print(t.val + " ");
            }else {
                System.out.println();
            }
        }
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(TreeNode t :list) {

            if( t != null) {
                list1.add(t.val);
            }
            else {
                arr.add(list1);
                list1.clear();
            }
        }
        return arr;
    }
    //其余二叉树算法 先序中序后序 层次
    public void prior(TreeNode root){
        System.out.println(root);
        prior(root.left);
        prior(root.right);
    }
    public void mid(TreeNode root){
        prior(root.left);
        System.out.println(root);
        prior(root.right);

    }
    public void rear(TreeNode root){
        prior(root.left);
        prior(root.right);
        System.out.println(root);
    }
    public void BFS(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode t = queue.poll();
            System.out.println(t.val);
            if(t.left != null) {
                queue.offer(t.left);
            }
            if(t.right != null) {
                queue.offer(t.right);
            }
        }
    }

    public void DFS(TreeNode root){
        TreeNode t = root;
        if (t != null) {
            System.out.println(t.val);
            if (t.left != null) {
                DFS(t.left);
            }
            if(t.right != null) {
                DFS(t.right);
            }
        }

    }
}
