package BAT.Sort.basic;

/**
 * Created by 周杰伦 on 2017/3/10.
 */
public class dividesort {
    public static int dividesort(int []num, int x){
        int left=0;
        int right=num.length-1;
        while(left<=right) {
            int mid = (left + right) / 2;
        if(num[mid]>x){
            right=mid-1;
        }
        else if(num[mid]<x){
            left=mid+1;
        }
        else return mid;
        }


        return -1;
    }
    public static void main(String args[]){
        int []a={1,2,3,4,5,6,7,8,9,10};

        System.out.println(dividesort(a,6));

    }
}
