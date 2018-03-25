package BAT.String;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/3/24.
 * 先将整句逆序，再将单词逆序
 */
public class 英文句子逆序 {
    public static void main(String[] args) {
        String s = "hello mike";
        System.out.println(reverseSentence(s));
    }
    public static String reverseSentence(String str) {
        char []a = str.toCharArray();
        reverse(a, 0, a.length - 1);
        int i = 0;
        int begin = 0;
        while (i <= a.length - 1) {
            if (i > 1 && a[i] == ' ') {
                reverse(a, begin, i - 1);
                begin = i + 1;
            }else if (i == a.length - 1) {
                reverse(a, begin, i);
            }

            i ++;
        }

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
