import java.util.Scanner;
class primeCheck
{
public static void main(String args[])
{
int temp;
boolean isPrime=true;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.");
int num=sc.nextInt();
sc.close();
for(int i=2;i<=num/2;i++)
{
 temp=num%i;
if(temp==0)
{
isPrime=false;
break;
}
}
//isPrime is true then no.is prime else not
if(isPrime)
 System.out.println(num+"is a prime no.");
else
 System.out.println(num+"is not a prime no.");
}
}
