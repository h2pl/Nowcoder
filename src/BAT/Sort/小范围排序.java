package BAT.Sort;

import BAT.Sort.basic.HeapSort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/3/23.
 * 写错了，记一下思路就好
 */
public class 小范围排序 {
    //数组几乎有序，每个元素调整次数不超过k。k对于数组长度来说很小。
    //用什么排序较好。
    //on2的算法 选择 冒泡与原始数列无关。插入不能保证移动次数少。
    //onlogn的算法 归并 快排 与初始顺序无关。 所以堆排序比较合适。移动次数少。说明复杂度为nlogk。
    //比起nlogn要小很多。
    public static void main(String[] args) {
        int []a = {1, 3, 6, 2, 3, 7, 9, 4};
        int b[]={2,1,4,3,6,5,8,7,10,9};
        adjustK(a,5, 3);
        System.out.println(Arrays.toString(a));
    }

    public static void adjustK(int []a, int start,int k) {

        ArrayList<Integer> list = new ArrayList<>();
        int i = start;
        int len = k;
        for (i = k / 2 - 1; i >= 0; i--) {// 构建一个小顶堆
            adjustSmallHeap(a, i, k - 1);
        }

        list.add(a[a.length - k]);
        for (int j = a.length-k;j >0;j --) {
            a[a.length - k] = a[j];
            heapSort(a);
            list.add(a[a.length - k]);
        }
        int s = 0;
        for (int w : list) {
            a[s++] = w;
        }
    }
    public static void adjustSmallHeap(int[] a, int i, int len) {
        int temp, j;
        temp = a[i];
        for (j = 2 * i; j < len; j *= 2) {// 沿关键字较大的孩子结点向下筛选
            if (j < len && a[j] > a[j + 1])
                ++j; // j为关键字中较大记录的下标
            if (temp <= a[j])
                break;
            a[i] = a[j];
            i = j;
        }
        a[i] = temp;
    }

    public static void heapSort(int[] a) {
        int i;
        for (i = a.length / 2 - 1; i >= 0; i--) {// 构建一个小顶堆
            adjustSmallHeap(a, i, a.length - 1);
        }
        for (i = a.length - 1; i >= 0; i--) {// 将堆顶记录和当前未经排序子序列的最后一个记录交换
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            adjustSmallHeap(a, 0, i - 1);// 将a中前i-1个记录重新调整为大顶堆
        }
    }
}
