/**
 * Constructor
 */
public class Constructor 
{
    int id;
    String name;

    Constructor()
    {
        System.out.println("This is Default Constructor");
        System.out.println("Student id: " +id +"\nStudent Name: " +name);
    }
    
    Constructor(int i, String n)
    {
        System.out.println("This is Parameterized Constructor");
        id = i;
        name = n;
        System.out.println("Student id: " +id +"\nStudent Name: " +name);
    }

    public static void main(String[] args) 
    {
        Constructor s = new Constructor();
        Constructor st = new Constructor(10, "Abhishek");
    }
}