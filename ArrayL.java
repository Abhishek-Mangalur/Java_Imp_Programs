/**
 * ArrayL
 */
import java.util.*;

public class ArrayL 
{
    ArrayList<String> list = new ArrayList<String>();
    public void display_array()
    {
        list.add("CSE");
        list.add("ISE");
        list.add("EC");
        System.out.println("Array elements are:");
        System.out.println(list);
    }

    public void append_at_end()
    {
        System.out.print("\nEnter the element append at end: ");
        Scanner sobj = new Scanner(System.in);
        String ele = sobj.nextLine();
        list.add(ele);
        System.err.println(list);
    }

    public void insert_at_pos()
    {
        System.out.println("\nEnter the position and element:");
        Scanner sobj = new Scanner(System.in);
        int pos = sobj.nextInt();
        String ele = sobj.nextLine();
        list.add(pos,ele);
        System.out.println(list);
    }

    public void search()
    {
        System.out.print("\nEnter the search element: ");
        Scanner sobj = new Scanner(System.in);
        String arele = sobj.nextLine();
        int in = list.indexOf(arele);
        if(in == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at location: " +in);
    }

    public void print()
    {
        System.out.print("\nEnter the starting character to print strings: ");
        Scanner sobj = new Scanner(System.in);
        char inputc = sobj.next().charAt(0);
        String strc = Character.toString(inputc);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).startsWith(strc))
                System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) 
    {
        ArrayL sobj = new ArrayL();
        sobj.display_array();
        sobj.append_at_end();
        sobj.insert_at_pos();
        sobj.search();
        sobj.print();
    }
}