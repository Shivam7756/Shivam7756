package array;
import java.util.*;
public class movezeroes {

    public static void mozero(int[] arr , int b)
    {
         int j = 0 ;//two pointers j and i
         // j gives the zeroth elements
         //i gives the non zero elements
         for(int i = 0  ; i<b ; i++)
         {
             if(arr[i]!=0 && arr[j]==0)//used for swapping of zero and non - zero elements
             {
                 int t1 = arr[i];
                 arr[i] = arr[j];
                 arr[j] = t1;
             }
               if(arr[j]!=0)
               j++;
         }

    }


    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the size of array");
       int n = in.nextInt();
       int a[] = new int[n];
      
       System.out.println("Enter the elements of array");
       for(int i = 0 ; i<a.length ; i++)
       {
           int temp = in.nextInt();
           a[i] = temp;
       }

       mozero(a,n);
          
       System.out.println("Rearranged array");
       for(int i = 0 ; i<a.length ; i++)
       {
           System.out.print(a[i] + " ");
       }
       in.close();
    }
    
}
