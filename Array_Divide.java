import java.util.*;
public class Array_Divide
 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Double c[] = new Double[10];
        Double d[] = new Double [10];
        double a , b;

        System.out.println("Enter the elements of first array");
           for(int counter = 0; counter < c.length ; counter++)
            {
                 a = sc.nextDouble();
                 c[counter] = a;
            }

            System.out.println("Enter the elements of second array");
           for(int counter = 0; counter < c.length ; counter ++)
            {
                 b = sc.nextDouble();
                 d[counter] = b;
            }

         System.out.printf("%4s %4s\n","index","quotient");

         for(int counter = 0; counter < c.length ; counter ++)  
          System.out.printf("%2d  %4f\n",counter,(double)c[counter]/d[counter]);
          
          sc.close();
    }
    
}
