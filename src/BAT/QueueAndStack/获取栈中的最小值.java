package BAT.QueueAndStack;

import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/25.
 */
public class 获取栈中的最小值 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(4);
        minStack.push(3);
        System.out.println(minStack.getmin());
    }

    static class MinStack extends Stack<Integer>{
        int min = Integer.MAX_VALUE;
        Stack<Integer> minStack = new Stack<>();
        public MinStack() {
            minStack.push(min);
        }

        @Override
        public Integer push(Integer item) {
            if (item < minStack.peek()) {
                minStack.push(item);
            }
            super.push(item);
            return item;
        }

        @Override
        public synchronized Integer pop() {
            if (minStack.peek() == min) {
                minStack.pop();
            }
            return super.pop();
        }

        public Integer getmin() {
            if (minStack.isEmpty()) {
                return null;
            }
            return minStack.peek();
        }
    }

}
