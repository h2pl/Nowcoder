package BAT.Sort;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/3/23.
 */
public class 是否有数重复出现 {
    public static void main(String[] args) {
        int []a = {2,4,1,7,45,86,3,1,6,17,1};
        System.out.println(duplicate(a));
    }
    public static boolean duplicate(int []a) {
        Arrays.sort(a);
        for (int i = 1;i < a.length;i ++) {
            if (a[i] == a[i - 1]){
                return true;
            }
        }
        return false;
    }
}
