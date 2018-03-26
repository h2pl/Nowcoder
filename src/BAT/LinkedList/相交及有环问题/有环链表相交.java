package BAT.LinkedList.相交及有环问题;

import BAT.LinkedList.basic.Node;

/**
 * Created by 周杰伦 on 2018/3/26.
 * 环节点相同时
 * 分成两种情况。一种是在入环前相交，一种是在入环处相交
 * 环节点不相同时，又分为两种情况
 */
public class 有环链表相交 {
    public static void main(String[] args) {

    }
    public int length (Node a, Node meet) {
        int len = 0;
        while (a != meet) {
            len ++;
            a = a.next;
        }
        return len;
    }
    public Node xiangjiao(Node a,Node b) {
        Node h1 = 链表有环.youhuan(a);
        Node h2 = 链表有环.youhuan(b);
        //人环节点不同
        if(h1 != h2){
            Node p1 = h1;
            Node p2 = h2;
            while (p1.next != p1) {
                p1 = p1.next;
                if (p1 == p2) return p1;
            }
            return null;
        }
        // 入环节点相同
        else {
            while (a != h1 && b != h2) {
                if (a == b) return a;
                else {
                    int l1 = length(a, h1);
                    int l2 = length(b, h2);
                    int len = l1 > l2 ?(l1 - l2):(l2 - l1);
                    if (l1 < l2) {
                        while (len > 0) {
                            a = a.next;
                            len --;
                        }
                    }
                    if (l1 > l2) {
                        while (len > 0) {
                            b = b.next;
                            len --;
                        }
                    }
                    break;

                }
            }
            while (a != h1 && b != h2) {
                if (a == b) {
                    return a;
                }else {
                    a = a.next;
                    b = b.next;
                }
            }
            return h1;
        }

    }
}
