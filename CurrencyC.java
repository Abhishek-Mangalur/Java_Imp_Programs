package cc;
import java.util.*;

public class CurrencyC 
{
    double inr,usd,euro,yen;
    Scanner sobj = new Scanner(System.in);

    public void dollar_to_rupee()
    {
        System.out.print("\nEnter Dollars to convert into Rupees: ");
        usd = sobj.nextDouble();
        inr = usd * 81.83;
        System.out.println("Rupees = " +inr);
    }

    public void rupee_to_dollar()
    {
        System.out.print("\nEnter Rupees to convert into Dollars: ");
        inr = sobj.nextDouble();
        usd = inr / 81.83;
        System.out.println("Dollars = " +usd);
    }

    public void euro_to_rupee()
    {
        System.out.print("\nEnter Euros to convert into Rupees: ");
        euro = sobj.nextDouble();
        inr = euro * 79.06;
        System.out.println("Rupees = " +inr);
    }

    public void rupee_to_euro()
    {
        System.out.print("\nEnter Rupees to convert into Euros: ");
        inr = sobj.nextDouble();
        euro = inr / 79.06;
        System.out.println("Euros = " +euro);
    }

    public void yen_to_rupee()
    {
        System.out.print("\nEnter Yens to convert into Rupees: ");
        yen = sobj.nextDouble();
        inr = yen * 0.57;
        System.out.println("Rupees = " +inr);
    }

    public void rupee_to_yen()
    {
        System.out.print("\nEnter Rupees to convert into Yens: ");
        inr = sobj.nextDouble();
        yen = inr / 0.57;
        System.out.println("Yens = " +yen);
    }
}
