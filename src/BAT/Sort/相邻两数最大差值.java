package BAT.Sort;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/3/23.
 */
public class 相邻两数最大差值 {
    public static void main(String[] args) {
        int []a = {1,4,2,3,6,8,7};
        System.out.println(maxGap(a));
    }
    public static int maxGap (int []a){
        if (a.length <=1) return 0;
        if (a.length == 2) return Math.abs(a[1] - a[0]);
        Arrays.sort(a);
        int max = 0;
        for (int i = 1;i < a.length;i ++) {
            if (a[i] - a[i-1] > max) max = a[i] - a[i-1];
        }
        return max;
    }

}
