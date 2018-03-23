package BAT.大数据;

/**
 * Created by 周杰伦 on 2018/3/19.
 *     10亿个ip排序，32位无符号数。若转化为整数再排序。需要4g内存
 *     如果用Bitmap，只需一个长度为2^32的bit数组可以表示所有的32位二进制数。
 *     此时。所有ip由于不重复，只需保存在对应数的位置。
 *     保存后，遍历bitmap，取出来的ip就是有序的了，
 *
 */
public class ipSort {

}
