import java.util.Scanner;
class whileLoop
{
public static void main(String args[])
{
 int num,sum=0,rem=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no to reverse");
num=sc.nextInt();
int copynum=num;
while(num!=0)
{
 rem=num%10;
 sum=sum*10+rem;
 num=num/10;
}

 if(copynum==sum)
{
 System.out.println("given num is palindrome"+copynum);
}
 else
{
 System.out.println("given num is not palindrome"+copynum);
} 
}
}
