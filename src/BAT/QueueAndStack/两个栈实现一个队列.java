package BAT.QueueAndStack;

import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/25.
 */
public class 两个栈实现一个队列 {

    public static void main(String[] args) {
        Queue.add(3);
        System.out.println(Queue.get());;
        Queue.add(2);
        System.out.println(Queue.get());;
        Queue.add(1);
        System.out.println(Queue.remove());;
        System.out.println(Queue.get());;
    }
    static class Queue {
        private static Stack<Integer> stackPop = new Stack<>();
        private static Stack<Integer> stackPush = new Stack<>();
        static void add(int val) {
            stackPush.push(val);
        }
        static int remove() {
            if (!stackPop.isEmpty()) {
                return stackPop.pop();
            }
            else {
                while (!stackPush.isEmpty()) {
                    int i = stackPush.pop();
                    stackPop.push(i);
                }
            }
            return stackPop.pop();
        }
        static int get() {
            if (!stackPop.isEmpty()) {
                return stackPop.peek();
            }
            else {
                while (!stackPush.isEmpty()) {
                    int i = stackPush.pop();
                    stackPop.push(i);
                }
            }
            return stackPop.peek();
        }
    }
}
