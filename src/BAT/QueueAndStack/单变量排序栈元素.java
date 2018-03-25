package BAT.QueueAndStack;

import java.util.Collections;
import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/25.
 */
public class 单变量排序栈元素 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 10; i > 0; i --) {
            stack.push(i);
        }

        sortStack(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
    public static void sortStack(Stack<Integer> stack) {
        if(stack.isEmpty() || stack.size() == 1)return;
        Stack<Integer> stackHelp = new Stack<>();
        int i = stack.pop();
        stackHelp.push(i);
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            if (temp > stackHelp.firstElement()) {
                int count = 0;
                while (!stackHelp.isEmpty()) {
                    stack.push(stackHelp.pop());
                    count ++;
                }
                stackHelp.push(temp);
                while (count > 0) {
                    stackHelp.push(stack.pop());
                    count --;
                }
            }
            else {
                stackHelp.push(temp);
            }
        }
        while (!stackHelp.isEmpty()) {
            stack.push(stackHelp.pop());
        }
    }
}
