package BAT.Sort.basic;

/**
 * Created by 周杰伦 on 2017/2/28.
 */
public class insertsort {

    public static void insertsort(int num[])
    {
        int i=0;
        int j=i;
        int temp=0;
        //从i开始倒着插入，操作次数少很多
        for(i=0;i<num.length-1;i++){
            j=i;
            temp=num[j];
            while(j>0 && temp<num[j-1])
            {
                num[j]=num[j-1];
                j--;
            }
            num[j]=temp;
        }
    }
    public static void main(String args[])
    {
        int num[]={12,21,2,33,44};
        insertsort(num);
        for (int x = 0; x < num.length; x++)
            System.out.println(num[x]);
    }
}
