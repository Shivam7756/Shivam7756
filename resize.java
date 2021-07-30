package array;
import java.util.*;
public class resize {

    public static int[] rize(int[] arr , int capacity)
    {
        int temp[] = new int[capacity];
        
        for(int i = 0 ; i<arr.length ; i++)
        {
            temp[i] = arr[i];
        }
        arr = temp;//arr now points to the temp array object in the heap
        return temp;//returns new array of modified capacity
    }

    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the size of array");
       int n = in.nextInt();
       int[] a = new int[n];
       
       for(int i = 0 ; i<a.length ; i++)
       {
           int temp = in.nextInt();
           a[i] = temp;
       }

     System.out.println("Enter the capacity of new array");
     int c =  in.nextInt();

     System.out.println("capacity of original array  before = " + a.length);
     a = rize(a,c);
     System.out.println("capacity of original array now = " + a.length);
     in.close();
    }
    
}
