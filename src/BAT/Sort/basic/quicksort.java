package BAT.Sort.basic;

/**
 * Created by 周杰伦 on 2017/2/28.
 */
public class quicksort {

    public static void quicksort1(int num[], int left, int right) {
        int temp;
        int i = left, j = right;
        if (left < right)
        {
            temp=num[left];

            while (i != j) {
                while (i < j && num[j] > temp) --j;
                if (i < j) {
                    num[i] = num[j];
                    ++i;
                }

                while (i < j && num[i] < temp) ++i;
                if (i < j) {
                    num[j] = num[i];
                    --j;
                }

            }
            num[i] = temp;
            quicksort1(num, left, i - 1);
            quicksort1(num, i + 1, right);

        }
    }

    public static void main(String args[]) {
        int []num={13,33,22,1,23,14,12};
        quicksort1(num,0,6);
        for (int x = 0; x < num.length; x++)
            System.out.println(num[x]);

    }

}