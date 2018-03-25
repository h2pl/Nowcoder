package BAT.QueueAndStack;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/3/25.
 */
public class 滑动窗口的最大值 {
    public static void main(String[] args) {
        int []a = {4,3,5,4,3,3,6,7};
        System.out.println(Arrays.toString(maxValueOfSlideWindow(a, 3)));
    }
    static int[] maxValueOfSlideWindow (int []a, int w) {
        int []res = new int[a.length - w + 1];
        int end = w;
        int start = 0;
        while (end <= a.length) {
            int max = a[start];
            for (int i = start; i < end; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            res[start] = max;
            start ++;
            end ++;
        }
        return res;
    }
}
