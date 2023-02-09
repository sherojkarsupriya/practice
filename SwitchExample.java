import java.util.Scanner;
class SwitchExample
{
public static void main(String args[])
{
Scanner bs=new Scanner(System.in);
System.out.println("enter a number");
int day=bs.nextInt();
System.out.println(
switch(day)
{
case 1->"sunday";
case 2->"monday";
case 3->"tuesday";
case 4->"wednesday";   
case 5->"thuesday"; 
case 6->"friday";
case 7->"saturday"; 
default->"Invaild";
}
);
}
}
