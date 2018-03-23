package BAT.BinTree;

/**
 * Created by 周杰伦 on 2017/3/10.
 */
public class print {
    public static void preprint(TreeNode root){
        if(root!=null){
            System.out.print(root.val+" ");
            preprint(root.left);
            preprint(root.right);
        }

    }

    public static void inprint(TreeNode root){

        if(root!=null){
            inprint(root.left);
            System.out.print(root.val+" ");
            inprint(root.right);
        }


    }

    public static void postprint(TreeNode root){


        if(root!=null){
            postprint(root.left);
            postprint(root.right);
            System.out.print(root.val+" ");

        }
    }

    public static void main(String args[]){
        TreeNode t=new TreeNode();
        levelprint.initTree(t);
        postprint(t);

    }
}
