package BAT.LinkedList.basic;

/**
 * Created by 周杰伦 on 2018/3/26.
 */
public class 逆序 {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node2.next = node3;
        node.next = node2;

        node = reverse(node);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
    public static Node reverse(Node node) {
        if(node == null || node.next == null) {
            return node;
        }
        Node p = node;
        Node pre = null;
        Node q = null;
        while (p!= null) {
            q = p.next;
            p.next = pre;
            pre = p;
            p = q;
        }
        return pre;
    }
}
