/**
 * TryP
 */
import java.util.*;

public class TryP 
{
    void div(int a, int b)
    {
        try
        {
            int c = a/b;
            System.out.println("Result = " +c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }    
    }

    public static void main(String[] args) 
    {
        TryP obj = new TryP();
        System.out.println("Enter two no.:");
        Scanner sobj = new Scanner(System.in);
        int a = sobj.nextInt();
        int b = sobj.nextInt();
        obj.div(a, b);
    }
}