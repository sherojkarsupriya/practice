import java.util.Scanner;
class addMatrix
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter no of rows");
int rows=sc.nextInt();
System.out.println("enter no of columns");
int cols=sc.nextInt();

int arr[][]=new int[rows][cols];
int brr[][]=new int[rows][cols];
int res[][]=new int[rows][cols];
System.out.println("enter first array values");

for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.println("enter second array values");

for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
brr[i][j]=sc.nextInt();
}
}

for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
res[i][j]=arr[i][j]+brr[i][j];
}
}
System.out.println("addition is");
for(i=0;i<rows;i++)
{
for(j=0;j<rows;j++)
{
System.out.print(res[i][j]+"  ");
}
System.out.println();
}
}
}

