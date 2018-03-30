package BAT.DP;

/**
 * Created by 周杰伦 on 2018/3/18.
 */
public class 把字符串1修改成字符串2的最大开销 {
    public static int minCost(String s1, String s2, int ic, int rc, int dc) {
        int n = s1.length();
        int m = s2.length();
        int [][]dp = new int[n][m];
        for(int i = 0;i<n;i++) {
            dp[i][0] = i*dc;
        }
        for(int i = 0;i<m;i++) {
            dp[0][i] = i*ic;
        }
        for(int i = 1;i<n;i++) {
            for(int j = 1;j<m;j++) {
                int min = 0;
                int c1 = dp[i-1][j] + dc;
                int c2 = dp[i][j-1] + ic;
                int c3 = dp[i - 1][j - 1] + rc;
                if(s1.charAt(i) == s2.charAt(j)) {
                   c3 = dp[i - 1][j - 1];
                }
                min = Math.min(c1,c2);
                min = Math.min(min, c3);
                dp[i][j] = min;
            }
        }
        return dp[n-1][m-1];

    }

    public static void main(String[] args) {
        System.out.println(minCost("ab12cd3", "abcdf", 5,2,3));
    }
}
