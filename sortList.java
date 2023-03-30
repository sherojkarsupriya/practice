import java.util.*;
import java.util.stream.*;
class sortList
{
public static void main(String args[])
{
List<Integer> ln=Arrays.asList(10,4,13,6,18,9,2);
ln.stream().sorted().forEach(System.out::println);
  }
 }