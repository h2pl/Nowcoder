package BAT.DP;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/3/18.
 */
public class 最长递增子序列 {
    public static int longestIncreasingSubsequence(String str) {
        //dpi代表以i为结尾的最长递增子序列长度。
        if(str.equals("") || str == null)return 0;
        int[] arr = new int[str.length()];
        for(int i = 0; i < str.length(); i++)
        {
            //先由字符串转换成char,再转换成String,然后Integer
            arr[i] = Integer.parseInt( String.valueOf(str.charAt(i)));
        }
        int dp[] = new int[str.length()];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for(int i = 1;i<dp.length;i ++) {
            int max = 1;
            for(int j = 0;j < i && arr[j] <arr[i];j ++) {
                if(dp[j]>=max){
                    max=dp[j];
                }
            }
            dp[i] = max + 1;

        }
        return dp[str.length() - 1];

    }

    public static void main(String[] args) {
        String s = "215364897";
        System.out.println(longestIncreasingSubsequence(s));
    }
}
