import java.util.Scanner;
class arrSmall
{
public static void main(String args[])
{
int arr[]=new int[5];int small;
Scanner sc=new Scanner(System.in);
System.out.println("enter no of elements in array");
for(int i=0;i<arr.length;i++)
{
  arr[i]=sc.nextInt();
}
small=arr[0];
for(int i=1;i<arr.length;i++)
{
 if(arr[i]<small)
{
  small=arr[i];
}
}
System.out.println("smallest element"+small);
}
}