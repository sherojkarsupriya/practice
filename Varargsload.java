class Varargsload
{
   public static void main(String args[])
  { 
    addition (8,9,14,15,18,29,30,95);
  }
public static void addition (int...a)
{
 int sum=0;
 for (int i:a)
{
   sum+=i;
}
 System.out.println(sum);
 }
}