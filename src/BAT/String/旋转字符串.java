package BAT.String;

/**
 * Created by 周杰伦 on 2018/3/24.
 */
public class 旋转字符串 {
    public static void main(String[] args) {
        String a = "abcde";
        System.out.println(rotateString(a, 2));
    }
    public static String rotateString(String str, int i) {
        char []a = str.toCharArray();
        reverse(a, 0 , i);
        reverse(a, i + 1, a.length - 1);
        reverse(a, 0, a.length - 1);
        return String.valueOf(a);
    }
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
