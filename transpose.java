import java.util.Scanner;
class transpose
{
public static void main(String ss[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no of rows");
int rows=sc.nextInt();
System.out.println("enter no of columns");
int cols=sc.nextInt();

int a[][]={{1,2,3},{4,5,6},{7,8,9}};
//no of rows and cols are calculates
rows=a.length;
cols=a[0].length;
//declare array t with reverse dimensions
int t[][]=new int[cols][rows];
//transpose of given matrix
for(int i=0;i<cols;i++)
{
for(int j=0;j<rows;j++)
{
//converts rows of original matrix into columns of transposed
t[i][j]=a[j][i];
}
}
System.out.println("transpose of given matrix");
for(int i=0;i<cols;i++)
{
for(int j=0;j<rows;j++)
{
System.out.print(t[i][j]+" ");
}
System.out.println();
}
}
}