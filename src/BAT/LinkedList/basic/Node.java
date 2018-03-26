package BAT.LinkedList.basic;

/**
 * Created by 周杰伦 on 2018/3/26.
 */
public class Node {
    public int val;
    public Node next;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
    Node() {

    }
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

}
