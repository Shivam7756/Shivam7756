package array;
import java.util.*;

public class Mergesortedarrays {//merge two sorted arrays using three pointers method
    public static int[] mergearray(int[] arr1 , int[] arr2 ,int a , int b)
    {
        int[] result = new int[a+b];
        int i = 0;//traversing arr1
        int j = 0;//traversing arr2
        int k = 0;//for the result array

        while(i<a && j<b)//traversing both the arrays
        {
            if(arr1[i]<arr2[j])//filling the result array
            {
            result[k] = arr1[i];
            i++;
            }

            else
            {
            result[k] = arr2[j];
            j++;
            }
            k++;
        }

        while(i<a)
        {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while(j<b)
        {
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int n = in.nextInt();

        System.out.println("Enter the elements of array1");
        int[] a1 = new int[n];
        for(int i = 0 ; i<a1.length ; i++)
        {
            int temp = in.nextInt();
            a1[i] = temp;
        }

        Arrays.sort(a1);

        System.out.println("Enter the size of the second array");
        int m = in.nextInt();

        System.out.println("Enter the elements of array2");
        int[] a2 = new int[m];
        for(int i = 0 ; i<a1.length ; i++)
        {
            int temp = in.nextInt();
            a2[i] = temp;
        }
        Arrays.sort(a2);

       int[] arry = mergearray(a1, a2, n, m);

       System.out.println("The elements of sorted array");
       for(int i = 0 ; i<arry.length ; i++)
       {
           System.out.print(arry[i] + " ");
       }
        in.close();
    }
    
}
