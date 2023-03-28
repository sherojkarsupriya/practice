import java.io.*;
import java.util.*;
class fileop2
{
public static void main(String arg[])
 {
 try
 {
 File f1=new File("G:Sample.txt");
 Scanner sc=new Scanner(f1);
 while(sc.hasNextLine())
 {
 String data=sc.nextLine();
 System.out.println(data);
 }
 }
catch(Exception e)
{
System.out.println(e);
}
}
}
