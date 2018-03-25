package BAT.String.Basic;

/**
 * Created by 周杰伦 on 2018/3/24.
 */
public class 字符串逆序 {
    public static void reverse(char[] str,int start, int end) {
        int l = start;
        int r = end;
        while (l < r) {
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l ++;
            r --;
        }
    }
}
