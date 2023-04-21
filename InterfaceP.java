/**
 * InterfaceP
 */
import java.util.*;

interface Resume
{
    void biodata();
}

class Teacher implements Resume
{
    String name,qualification,achievements;
    float experience;
    public void biodata()
    {
        name = "Tejas";
        qualification = "M.Tech";
        achievements = "Q1 Publication";
        experience = 14.8f;

        System.out.println("\nTeacher Resume");
        System.out.println("Name: " +name);
        System.out.println("Qualification: " +qualification);
        System.out.println("Achievements: " +achievements);
        System.out.println("Experience: " +experience);
    }
}

class Student implements Resume
{
    String name,discipline;
    float res;
    public void biodata()
    {
        name = "Abhishek";
        discipline = "B.E";
        res = 9.8f;

        System.out.println("\nStudent Resume");
        System.out.println("Name: " +name);
        System.out.println("Discipline: " +discipline);
        System.out.println("Result: " +res +" cgpa");
    }
}

public class InterfaceP 
{
    public static void main(String[] args) 
    {
        Teacher obj1 = new Teacher();
        obj1.biodata();

        Student obj2 = new Student();
        obj2.biodata();
    }
}