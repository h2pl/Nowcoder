package BAT.BinSearch;

/**
 * Created by 周杰伦 on 2018/3/16.
 * 有序循环数组的最小值
 */
public class minNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {

        int size = array.length;
        if(size ==0 )return 0;
        if(size ==1 )return array[0];
        if(array[0]<array[size -1]) {
            return array[0];
        }

        int l=0,r=size-1;
        while(l<r){

            int mid = l + (r-l)/2;
            if(array[mid]>array[r])
            {
                l=mid+1;
            }
            else if(array[mid]<array[l]){
                r=mid;
            }
            else break;
        }
        if(r==l){
            return array[l];
        }
        int min = array[l];
        while(l<=r){
            if(array[l]<min){
                min = array[l];
            }
            l++;
        }
        return min;
    }
}
