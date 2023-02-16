import java.util.Scanner;
class calculateOp
{
public static void main(String args[])
{
int a,b,opt,add,sub,mul;
double div;
Scanner sc=new Scanner(System.in);
System.out.print("enter first no");
a=sc.nextInt();
System.out.print("enter second no");
b=sc.nextInt();
while(true)
{
 System.out.println("enter 1 for addition");
 System.out.println("enter 2 for subtraction");
 System.out.println("enter 3 for multiplication");
 System.out.println("enter 4 for division");
 System.out.println("enter 5 to exit");
 opt=sc.nextInt();
switch(opt)
 {
 case 1:
 add=a+b;
 System.out.println("result:"+add);
 break;
 case 2:
 sub=a-b;
 System.out.println("result:"+sub);
 break;
 case 3:
 mul=a*b;
 System.out.println("result:"+mul);
 break;
 case 4:
 div=(double)a/b;
 System.out.println("result:"+div);
 break;
 case 5:
 System.exit(0);
 }
}
}
}