package sdcC601Assign1;

public class InnerJoin {
    public static void main(String[] args) {
       int [] a = {65, 45, 8, 3, 46, 71, 10};
       int [] b ={27, 17, 8, 33, 46, 71};
       int [] c = innerJoin(a,b);
       for (int elem:c)
       {
           System.out.println(elem+"  ");
       }
       // System.out.println(innerJoin(a,b));
    }


    public static int [] innerJoin (int[] aOne, int[] aTwo)
    {

        int innerCount = 0;
       // int [] innerJoinArray = new int[0];
        for (int i=0;i<aOne.length;i++)
        {
            for (int j=0;j<aTwo.length;j++)
            {
                if (aOne[i] == aTwo[j])
                {
                    innerCount++;
                }
            }
        }
        int [] innerJoin = new int[innerCount];

        for (int i=0;i<aOne.length;i++)
        {
            for (int j=0;j<aTwo.length;j++)
            {
                if (aOne[i] == aTwo[j])
                {
                    innerJoin[innerCount-1] = aOne[i];
                    innerCount --;
                }
            }
        }



        return  innerJoin;
    }



}
