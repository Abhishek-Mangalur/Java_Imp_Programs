package dc;
import java.util.Scanner;

public class DistanceC 
{
    double m,km,miles;
    Scanner sobj = new Scanner(System.in);

    public void km_to_m()
    {
        System.out.print("\nEnter Km to convert into Meters: ");
        km = sobj.nextDouble();
        m = km * 1000;
        System.out.println("Meters = " +m);
    }

    public void m_to_km()
    {
        System.out.print("\nEnter Meters to convert into Km: ");
        m = sobj.nextDouble();
        km = m / 1000;
        System.out.println("Km = " +km);
    }

    public void km_to_miles()
    {
        System.out.print("\nEnter Km to convert into Miles: ");
        km = sobj.nextDouble();
        miles = km * 1.6;
        System.out.println("Miles = " +miles);
    }

    public void miles_to_km()
    {
        System.out.print("\nEnter Miles to convert into Km: ");
        miles = sobj.nextDouble();
        km = miles / 1.6;
        System.out.println("Km = " +km);
    }
}