package BAT.DP;

/**
 * Created by 周杰伦 on 2018/3/18.
 * 跳台阶的方法
 */
public class ladder {
    public int jump(int n) {
        if( n ==0)return 0;
        if( n ==1 )return 1;
        if( n ==2) return 2;
        else return jump(n-1) + jump(n-2);
    }

    public int jumpArr(int n) {
        int []arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        if(n <=2 ) return arr[n];
        for(int i= 3;i <=n ;i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
            return arr[n];
    }

}
