public class ReverseAnArray {
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6,7,8,9};

        int [] b = new int[a.length];

        int j= 0 ;
        for (int i=a.length-1 ; i >= 0 ; i--)
        {
         //   System.out.print(a[i]+" ");
            b[j] = a[i];
            j++;
        }
        System.out.println("Reverse array");
        for (int n : b)
        {

            System.out.print(n+" ");
        }
    }
}
