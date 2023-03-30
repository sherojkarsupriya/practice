import java.util.*;
import java.util.stream.*;
class listSum
{
public static void main(String args[])
{
List<Integer> ln=Arrays.asList(2,5,6,9,14,8,11);
/*int sum=0;
for(int i:ln)
{
if(i%2==0)
sum+=i;
}
System.out.println(sum);
*/

int sum=ln.stream().filter(a->a%2==0).reduce(0,(x,y)->x+y);
		System.out.println(sum);
   }
}