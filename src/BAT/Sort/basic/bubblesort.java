package BAT.Sort.basic;

/**
 * Created by 周杰伦 on 2017/2/28.
 */
public class bubblesort {
    public static void bubblesort(int num[]){
        int i;
        boolean flag=false;
        int temp;
        for(int j=num.length;j>1;j--)
        {
        for(i=1;i<j;i++)
        {
            if(num[i]<num[i-1])
            {
                temp=num[i];
                num[i]=num[i-1];
                num[i-1]=temp;
                flag=true;
            }

        }
            if(flag==false){
                return;
            }
        }

    }
    public static void main(String args[]){
       int num[]={21,123,22,33,11,23};
        bubblesort(num);
        for(int i=0;i<num.length;i++)
        {
           System.out.println(num[i]);
        }
    }
}
