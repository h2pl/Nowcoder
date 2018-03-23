package BAT.Sort;

/**
 * Created by 周杰伦 on 2018/3/23.
 */
public class 有序矩阵查找 {
    public boolean Find(int target, int[][] array) {


        int row = 0;
        int column = array[0].length - 1;


        //二维矩阵，可化成正方形，如果这个数比左右边的数小，则列数减少。
        //如果这个数比右边的数大，则行数增加。
        while (column >=0 && row < array.length) {



            if (target == array[row][column])
                return true;


            else if (target < array[row][column])
                column--;

            else row++;


        }

        return  false;
    }
}
