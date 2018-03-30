package BAT.DP;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/3/18.
 */
public class 矩阵中走的最短路径 {
    public int DP(int [][]map ) {
        int n = map.length -1;
        int m = map[0].length -1;
        int [][]dp = new int[n + 1][m + 1];
        Arrays.fill(dp, 0);
        dp[0][0] = map[0][0];

        for(int i = 1;i <=n;i++) {
            dp[0][i] = map[0][i] + dp[0][i-1];
        }
        for(int i = 1;i <= m;i++) {
            dp[i][0] = map[i][0] + dp[i-1][0];
        }
        for(int i = 1,j=1;i<=n && j<=m;){
            dp[i][j] = map[i][j] + Math.min(dp[i - 1][j],dp[i][j-1]);
        }
        return dp[n][m];
    }

    public static void main(String[] args) {

    }
}
