import cc.*;
import dc.*;
import tc.*;

public class Main 
{
    public static void main(String[] args) 
    {
        CurrencyC obj1 = new CurrencyC();
        DistanceC obj2 = new DistanceC();
        TimeC obj3 = new TimeC();

        obj1.dollar_to_rupee();
        obj1.rupee_to_dollar();

        obj1.euro_to_rupee();
        obj1.rupee_to_euro();
        
        obj1.yen_to_rupee();
        obj1.rupee_to_yen();

        obj2.km_to_m();
        obj2.m_to_km();
        
        obj2.km_to_miles();
        obj2.miles_to_km();
        
        obj3.hours_to_minutes();
        obj3.minutes_to_hours();
        
        obj3.hours_to_seconds();
        obj3.seconds_to_hours();
    }
}
