package BAT.LinkedList.相交及有环问题;

import BAT.LinkedList.basic.Node;

/**
 * Created by 周杰伦 on 2018/3/26.
 */
public class 链表有环 {
    public static void main(String[] args) {

    }
    public static Node youhuan(Node node) {
        Node slow = node;
        Node fast = node;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = node;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}
