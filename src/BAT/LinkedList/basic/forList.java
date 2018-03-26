package BAT.LinkedList.basic;

/**
 * Created by 周杰伦 on 2018/3/26.
 */
public class forList {

    Node head;
    public Node p;
    public forList(Node head) {
        head.next = null;
        this.head = head;
        this.p = head;
    }

    public void add(Node node) {
        node.next = head;
        head.next = node;
        head = head.next;
    }
    public void remove(Node node) {

    }
    public void print () {
        do {
            System.out.println(p.val);
            p = p.next;
        }while (p.next != head);
        p = head;
    }
}
