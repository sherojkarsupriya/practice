import java.util.Scanner;
class subMatrix
{
public static void main(String ss[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no of rows");
int rows=sc.nextInt();
System.out.println("enter no of columns");
int cols=sc.nextInt();

int a[][]={{4,5,6},{3,4,1},{1,2,3}};
int b[][]={{2,0,3},{2,3,1},{1,1,1}};
//calculate no of rows and cols present in given matrix
rows=a.length;
cols=a[0].length;
//array res hold the result
int res[][]=new int[rows][cols];
//subtraction of matrices a and b,store the result in matrix res
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)java 
{
res[i][j]=a[i][j]-b[i][j];
}
}
System.out.println("subtraction of two matrices");
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
System.out.print(res[i][j]+"  ");
}
System.out.println();
}
}
}
