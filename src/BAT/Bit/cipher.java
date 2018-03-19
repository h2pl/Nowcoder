package BAT.Bit;

/**
 * Created by 周杰伦 on 2018/3/19.
 */
public class cipher {
    int cipher(int text, int passwd) {
        return text^passwd;
    }
    int getText(int cipher, int passwd) {
        return cipher ^ passwd;
    }
}
