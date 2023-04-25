/**
 * Palindrome
 */
import java.util.*;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter String: ");
        Scanner sobj = new Scanner(System.in);
        String str = sobj.nextLine();
        String reversestr = "";

        int strLength = str.length();

        for(int i=(strLength - 1);i>=0;i--)
            reversestr = reversestr + str.charAt(i);
        
        if(str.toLowerCase().equals(reversestr.toLowerCase()))
            System.out.println("It's a palindrome");
        else
            System.out.println("It's not a palidrome");
    }
}