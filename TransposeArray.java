package sdcC601Assign1;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] inArray = {
                {2, 7, 5},
                {6, 3, 4}
        };

        for (int row = 0 ;row < inArray.length;row++)
        {
            for (int col = 0; col < inArray[row].length;col++)
            {
                System.out.print(inArray[row][col]+" ");

            }
            System.out.println();
        }
        System.out.println();
        int[][] transposeArray = transpose(inArray);
        for (int row = 0 ;row < transposeArray.length;row++)
        {
            for (int col = 0; col < transposeArray[row].length;col++)
            {
                System.out.print(transposeArray[row][col]+" ");

            }
            System.out.println();
        }

    }
    public static int[][] transpose(int[][] inArray)
    {
        int [][] transposeArray  = new int[inArray[0].length][inArray.length];

        for (int row = 0 ;row < inArray.length;row++)
        {
            for (int col = 0; col < inArray[row].length;col++)
            {
                 transposeArray [col][row] = inArray[row][col];

            }
        }
        return transposeArray;
    }
}
