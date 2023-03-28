import java.io.*;
import java.util.*;
class fileop3
{
public static void main(String arg[])
 {
 try
 {
 File f1=new File("G:aboutsupriya.txt");
//file declaration
 Scanner sc=new Scanner(System.in);
 if(f1.createNewFile());
//file creation
 {
   System.out.println("Enter data to store");
   String data=sc.nextLine();
//reading data from user
//object of filewriter to write the data to the file
   FileWriter fw=new FileWriter("G:aboutsupriya.txt");
   fw.write(data);
//writting the data
   fw.close();
//closing the filewriter
 }

}
catch(Exception e)
{
System.out.println(e);
}
}
}
