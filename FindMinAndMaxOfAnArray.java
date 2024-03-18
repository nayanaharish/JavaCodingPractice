public class FindMinAndMaxOfAnArray {
    public static void main(String[] args) {

        int [] a = {2,5,1,7,9,10,3,6};
        int min = a[0];

        for (int i = 0 ; i< a.length ; i++)
        {
           if (min > a[i])
           {
               int temp = min ;
               min = a[i];
               a[i] = temp;
           }

        }
        System.out.println("min value is "+ min);
    }
}
