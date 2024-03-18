import java.util.Scanner;

public class FirstAndLastOccurrencesOfX {
    public static void main(String[] args) {

        int [] x = {3,1,2,5,4,7,8,9,5,2,1,5,6,7,8,9};

        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int firstOcc = firstOccurances(x,num);
        int lastOcc = lastOccurances(x,num) ;

        System.out.println("first occurances of num"+num +"is"+firstOcc);
        System.out.println("last occurances of num"+num +"is"+lastOcc);


    }

    public static int firstOccurances(int [] inputArray , int num)
    {
        for (int i = 0 ; i < inputArray.length ; i++)
        {
            if (num == inputArray[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static int lastOccurances(int [] inputArray , int num)
    {
        for (int i = inputArray.length -1  ; i >= 0  ; i--)
        {
            if (num == inputArray[i])
            {
                return i;
            }
        }
        return -1;
    }
}
