import java.util.Scanner;
class leapYr1
{
public static void main(String args[])
{
// year to be checked
int year=1900;
System.out.println("enter an year");
Scanner sc=new Scanner(System.in);
year =sc.nextInt();
// divided by 4
if (((year % 4==0) && (year % 100!=0))||(year%400==0))
//if year is by 400,then it is leap year or not
 System.out.println("specified year is a leap year");
else
 System.out.println("specified year is not leap year");
}
}