package BAT.String;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by 周杰伦 on 2018/3/24.
 */
public class 最小字典序字符串数组 {
    public static void main(String[] args) {
        String[] arr = {"abc", "de", "a", "c"};
        minSortStrArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static String[] minSortStrArray(String []arr) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o1 + o2).compareTo(o2 + o1));
            }
        });
        return arr;
    }

}
