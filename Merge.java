package sdcC601Assign1;

import static sdcC601Assign1.ArrayUtils.*;

public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 2, 7};
        int[] arr2 = {3, 8, 9, 1,5,6,90,12};
        int[] mergeArray = merge(arr1, arr2);
        for (int elem : mergeArray) {
            System.out.print(elem + "  ");
        }

    }

    public static int[] merge(int[] inArray1, int[] inArray2) {
        int[] mergeArray = new int[inArray1.length + inArray2.length];

        mergeArray = combineArray(inArray1, mergeArray, 0);
        mergeArray = combineArray(inArray2, mergeArray, inArray1.length);
        sortArray(mergeArray);
        return mergeArray;
    }

    public static int[] combineArray(int[] src, int[] dest, int startIndex) {
        int srcCount = 0;
        for (int i = startIndex; i < dest.length && srcCount < src.length; i++, srcCount++) {
            dest[i] = src[srcCount];

        }
        return dest;

    }

    public static void sortArray(int[] inputArray) {
        int minIndex;
        int temp;
        for (int i = 0; i < inputArray.length; i++) {
            minIndex = min(inputArray, i);
            swap(inputArray, minIndex, i);

        }


    }
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
}
