import java.util.Scanner;
class evenNum
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int num=sc.nextInt();
if(num%2==0)
{
System.out.println(num+"is even no");
}
else
{
System.out.println(num+"is odd no");
}
}
}