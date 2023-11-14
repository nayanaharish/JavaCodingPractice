/*
This program contains different array methods
1.innerJoin method -returns an array which is the equivalent of a database inner join.
2.findLargest method - returns an array contains index of the largest element of the given 2D array.
3.transpose : returns a new array by transforming row to col and col to row of the given input array.
4.merge:returns an array by merging the two input arrays.
5.removeDuplicates : returns a new array by removing the duplicate values of the given input array.
6.sumArrayRows : returns a new 1D array which contains sum of the columns of each column of the given 2D array.
7.sudokuChecker : check whether the given sudoku matrix is valid or not.

Author: Nayana Harish

* */

package sdcC601Assign1;

import static sdcC601Assign1.ArrayUtils.swap;

public class Assign1Methods {

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
        System.out.println(uniqueArrayCheck(arr1));
    }

    //inner join method
    public static int [] innerJoin (int[] aOne, int[] aTwo)
    {

        int innerCount = 0;
        //find the count of the inner join array

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
        int count = 0;

        // find inner join values
        for (int i=0;i<aOne.length;i++)
        {
            for (int j=0; j < aTwo.length; j++)
            {
                if (aOne[i] == aTwo[j] && count < innerCount)
                {
                    innerJoin[count] = aOne[i];
                    count++;
                }
            }
        }

        return  innerJoin;
    }


    //find the largest element's index

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


    //transpose array
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

    //merge array

    public static int[] merge(int[] inArray1, int[] inArray2) {

        //create new array to store merged values
        int[] mergeArray = new int[inArray1.length + inArray2.length];

        //invoke combine array
        mergeArray = combineArray(inArray1, mergeArray, 0);
        mergeArray = combineArray(inArray2, mergeArray, inArray1.length);

        //invoke sort
        sortArray(mergeArray);

        return mergeArray;
    }

    // combine array
    public static int[] combineArray(int[] src, int[] dest, int startIndex) {

        int srcCount = 0;

        for (int i = startIndex; i < dest.length && srcCount < src.length; i++, srcCount++) {

            dest[i] = src[srcCount];
        }

        return dest;

    }

    //sort array
    public static void sortArray(int[] inputArray) {
        int minIndex;
        int temp;
        for (int i = 0; i < inputArray.length; i++) {

            minIndex = min(inputArray, i);

            swap(inputArray, minIndex, i);
        }


    }
    //min value
    public static  int min(int [] inputArray ,int start)
    {
        int minindex = start;

        int min = inputArray[start];

        for (int i = start ; i <inputArray.length ; i++)
        {
            if (inputArray[i] < min)
            {
                min = inputArray[i];

                minindex = i;
            }
        }
        return minindex;
    }

    //remove duplicate values
    public static int[] removeDuplicates(int[] naVals)
    {
        int uniqueCount =0;

        int flag =0;

        for (int i = 0; i<naVals.length;i++)
        {
            flag = 0;

            for (int j =i-1 ; j >= 0; j--)
            {
                if (naVals[i]==naVals[j])
                {
                    flag =1;
                }
            }
            if (flag == 0) {

                uniqueCount++;
            }

        }

        int [] uniqueArray = new int[uniqueCount];

        int count = 0;

        for (int i = 0; i < naVals.length; i++)
        {
            flag = 0;

            for (int j =i-1 ; j >= 0;j--)
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

        }

        return uniqueArray;
    }

    // find sum of the columns
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

    //sudoku checker
    public static boolean sudokuChecker(int[][] sudokuSolution)
    {
        if (childMatrixCheck(sudokuSolution) != true && rowColumnValidCheck(sudokuSolution) != true)
        {
            return false;
        }

        return true;
    }

    // check 3x3 matrices of 9x9 matrix
    public static boolean childMatrixCheck(int[][] sudokuSolution)
    {
        int [] matrix = new int[sudokuSolution.length];

        int count =0;

        for (int row  = 0; row < sudokuSolution.length; row = row +3)
        {
            for (int col = 0 ; col < sudokuSolution.length ; col=col +3)
            {
                for (int i = row; i < row + 3; i++ ) {

                    for (int j = col; j < col + 3; j++) {

                        matrix[count] = sudokuSolution[i][j];
                        count++;
                    }
                }

                if (uniqueArrayCheck(matrix)!= true)
                {
                    return false;
                }
                count=0;
            }
        }
        return  true;
    }

    // check rows are valid
    public static boolean rowColumnValidCheck(int[][] sudokuSolution)
    {
        int [] row = new int[sudokuSolution.length];
        int [] column = new int[sudokuSolution.length];

        for (int i=0;i< sudokuSolution.length;i++)
        {
            for (int j =0 ; j < sudokuSolution.length ; j++)
            {

                row[j]=sudokuSolution[i][j];
                column[j] = sudokuSolution[j][i];

            }
            if (uniqueArrayCheck(row)!=true && uniqueArrayCheck(column) !=true)
            {
                return false;
            }

        }

        return true;
    }



    //check array contains unique values or not
    public static boolean uniqueArrayCheck(int [] inputArray)
    {
        for (int i = 0; i< inputArray.length;i++)
        {
            for (int j =i+1 ;j< inputArray.length ; j++)
            {
                if(inputArray[i] == inputArray[j])
                {
                    return false;
                }
            }
        }
        return true;
    }

}


