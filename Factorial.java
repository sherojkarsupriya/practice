import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
int i,factorial=1,num;
System.out.println("Enter the no which you need find the factorial");
Scanner sc = new Scanner(System.in);
num = sc.nextInt();
for(i=1;i<=num;i++)
{
factorial=factorial *i;
}
System.out.println("factorial of given no is "+factorial);
}
}