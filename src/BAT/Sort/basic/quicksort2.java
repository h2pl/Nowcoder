package BAT.Sort.basic;

/**
 * Created by 周杰伦 on 2017/2/28.
 */
public class quicksort2 {

    public static int partition(int []array,int lo,int hi){
        //固定的切分方式
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key && hi>lo){//从后半部分向前扫描
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key && hi>lo){
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        return hi;
    }

    public static void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi);
    }

    public static void main(String args[]){
        int []num={1,3,22,121,123,21};
        sort(num,0,5);
        for(int x=0;x<5;x++)
            System.out.println(num[x]);

    }
}