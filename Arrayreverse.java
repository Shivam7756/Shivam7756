package array;
import java.util.*;
public class Arrayreverse {

    public static int[] reves(int[] arr)
    {
         int start = 0;//pointer for first element
         int end = arr.length - 1;//pointer for second element

         while(start < end)
         {
             int t2 = arr[start];
             arr[start] = arr[end];
             arr[end] = t2;
             start++;
             end--;
         }
         return arr;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i<a.length ; i++)
        {
            int temp = in.nextInt();
            a[i] = temp;       
        }
      
        reves(a);
       
        System.out.println("reversed array");
        for(int i = 0 ; i<a.length ; i++)
        {
            System.out.print(a[i] + " ");       
        }
       in.close();
    }
    
}
