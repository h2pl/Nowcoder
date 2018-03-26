package BAT.LinkedList;

/**
 * Created by 周杰伦 on 2018/3/26.
 * 代码有误
 */
public class 复杂链表的复制 {
    public static void main(String[] args) {
        Node node = new Node();
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node3.rand = node2;
        node2.next = node3;
        node2.rand = node;
        node.next = node2;
        node.rand = node3;


        Node res = copyAll(node);
        while (res!=null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
    public static Node copy(Node n) {
        Node p = n;
        while (p!= null) {
            Node copy = new Node(p.val,null,null);
            copy.next = p.next;
            p.next = copy;
            p = copy.next;
        }
        return n;
    }
    public static Node copyAll(Node list) {
        Node node = copy(list);
        Node p = node;
        if (p == null || p.next == null)return null;
        Node head = new Node();
        Node h = head;
        while (p != null && p.val == p.next.val) {
            p.next.rand = p.rand;
            p.next.next = p.next.next.next;
            //将复制节点提取出来
            Node copy = p.next;
            h.next = copy;
            h = h.next;
            
            p = p.next.next;
        }
        return head.next;
    }
    static class Node{
        int val;
        Node next;
        Node rand;
        Node(int val, Node next, Node rand) {
            this.val = val;
            this.next = next;
            this.rand = rand;
        }
        Node() {
            val = 1;
            next = null;
            rand = null;
        }
        Node(int val) {
            this.val = val;
            next = null;
            rand = null;
        }
    }
}
