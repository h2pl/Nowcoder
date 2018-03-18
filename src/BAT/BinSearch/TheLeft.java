package BAT.BinSearch;

/**
 * Created by 周杰伦 on 2018/3/16.
 * 有序数组中元素最左出现的位置。
 */
public class TheLeft {

    public int leftNum(int []arr, int x) {
        int res = -1;
        int size = arr.length;
        if(size == 0) return -1;
        if(size == 1 ){
            if(x == arr[0]){
                return 0;
            }else return -1;
        }

        int l=0,r=size-1;
        while(l<=r) {
           int mid = l + (r-l)/2;
           if(arr[mid]>x){
               r = mid -1;
           }
           else if(arr[mid]<x){
               l = mid +1;
           }
           else {

               res = mid;
               r = mid -1;
           }
        }
        return res;
    }
}
