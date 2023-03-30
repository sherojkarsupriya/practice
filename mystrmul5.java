import java.util.stream.*;
class mystrmul5
 {
 public static void main(String args[])
 {
 /* for(int i=1;i<=20;i++)
{
if(i%1==0)
{
System.out.println(i*5);
}
}*/
 Stream.iterate(5,i->i+5).limit(20).filter(a->a%5==0).forEach(System.out::println);
  }
 }