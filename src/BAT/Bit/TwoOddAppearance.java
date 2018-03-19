package BAT.Bit;

/**
 * Created by 周杰伦 on 2018/3/19.
 */
public class TwoOddAppearance {
    static int[] getTwoOddNum(String str) {
        int e0 = 0;
        char[] arr = str.toCharArray();
        for (int i = 0;i < arr.length; i ++) {
            e0 = e0^arr[i];
        }
        //e0为两个不同数异或的结果且不为0。
        //所以e0的32位中至少一位不为0。设为k。
        //说明a和b在第k位一个是0，一个是1
        int a = 0;
        int b = 0;
        int e1 = 0;
        int k = 0;
        int temp = e0;
        while ( (temp & 1) != 1) {
            temp >>= 1;
            k ++;
        }
        double help = Math.pow(2.0, k);
        for (int i = 0;i < arr.length;i ++) {
            if (1 == ((arr[i]>>k) & 1)){
                b = b^arr[i];
            }
        }
        a = e0 ^ b;
        int []res = new int[2];
        res[0] = a;
        res[1] = b;
        return res;
    }


    public static void main(String[] args) {
        String s = "abbdeedgccaffs";
        int a[] = getTwoOddNum(s);
        for(int i : a) {
            System.out.println((char)i);
        }


    }
}
