package BAT.Sort;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/3/23.
 */
public class 有序数组合并 {
    //1 3 5
    //2 4 6
    //从后往前，两两比较，大的放最后，小的放次后，以此类推。
    public static void combineSortArrays (int []a, int []b,int n,int m) {
        int len = a.length - 1;
        int i = n - 1;
        int j = m - 1;
        while (i >= 0 && j >= 0 && len >= 0) {
            if (a[i] > b[j]) {
                a[len --] = a[i --];
            }
            else {
                a[len --] = b[j --];
            }
        }
        while (j >= 0) {
            a[j] = b[j];
            j --;
        }
    }
    public static void main(String[] args) {
        int []a = new int[6];
        int []b = new int[4];
        b[0] = 2;
        b[1] = 4;
        b[2] = 6;
        b[3] = 8;
        a[0] = 1;
        a[1] = 3;

        combineSortArrays(a, b, 2, 4);
        System.out.println(Arrays.toString(a));
    }
}
