import java.util.Scanner;
class leapyear
{
public static void main(String args[])
{
Scanner Scanner = new Scanner(System.in);
//enter the year as input
 System.out.println("enter a year");
 int year = Scanner.nextInt();
 boolean isLeapYear;
 
//divisible by 4 
isLeapYear=(year % 4==0);

//divisible by 4,not by 100,or divisible by 400
isLeapYear= isLeapYear &&(year % 100!=0||year%400==0);

if(isLeapYear)
{
System.out.println(year +" is a leap year");
}
else
{
System.out.println(year +"is not a leap year");
}
}
}