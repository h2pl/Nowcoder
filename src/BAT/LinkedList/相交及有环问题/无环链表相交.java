package BAT.LinkedList.相交及有环问题;

import BAT.LinkedList.basic.Node;
import BAT.LinkedList.basic.逆序;

import static BAT.LinkedList.basic.逆序.reverse;

/**
 * Created by 周杰伦 on 2018/3/26.
 */
public class 无环链表相交 {
    public static void main(String[] args) {

    }
    public Node wuhuanxiangjiao(Node a, Node b) {
        a = reverse(a);
        b= reverse(b);
        while (a != null && b != null) {
            if (a == b)return a;
        }
        return null;
    }
}
