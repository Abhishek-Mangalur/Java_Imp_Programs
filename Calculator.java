/**
 * Calculator
 */
import java.util.*;
public class Calculator 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the operators(+,-,*,/): ");
        Scanner sobj = new Scanner(System.in);
        char op = sobj.next().charAt(0);
        System.out.println("Enter the two operands:");
        int a = sobj.nextInt();
        int b = sobj.nextInt();
        double res = 0;

        switch(op)
        {
            case '+' : res = a+b;
                break;
            case '-' : res = a-b;
                break;
            case '*' : res = a*b;
                break;
            case '/' : if(b == 0)
                        {
                            System.out.println("Cannot divide by zero");
                            System.exit(0);
                        }
                        else res = a/b;
                break;

            default: System.out.println("Invalid choice");
        }
        System.out.println("Result = " +res);
    }
}