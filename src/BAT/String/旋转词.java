package BAT.String;

/**
 * Created by 周杰伦 on 2018/3/24.
 */
public class 旋转词 {
    public static void main(String[] args) {

    }
    public boolean rotateWord(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return (s1 + s1).contains(s2);
    }
}
