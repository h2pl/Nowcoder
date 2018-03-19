package BAT.Bit;

/**
 * Created by 周杰伦 on 2018/3/19.
 */
public class Compare {
    public static int getBiggerWithoutCompare(int a,int b) {
        int c = a - b;
        int sc = sign(c);
        int sa = sc;
        int sb = flip(sa);
        return sa*a + sb*b;
    }
    //用于反转0和1
    static int flip(int x){
        return x^1;
    }
    //0代表负数
    //1代表正数
    static int sign(int x){
        return flip((x>>31)&1);
    }

    public static void main(String[] args) {
        int a =-4;int b =-8;
        System.out.println(getBiggerWithoutCompare(a,b));
    }

}
