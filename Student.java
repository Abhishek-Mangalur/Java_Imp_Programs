/*
Student
 */
import java.util.*;
public class Student 
{
    String name,usn,branch;
    long phone;

    public void insert_student(String nm, String reg, String br, long ph)
    {
        name = nm;
        usn = reg;
        branch = br;
        phone = ph;
    }

    public void display_student()
    {
        System.out.println("=====================");
        System.out.println("Name: " +name);
        System.out.println("USN: " +usn);
        System.out.println("Branch: " +branch);
        System.out.println("Phone no.: " +phone);
        System.out.println("=====================");
    }

    public static void main(String[] args)  
    {
        System.out.print("Enter the no. of students: ");
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        Student st[] = new Student[n];

        for(int i=0;i<n;i++)
            st[i] = new Student();
        
        for(int j=0;j<n;j++)
        {
            System.out.println("Enter the name,usn,branch,phone");
            String name = sobj.next();
            String usn = sobj.next();
            String branch = sobj.next();
            long phone = sobj.nextLong();
            st[j].insert_student(name, usn, branch, phone);
        }

        for(int k=0;k<n;k++)
        {
            System.out.format("\nStudent %d details are:\n", k+1);
            st[k].display_student();
        }
    }
}