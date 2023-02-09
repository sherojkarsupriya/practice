import java.util.Scanner;
class week
{
public static void main(String args[])
{
Scanner bs=new Scanner(System.in);
System.out.println("enter a number");
int day=bs.nextInt();

if(day==1)
{
System.out.println("it is sunday");
}
else if(day==2)
{
System.out.println("it is monday");
}
else if(day==3)
{
System.out.println("it is tuesday");
}
else if(day==4)
{
System.out.println("it is wednesday");
}
else
{
System.out.println("invaild day");
}
}
}