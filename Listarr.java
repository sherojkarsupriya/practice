import java.util.*;
class Listarr
{
public static void main(String args[])
{
List<Integer> ln=Arrays.asList(15,2,3,4,6,9,11,10);
//if we want to add more values
//ln.add(7);
System.out.println(ln);
ArrayList<Integer> al=new ArrayList<>();
 al.add(5);
 al.add(7);
 al.add(18);
//individual values
  for(int i:al)
//referance forloop using  
  System.out.println(i);
}
}