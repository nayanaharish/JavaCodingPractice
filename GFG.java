//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,51,2,5,3,45,2,3,4,5};
        int n = arr.length;
        int x = 5 ;
        ArrayList<Integer> al = find(arr,n,x);
        System.out.println(al);
    }
   public static  ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(firstOccurances(arr,x));
        al.add(lastOccurances(arr,x));

        return al;
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



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends