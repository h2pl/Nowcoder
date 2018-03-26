package BAT.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/26.
 */
public class 单链表每k个元素逆序 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int i = 0;
        while (i < 10) {
            list.add(i);
            i ++;
        }
        reverseK(list, 3);
        System.out.println(Arrays.toString(list.toArray()));
    }
    static void reverseK(LinkedList<Integer> list, int k) {
        if (k < 2)return;
        if (list.size() < k) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        LinkedList<Integer> res = new LinkedList<>();
        while (!list.isEmpty() && list.size() >= k) {
            while (count < k) {
                int i = list.remove();
                stack.push(i);
                count++;
            }
            while (!stack.isEmpty()) {
                int i = stack.pop();
                res.addLast(i);
            }
            count = 0;
        }
        while (!list.isEmpty()) {
            res.addLast(list.remove());
        }
        list.addAll(res);
    }
}
