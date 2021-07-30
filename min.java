package array;

import java.util.*;
public class min
    {
        public static int arr(int ar[])
        {
            
            if(ar == null || ar.length==0)
            throw new IllegalArgumentException("wrong data"); 

            int min = ar[0];
        for(int i = 0 ; i<ar.length ; i++)
        {
            if(ar[i]<min)
            min = ar[i];
        }
       
        return min;
        
      }
    
    public static void main(String args[])
    {
        System.out.println("Enter the size of array");
        Scanner in =  new Scanner(System.in);
        int a = in.nextInt();

        int b[] = new int[a];
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i<b.length ; i++)
        {
            int temp = in.nextInt();
            b[i] = temp;
        }  
         int m =  arr(null);

         System.out.println(m + " = minimum value");
        in.close();
    }
    
}
