package tc;
import java.util.*;

public class TimeC 
{
    int hrs,min,sec;
    Scanner sobj = new Scanner(System.in);

    public void hours_to_minutes()
    {
        System.out.print("\nEnter Hours to convert into Minutes: ");
        hrs = sobj.nextInt();
        min = hrs * 60;
        System.out.println("Minutes = " +min);
    }

    public void minutes_to_hours()
    {
        System.out.print("\nEnter Minutes to convert into Hours: ");
        min = sobj.nextInt();
        hrs = min / 60;
        System.out.println("Hours = " +hrs);
    }

    public void hours_to_seconds()
    {
        System.out.print("\nEnter Hours to convert into Seconds: ");
        hrs = sobj.nextInt();
        sec = hrs * 3600;
        System.out.println("Minutes = " +sec);
    }

    public void seconds_to_hours()
    {
        System.out.print("\nEnter Seconds to convert into Hours: ");
        sec = sobj.nextInt();
        hrs = sec / 3600;
        System.out.println("Hours = " +hrs);
    }
}
