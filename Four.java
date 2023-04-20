/**
 * Four
 */
import java.util.*;
class staff
{
    String name,staffid;
    long phone;
    double salary;

    public void accept()
    {
        System.out.println("Enter the name,staffid,phone,salary");
        Scanner sobj = new Scanner(System.in);
        name = sobj.next();
        staffid = sobj.next();
        phone = sobj.nextLong();
        salary = sobj.nextDouble();
    }

    public void display()
    {
        System.out.println("Name: " +name);
        System.out.println("Staffid: " +staffid);
        System.out.println("Phone no.: " +phone);
        System.out.println("Salary: " +salary);
    }
}

class Teaching extends staff
{
    String domain;
    int n;

    public void accept()
    {
        super.accept();
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the domain: ");
        domain = sobj.next();
        System.out.print("Enter the no. of publications: ");
        n = sobj.nextInt();
    }

    public void display()
    {
        super.display();
        System.out.println("Domain: " +domain);
        System.out.println("No. of Publications: " +n);
    }
}

class Technical extends staff
{
    String skill;

    public void accept()
    {
        super.accept();
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the Skill: ");
        skill = sobj.next();
    }

    public void display()
    {
        super.display();
        System.out.println("Skill: " +skill);
    }
}

class Contractor extends staff
{
    String period;

    public void accept()
    {
        super.accept();
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the period: ");
        period = sobj.next();
    }

    public void display()
    {
        super.display();
        System.out.println("Period: " +period);
    }
}

public class Four 
{
    public static void main(String[] args) 
    {
        System.out.println("\nEnter the teaching staff details:");
        Teaching teaching = new Teaching();
        teaching.accept();

        System.out.println("\nEnter the technical staff details:");
        Technical technical = new Technical();
        technical.accept();

        System.out.println("\nEnter the contractor staff details:");
        Contractor contractor = new Contractor();
        contractor.accept();

        System.out.println("\nThe details of teaching staff:");
        teaching.display();

        System.out.println("\nThe details of teahnical staff:");
        technical.display();

        System.out.println("\nThe details of contractor staff:");
        contractor.display();
    }
}