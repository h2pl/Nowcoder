package BAT.Bit;

/**
 * Created by 周杰伦 on 2018/3/19.
 */
public class OddAppearance {
    static int getOddNum(String str) {
        int e0 = 0;
        char[] arr = str.toCharArray();
        for(int i = 0;i < arr.length; i ++) {
            e0 = e0^arr[i];
        }
        return e0;
    }

    public static void main(String[] args) {
        String s = "abbdeedgccaff";
        System.out.println((char)getOddNum(s));
    }
}
