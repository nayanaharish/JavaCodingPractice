package sdcC601Assign1;

public class SUmARRAY {
    public static void main(String[] args) {
        int [][] TwoD= {{ 3, 19, 22, 14, 7, 8, 9 },
            { 3, 1, 12, 4, 3, 8, 2 },
                {13, 9, 2, 8, 7, 14, 9 },
                    { 8, 27, 7, 11, 7, 5, 20 }};

    }


    public static int[] sumArrayRows(int[][] inputArray)
    {
        int [] columnSum = new int[inputArray[0].length];
        int sum =0 ;
        for (int col = 0; col < inputArray[0].length; col++ )
        {

            for (int row = 0; row < inputArray.length;row++)
            {
                sum += inputArray[row][col];
            }

            columnSum[col]=sum;
            sum = 0 ;

        }
        return  columnSum;
    }
}
