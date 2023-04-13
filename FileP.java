/**
 * FileP
 */
import java.io.File;
import java.util.*;

public class FileP 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter file address/name end with format: ");
        Scanner sobj = new Scanner(System.in);
        String fname = sobj.nextLine();
        File f1 = new File(fname);

        System.out.println("File Name: " +f1.getName());
        f1.setWritable(true);
        System.out.println(f1.exists() ? "File exists" : "File not exists");
        System.out.println(f1.canWrite() ? "File writable" : "File not writable");
        System.out.println(f1.canRead() ? "File readable" : "File not readable");
        String filename = f1.toString();
        int index = filename.lastIndexOf('.');
        if(index > 0)
        {
            String type = filename.substring(index+1);
            System.out.println("File Type is: " +type);
        }
        else
            System.out.println("File doesn't have any type");
        System.out.println("File Length is: " +f1.length() +" Bytes");
    }
}