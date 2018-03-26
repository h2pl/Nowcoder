package BAT.LinkedList;

import javax.sound.sampled.Line;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/26.
 */
public class 判断链表是否回文结构 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(1);
        System.out.println(isHuiwen(linkedList));


    }
    public static boolean isHuiwen(LinkedList<Integer> list) {
        if (list.size() <= 1)return true;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0;i < list.size();i ++) {
            stack.push(list.get(i));
        }
        for (int i = 0;i < list.size();i ++) {
            int top = stack.pop();
            if (top != list.get(i)) {
                return false;
            }
        }
        return true;


    }
}
