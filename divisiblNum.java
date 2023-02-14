import java.util.Scanner;
class divisiblNum //importing classes
{ 
public static void main(String supriya[]) //main driver function
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter any no");
n=sc.nextInt();
//checking if remainder is 0 or not
//when divided by 5
if(n % 5==0)
{
 //it prints, if no is divisible by 5
 System.out.println(n+"is divisible by 5");
}
 else
{
//it prints not, if no is divisible by 5
 System.out.println(n+"is not divisible by 5");
}
}
}