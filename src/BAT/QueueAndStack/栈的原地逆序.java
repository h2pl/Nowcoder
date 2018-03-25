package BAT.QueueAndStack;

import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/25.
 */
public class 栈的原地逆序 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        System.out.println(get(stack));
        System.out.println(get(stack));

        Stack<Integer> stack2 = new Stack<>();
        for (int i = 1;i < 10;i ++) {
            stack2.push(i);
        }
        reverse(stack2);
        while (!stack2.isEmpty())
        System.out.print(stack2.pop());
    }
    static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty())return;
        else {
            int i = get(stack);
            reverse(stack);
            stack.push(i);
        }
    }

    static int get(Stack<Integer> stack) {
        if (stack.isEmpty()){
            System.exit(-1);
        }
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        }
        else {
            int res2 = get(stack);
            stack.push(result);
            return res2;
        }
    }
}
