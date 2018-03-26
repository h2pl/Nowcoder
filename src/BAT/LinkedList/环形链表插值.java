package BAT.LinkedList;

import BAT.LinkedList.basic.Node;
import BAT.LinkedList.basic.forList;

import java.util.LinkedList;

/**
 * Created by 周杰伦 on 2018/3/26.
 * 错误示范
 *
 */
public class 环形链表插值 {
    public static void main(String[] args) {
        Node node = new Node(1);
        forList list = new forList(node);
        list.add(new Node(2));
        list.add(new Node(4));
        list.add(new Node(3));
        list.add(new Node(0));
        list.print();
    }
    public void insert(forList list, int val) {
        Node head = list.p;
        Node pre = head;
        head = head.next;

        if (val < pre.val) {
            Node n = list.p;
            while (n.next != head) {
                n = n.next;
            }
            n.next = new Node(val, head);
            list.p = n.next;
        }
        while (val > head.val) {
            head = head.next;
        }
        if (head.next == list.p) {
            head.next = new Node(val, list.p);
        }
        else {
            Node temp = head.next;
            head.next = new Node(val, temp);
        }
    }
}
