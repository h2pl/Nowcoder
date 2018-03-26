package BAT.LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by 周杰伦 on 2018/3/26.
 */
public class 链表的荷兰旗问题 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.offer(1);
        linkedList.offer(3);
        linkedList.offer(7);
        linkedList.offer(4);
        linkedList.offer(8);
        linkedList.offer(6);
        linkedList.offer(10);
        sort(linkedList, 6);


    }
    public static void sort(LinkedList<Integer> l, int val) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();
        while (!l.isEmpty()) {
            int num = l.remove();
            if (num < val) l1.offer(num);
            else if (num > val)l3.offer(num);
            else l2.offer(num);
        }
        System.out.println(Arrays.toString(l1.toArray()));
        System.out.println(Arrays.toString(l2.toArray()));
        System.out.println(Arrays.toString(l3.toArray()));

    }
}
