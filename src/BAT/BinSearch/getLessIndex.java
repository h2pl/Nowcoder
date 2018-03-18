package BAT.BinSearch;

/**
 * Created by 周杰伦 on 2018/3/16.
 * 无序数组的局部最小值
 */
public class getLessIndex {
    public int getLessIndex(int []arr) {
        int size = arr.length;
        if(size == 0) return 0;
        if(size == 1)return arr[0];
        if(arr[size-2]>arr[size-1]){
            return size - 1;
        }
        if(arr[0]<arr[1]){
            return 0;
        }

        int l=0,r=size-1;
        while (l<=r) {
            int mid = l +(r-l)/2;
            if(arr[mid]>arr[mid+1]){
                l = mid+1;
            }
            else if(arr[mid]>arr[mid-1]){
                r = mid -1;
            }
            else return mid;
        }
        return -1;
    }
}
