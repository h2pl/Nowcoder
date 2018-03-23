package BAT.Sort.basic;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2017/3/9.
 */
public class selectsort {
    public static void selectSort(int []num) {

        int i,j=0,k=0,temp;
        for (i = 0; i < num.length; i++) {
            int min = num[i];
            k=i;
            while (k< num.length) {
                if (min > num[k]) {
                    min = num[k];
                    j = k;
                    k++;
                }else k++;
            }
            if(i<num.length) {
                temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }

        }

    }


    public static void main(String args[])
    {
        int []a={1,3,23,22,12,32,11};

        selectSort(a);
        System.out.println(Arrays.toString(a));
    }

    }

