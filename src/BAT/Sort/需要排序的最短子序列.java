package BAT.Sort;

/**
 * Created by 周杰伦 on 2018/3/23.
 * 从左边起，不断更新最大值，找到A【i】值比最大值大时替换最大值，比最大值小时更新下标记录为r。
 * 从右边起，不断更新最小值，找到A【i】值比最小值小时替换最小值，比最小值大时更新下标记录为r。
 */
public class 需要排序的最短子序列 {
    public static void main(String[] args) {
        int []a = {1,5,3};
        System.out.println(shortestLength(a));
    }
    public static int shortestLength (int []a) {
        if (a.length <= 1)return 0;
        if (a.length == 2)return a[0] > a[1] ? 2:0;

        int min = a[a.length - 1];
        int max = a[0];
        int l = 0,r = 0;
        int i = 1;
        int j = a.length - 2;
        for(;i < a.length;i ++) {
            if (max < a[i]) {
                max = a[i];
            }
            else r = i;
        }
        for (;j > 0;j --) {
            if (min > a[j]) {
                min = a[j];
            }
            else l = j;
        }

        return r - l;
    }

}
