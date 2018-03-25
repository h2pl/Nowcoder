package BAT.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by 周杰伦 on 2018/3/24.
 */
public class 变形词 {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "2331";
        System.out.println(StrToStr(s1, s2));
    }
    public static boolean StrToStr(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0;i < s1.length(); i ++) {
            if (map1.containsKey(s1.charAt(i))) {
                map1.put(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
            }
            else {
                map1.put(s1.charAt(i), 1);
            }
        }
        for (int i = 0;i < s2.length(); i ++) {
            if (map2.containsKey(s2.charAt(i))) {
                map2.put(s2.charAt(i), map2.get(s2.charAt(i)) + 1);
            }
            else {
                map2.put(s2.charAt(i), 1);
            }
        }

        if (map1.equals(map2)) return true;
        else return false;


    }
}
