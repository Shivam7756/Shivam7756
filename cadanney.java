package array;

import java.util.*;
public class cadanney{
//cadanneys algorithm for maximum sum of subarray
	public static int Maxf(int[] arr)
	{
		int currmax = arr[0];
		int maxfor =  arr[0];

		for(int i = 1 ; i<arr.length ; i++)
		{
			currmax = currmax + arr[i];//check arr[i] to subarray
                 
            if(currmax<arr[i])
            {
            	currmax = arr[i];//start new subarray at arr[i]
            }  

            if(maxfor<currmax)
            {
            	maxfor = currmax;//current sum greater than stored sum 
            }                                                                     

		} 
        
        return maxfor;

	}


	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size");
		int a = in.nextInt();
        int b[] = new int[a];

		for(int i = 0 ; i<a ; i++)
		{
			int temp = in.nextInt();
             b[i] =  temp;
		}

		int max = Maxf(b);
        System.out.println("maximum sum = " + max);
        in.close();
	}
}