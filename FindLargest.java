package sdcC601Assign1;

public class FindLargest {
    public static void main(String[] args) {
        double[][] arrOne = {
                { 65.7, 45.0, 8.2, 3.0 },
                { 53.0, 38.3, 18.0, 13.1 },
                { 84.4, 50.8, 82.0, 23.9 },
                { 26.1, 17.1, 48.3, 39.0 },
        };

       int [] largest =findLargest(arrOne);

       for (int i:largest)
       {
           System.out.print(i+" ");
       }


    }
    public static int[] findLargest(double[][] inArray)
    {
        int [] result = new int[2];
       double largest = inArray[0][0];
       int row = 0 ,col = 0;

        for (int i=0; i< inArray.length;i++)
        {
            for (int j=0; j< inArray[i].length ; j++)
            {
               if (largest < inArray[i][j])
               {
                   largest = inArray[i][j];
                   row = i;
                   col = j;
               }
            }
        }

       result[0] = row;
       result[1] = col;
       return result;
    }
}
