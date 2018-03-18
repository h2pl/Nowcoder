package BAT.DP;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/3/18.
 */
public class findLCS {
    public static int findLCS(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int [][]dp = new int[n][m];
        for(int i = 0;i<n;i++){
            Arrays.fill(dp[i], 0);
        }
        for(int i = 0;i < n;i++) {
            if(s1.charAt(i) == s2.charAt(0)) {
                for(int j = i;j < n;j ++) {
                    dp[j][0] = 1;
                }
            }
        }
        for(int i = 0;i < m;i++) {
            if(s1.charAt(0) == s2.charAt(i)) {
                for(int j = i;j < m;j ++) {
                    dp[0][j] = 1;
                }
            }
        }

        for (int i = 1;i < n;i ++) {
            for (int j = 1;j < m;j ++) {
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                if(s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1]+1);
                }
            }

        }
        return dp[n-1][m-1];
    }

    public static void main(String[] args) {
        String s1 = "1a2c3d4b56";
        String s2 = "b1d23ca45b6a";
        System.out.println(findLCS(s1, s2));
    }
}
