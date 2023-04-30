/**
 * Duplicate number detection
 */
import java.util.*;

public class Duplicate 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the no. of elements: ");
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = sobj.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i] == a[j] && (i != j))
                    System.out.println("Duplicate Element: " +a[j]);
            }
        }
    }
}