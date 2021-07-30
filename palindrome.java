package array;
import java.util.*;
public class palindrome {

    public static boolean check(String word)
    {
        char[] ch = word.toCharArray();//conver word into letters , i,e madam into (m,a,d,a,m)
        int start = 0;//for taking the first letter
        int end = word.length() - 1;//for taking the last letter

        while(start < end)
        {
            if(ch[start]!=ch[end])
            return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String args[])
     {
        Scanner in = new Scanner(System.in);   
        System.out.println("Enter the word");
        String s = in.nextLine();
        check(s);

        if(check(s))
        System.out.println(s + " is Palindrome");
        else
        System.out.println(s + " not Palindrome");
        in.close();
     }
    
}
