package sdcC601Assign1;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int [] x ={1,2,3,4,4};

        int [] unique = removeDuplicates(x);
        System.out.println();
        for (int elem : unique) {
            System.out.print(elem + "  ");
        }

    }
    public static int[] removeDuplicates(int[] naVals)
    {
        int uniqueCount =0;
        int flag =0;
        for (int i = 0; i < naVals.length;i++)
        {
            flag = 0;

            for (int j =i-1 ; j>= 0;j--)
            {
                if (naVals[i]==naVals[j])
                {
                    flag =1;
                }


            }
            if (flag == 0) {
                System.out.println("uc "+naVals[i]);
                uniqueCount++;
            }

        }

        int [] uniqueArray = new int[uniqueCount];
        int count = 0;
        for (int i = 0; i<naVals.length;i++)
        {
            flag = 0;

            for (int j =i-1 ; j>= 0;j--)
            {
                if (naVals[i]==naVals[j])
                {
                    flag =1;
                }


            }

            if (flag == 0 && count < uniqueCount) {
                uniqueArray[count] = naVals[i];
               count ++;
            }

//            if (flag == 0)
//            {
//                uniqueArray[uniqueCount -1] =naVals[i];
//                uniqueCount -- ;
//            }
        }



        return uniqueArray;
    }
}
