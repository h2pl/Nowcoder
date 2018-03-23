package BAT.Sort;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/3/23.
 */
public class 荷兰国旗 {
    public static void hollan (int []arr) {
        int l,r,f;
        l = 0;
        r = arr.length - 1;
        f = 0;
        int temp = 0;

        for (;f <= r;f ++) {
            if (arr[f] == 0) {
                temp = arr[f];
                arr[f] = arr[l];
                arr[l] = temp;
                l ++;
            }
            else if (arr[f] == 2) {
                temp = arr[f];
                arr[f] = arr[r];
                arr[r] = temp;
                r --;
                //因为是从左到右遍历。所以从右边换过来的值还没判断，需要判断
                f --;
            }

        }
    }

    public static void main(String[] args) {
        int []a = {0,2,1,2,1,1,1,1,0,0,0,0,1,2,1};
        hollan(a);
        System.out.println(Arrays.toString(a));
    }
}
