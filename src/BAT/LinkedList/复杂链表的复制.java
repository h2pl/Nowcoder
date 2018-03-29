package BAT.LinkedList;

/**
 * Created by 周杰伦 on 2018/3/26.
 *
 */
public class 复杂链表的复制 {

    class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead)
    {
        RandomListNode w = new RandomListNode(0);
        RandomListNode p = pHead;
        while (p!= null) {
            RandomListNode copy = new RandomListNode(p.label);
            copy.next = p.next;
            p.next = copy;
            w.next = p;
            p = copy.next;
        }
        RandomListNode pre = pHead;
        RandomListNode q = pHead.next;
        RandomListNode res = q;

        //串接节点
        RandomListNode temp = new RandomListNode(0);
        RandomListNode head = temp;

        while (q.next != null) {
            if (pre.random != null) {
                q.random = pre.random.next;
            }else q.random = null;
            pre = q.next;
            q.next = q.next.next;

            temp.next = q;
            temp = temp.next;

            q = q.next;
            if (q.next == null) {
                if (pre.random != null) {
                    q.random = pre.random.next;
                }else q.random = null;
                q.next = null;
                break;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node node = new Node();
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node3.rand = node2;
        node2.next = node3;
        node2.rand = node;
        node.next = node2;
        node.rand = node3;


        Node res = copy(node);
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
        Node pre =n;
        Node q = n.next;
        Node res = q;

        while (q.next != null) {
            q.rand = pre.rand.next;
            pre = q.next;
            q.next = q.next.next;
            q = q.next;
            if (q.next == null) {
                q.rand = pre.rand.next;
                q.next = null;
                break;
            }
        }
        return res;
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
