package BAT.Bit;

/**
 * Created by 周杰伦 on 2018/3/19.
 */
public class Swap {
    public static void swap(int a, int b){
        System.out.println(a);
        System.out.println(b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        int a =1;
        int b =2;
        swap(a,b);
    }
}
