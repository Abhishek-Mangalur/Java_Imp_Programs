/**
 * Quadratic
 */

import java.util.*;
public class Quadratic 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the coefficients:");
        Scanner sobj = new Scanner(System.in);
        int a = sobj.nextInt();
        int b = sobj.nextInt();
        int c = sobj.nextInt();
        double root1,root2;

        double d = b * b - 4 * a * c;
        System.out.println("Discriminant: " +d);

        if(d == 0)
        {
            System.out.println("Roots are real and equal");
            root1 = root2 = -b/(2*a);
            System.out.format("Root1 = %.2f and Root2 = %.2f\n",root1,root2);
        }
        
        else if(d > 0)
        {
            System.out.println("Roots are real and distinct");
            root1 = (-b + Math.sqrt(d))/(2*a);
            root2 = (-b - Math.sqrt(d))/(2*a);
            System.out.format("Root1 = %.2f and Root2 = %.2f\n",root1,root2);
        }

        else
        {
            double real = -b/(2*a);
            double img = Math.sqrt(-d)/(2*a);
            System.out.format("Root1 = %.2f+%.2fi\n", real, img);
            System.out.format("Root2 = %.2f-%.2fi\n", real, img);
        }
    }
}