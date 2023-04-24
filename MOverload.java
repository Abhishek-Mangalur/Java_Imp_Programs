/**
 * MOverload
 */
class MOverloading
{
    int add(int a, int b)
    {
        int sum = a+b;
        return sum;
    }

    int add(int a, int b, int c)
    {
        int sum = a+b+c;
        return sum;
    }

    float add(float a, float b)
    {
        float sum = a+b;
        return sum;
    }
}

public class MOverload 
{
    public static void main(String[] args) 
    {
        MOverloading sobj = new MOverloading();
        int s1 = sobj.add(10, 20);
        int s2 = sobj.add(10, 20, 30);
        float s3 = sobj.add(2.2f, 2.2f);
        
        System.out.println("Method Overload Sum 1 = " +s1);
        System.out.println("Method Overload Sum 2 = " +s2);
        System.out.println("Method Overload Sum 3 = " +s3);
    }
}