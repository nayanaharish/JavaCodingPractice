package sdcC601Assign1;/*
This ArrayUtils class contains different array methods .
lab1
1.min(): method to find the maximum value of an int array
2.max(): method to find the minimum  value of an int array.
3.total():method to find the sum of all elements of an int array.
4.countOdd():returns the count of odd numbers in the int array.
5.toString():format the contents of an array in a nice format.
6. reverseToString():format the contents of an array in the reverse format.
7. timesOccur():returns the count of occurrences the specified element in the array.
8.reverse():return reversed array.
9.isOdd() and isEven():check whether the number is odd or even.
9.oddValues():return only odd values of an array.
10.copyArr():create exact copy of an array.
11.copy():copy content of the source array to the destination array .
12. reduce():reduce array to the given size.
13. grow();increase array by specified size.

lab2
14.initializeArray():initialize array with any size by random numbers
15.swap():swap the given array index values
16.binarySearch():binary search algorithm implementation for double and string array.
17.selectionSort():selection sort algorithm implementation for double,String and char array.
18.insertionSort():insertion sort algorithm implementation for double,String and char array.
* */

public class ArrayUtils {



    //max value of an array
    public static int max(int[] inputArray)
    {
        int maxVal;
        maxVal = inputArray[0];
        for (int i=0;i<inputArray.length;i++)
        {
            if (inputArray[i] > maxVal  )
            {
                maxVal = inputArray[i];
            }
        }
        return maxVal;
    }

    //min value of an array
    public static int min(int[] inputArray)
    {
        int minVal;
        minVal = inputArray[0];
        for (int i=0;i<inputArray.length;i++)
        {
            if (inputArray[i] < minVal  )
            {
                minVal = inputArray[i];
            }
        }
        return minVal;
    }

    //sum of the elements
    public static int total(int[] inputArray)
    {
        int total = 0;

        for (int i=0;i<inputArray.length;i++)
        {
           total+=inputArray[i];
        }
        return total;
    }

    //count odd values of an array
    public static int countOdd(int[] inputArray)
    {
        int counterOdd = 0;
        for (int value:inputArray)
        {
            if (value % 2!=0)
            {
                counterOdd++;
            }
        }

        return counterOdd;
    }

    //format array
    public static String  toString(int[] inputArray)
    {
        String result = "[";
        int counter = 0;
        for (int strVal:inputArray )
        {
            result += strVal+", ";
            counter++;

            if (counter % 10 == 0)
            {
                result+="\n";
            }
        }
        result = result.substring(0,result.length()-2);
        result = result +"]";
        return result;

    }

//format array in reverse order
    public static String  reverseToString(int[] inputArray)
    {
        String result = "[";
        int counter = 0;
        for (int i = inputArray.length-1 ; i >= 0; i--)
        {
            result += inputArray[i]+", ";
            counter++;

            if (counter % 10 == 0)
            {
                result+="\n";
            }
        }
        result = result.substring(0,result.length()-2);
        result = result +"]";
        return result;

    }

    //return times of occurrences specified key
    public static int  timesOccur(int[] inputArray, int key)
    {
        int countTimes = 0;
        for (int value:inputArray) {
            if (value == key)
            {
                countTimes++;
            }
            
        }
        return countTimes;
    }

    //reverse the array
    public static int[] reverse(int [] inputArray)
    {
        int [] returnArr = new int[inputArray.length];
        int count = 0 ;
        for (int i = inputArray.length-1; i >=0;i--)
        {
            returnArr[count] = inputArray[i];
            count++;
        }

        return returnArr;
    }

    //odd
    public static boolean isOdd(int inputNum)
    {
        if (inputNum % 2 !=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //even
    public static boolean isEven(int inputNum)
    {
        if (inputNum % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
//return odd values
    public static int [] oddValues(int [] inputArray)
    {
        //create new array with odd numbers size
        int [] returnArr = new int[countOdd(inputArray)];

        //index for odd array
        int count = 0;
        for (int i = 0 ;i<inputArray.length;i++)
        {
            if(isOdd(inputArray[i]))
            {
                returnArr[count]=inputArray[i];
                count++;
            }
        }
        return returnArr;
    }

    //create copy of an array
    public static int[] copyArr(int [] inputArray)
    {
        int [] returnArr = new int[inputArray.length];
        int counter = 0 ;
        for (int arrVal:inputArray) {
            returnArr[counter] = arrVal;
            counter++;
                   }

        return returnArr;
    }

    //copy contents of an array
    public static boolean copy(int[] arrSrc,int [] arrDest,int sizeCpy)
    {
        int minArraySize;
        int copySize;

        //check how many elements to copy from src to dest
        if (arrSrc.length < arrDest.length)
        {
            minArraySize = arrSrc.length;
        }
        else {
            minArraySize = arrDest.length;
        }
        if (minArraySize < sizeCpy)
        {
            copySize = minArraySize;
        }
        else {
            copySize = sizeCpy;
        }


        //copy src array element(s)  to dest array
        for (int i = 0;i <copySize ; i++)
        {
            arrDest[i] = arrSrc[i];
        }

        //check copy works and return true or false
        for (int i=0;i<copySize;i++)
        {
            if(  arrDest[i]!=arrSrc[i])
            {
                return false;
            }
        }

        return true;
    }

    //create new array with reduced size from input array
    public static int[] reduce(int[] inputArray , int size)
    {
        int newSize;
        if (inputArray.length < size)
        {
            newSize = inputArray.length;
        }
        else {
            newSize = size;
        }
        int[]  returnArr = new  int[newSize];
        //invoke copy method
        copy(inputArray,returnArr,newSize);
        return returnArr;
    }
//create a new array from the input array by growing its size by specified size
    public static int[] grow(int[] inputArray , int size)
    {
        //find size of a growing array
        int newSize = inputArray.length + size;
        if (newSize <=0)
        {
            return null;
        }
        else {
            int [] returnArray = new int[newSize];

            copy(inputArray,returnArray,newSize);

            return returnArray;
        }
    }



    // random generation method to initialize an array of any size to
    //random number between 1 and 100

    public static int[] initializeArray( int[] inputArray)
    {
        for (int i = 0 ; i < inputArray.length; i++)
        {
            inputArray[i] = randomNumberGenerate(1,100);
        }

        return inputArray;
    }


    //generate random numbers
    public static int randomNumberGenerate(int lowerLimit,int upperLimit)
    {
        int randomNumber;
        randomNumber = (int) ( Math.random() * ( upperLimit - lowerLimit + 1 )+ lowerLimit);
        return randomNumber;
    }

    // swap for integer array
    public static void swap(int [] inputArray,int firstIndex,int secondIndex)
    {
        if (firstIndex >= 0 && secondIndex >= 0 && firstIndex <inputArray.length && secondIndex < inputArray.length)
        {
            int temp = inputArray[firstIndex];

            inputArray[firstIndex] = inputArray[secondIndex];

            inputArray[secondIndex] = temp;
        }


    }

    //swap for double array
    public static void swap (double [] inputArray , int firstIndex, int secondIndex)
    {
        if (firstIndex >= 0 && secondIndex >= 0 && firstIndex <inputArray.length && secondIndex < inputArray.length)
        {
            double temp = inputArray[firstIndex];

            inputArray[firstIndex] = inputArray[secondIndex];

            inputArray[secondIndex] = temp;
        }


    }
    //swap for character array
    public static void swap (char [] inputArray , int firstIndex, int secondIndex)
    {
        if (firstIndex >= 0 && secondIndex >= 0 && firstIndex <inputArray.length && secondIndex < inputArray.length)
        {
            char temp = inputArray[firstIndex];

            inputArray[firstIndex] = inputArray[secondIndex];

            inputArray[secondIndex] = temp;
        }

    }
    //swap for String array
    public static void swap (String [] inputArray , int firstIndex, int secondIndex)
    {
        if (firstIndex >= 0 && secondIndex >= 0 && firstIndex <inputArray.length && secondIndex < inputArray.length)
        {
            String temp = inputArray[firstIndex];

            inputArray[firstIndex] = inputArray[secondIndex];

            inputArray[secondIndex] = temp;
        }

    }

    //binary search

    // binary search for string array

    public static int binarySearch(String[] sortedArray , String key)
    {
        int low = 0;
        int high = sortedArray.length - 1;
        int mid;

        while(high >= low)
        {
            mid = (low + high)/2;

            if (sortedArray[mid].equals(key))
            {
                return mid;

            }
            else if (sortedArray[mid].compareTo(key) < 0) {

                low = mid + 1;
            }
            else {

                high = mid -1;
            }
        }
        return -1;
    }

    //binary search for double array
    public static int binarySearch(double[] sortedArray , double key)
    {
        int low = 0;
        int high = sortedArray.length - 1;
        int mid;

        while(high >= low)
        {
            mid = (low + high)/2;

            if (sortedArray[mid] == key)
            {
                return mid;

            }
            else if (sortedArray[mid] > key) {

                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }


    //selection sort

    //selection sort for double
    public static void  selectionSort(double [] inputArray)
    {
        int minIndex;
        double temp;
        for (int i =0 ;i < inputArray.length;i++)
        {
            minIndex = min(inputArray,i);

            swap(inputArray,minIndex,i);


        }

    }

    //selection sort for char array
    public static  void selectionSort(char [] inputArray)
    {

        int minIndex;
        char temp;

        for (int i=0; i < inputArray.length; i++)
        {
            minIndex = min(inputArray,i);

            swap(inputArray,minIndex,i);
        }

    }

    //selection sort for String array
    public static void selectionSort(String [] inputArray)
    {
        int minIndex;
        String temp;

        for (int i=0; i < inputArray.length; i++)
        {
            minIndex = min(inputArray,i);

            swap(inputArray,minIndex,i);
        }
    }

    //insertion sort for double array
    public static void insertionSort(double [] inputArray)
    {
        for (int i = 1;i< inputArray.length ; i++)
        {
            double currentVal = inputArray[i];

            int j = i -1;

            while (j >= 0 && inputArray[j] > currentVal)
            {
                inputArray[j + 1] = inputArray[j];
                j--;
            }

            inputArray[j + 1] = currentVal;

        }
    }

    //insertion sort for char array
    public static void insertionSort(char [] inputArray)
    {
        for (int i = 1;i < inputArray.length ; i++)
        {
            char currentVal = inputArray[i];

            int j = i -1;

            while (j >= 0 && inputArray[j] > currentVal)
            {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentVal;

        }
    }

    //insertion sort for String array
    public static void insertionSort(String [] inputArray)
    {

        for (int i = 1; i < inputArray.length ; i++)
        {

            String currentVal = inputArray[i];

            int j = i-1;

            while (j >= 0 && currentVal.compareToIgnoreCase(inputArray[j]) < 0 )
            {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentVal;

        }
    }


    //min value index of the given  double array
    public static int min(double[] inputArray,int start)
    {
        int minIndex = start;
        double min = inputArray[start];

        for (int i = start; i< inputArray.length;i++)
        {
            if(inputArray[i] < min)
            {
                min = inputArray[i];

                minIndex = i;
            }
        }

        return minIndex;
    }

    //min value index of the given  char array
    public static  int min(char [] inputArray ,int start)
    {
        int minindex = start;
        char min = inputArray[start];

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

    //min value index of the given  String  array
    public static  int min(String [] inputArray ,int start)
    {
        int minindex = start;
        String min = inputArray[start];

        for (int i = start ; i <inputArray.length ; i++)
        {
            if (inputArray[i].compareToIgnoreCase(min) < 0)
            {
                min = inputArray[i];

                minindex = i;
            }
        }
        return minindex;
    }
}
