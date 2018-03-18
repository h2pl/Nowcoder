package BAT.DP;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/3/18.
 */
public class BackPack01 {
    public static int maxValue(int v[], int w[], int n,int W) {
        int [][]dp = new int[n][W+1];
        for(int i=0;i<n;i++) {
            Arrays.fill(dp[i], 0);
        }
        for(int i=0;i<n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=W;i++){
            if(i>w[0]) {
                dp[0][i] = v[0];
            }
            else dp[0][i] = 0;
        }
        for(int i = 1;i<n;i++) {
            for(int j = 0;j<=W;j++) {
                if (j < w[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    //放这件物品的总价值不一定比不放这件物品大。
                    //由于双循环中下标较小的值先算，所以此时一定有值。
                    dp[i][j] = Math.max(dp[i - 1][j - w[i]] + v[i],dp[i-1][j]);

                }
            }
        }

        return dp[n-1][W];

    }

    public static void main(String[] args) {
        int []w = {1,3,2,4};
        int []v = {2,3,4,1};
        int W = 5;
        int n =4;
        System.out.println(maxValue(v,w,n,W));
    }
}
