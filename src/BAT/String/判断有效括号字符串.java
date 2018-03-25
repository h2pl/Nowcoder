package BAT.String;

import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/3/24.
 */
public class 判断有效括号字符串 {
    public static void main(String[] args) {
        String s = "((asdas)))";
        System.out.println(legalStr(s));
    }
    public static boolean legalStr(String s) {
        int count = 0;
        for (int i = 0;i < s.length(); i ++) {
            if (s.charAt(i) == '(')
            count ++;
            else if (s.charAt(i) == ')') {
                count --;
            }
        }
        return count == 0;
    }
}
