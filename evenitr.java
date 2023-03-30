
import java.util.stream.*;
class evenitr
 {
 public static void main(String args[])
 {
/* for(int i=0;i<=100;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}*/
 Stream.iterate(1,i->i+1).limit(100).filter(a->a%2==0).forEach(System.out::println);
  }
 }