import java.util.*;
import java.util.stream.*;
class Listadd
{
public static void main(String args[])
{
//create arraylist
ArrayList<Integer> al=new ArrayList<>();

 for(int i=1;i<=50;i++)
  al.add(i);

  List<Integer> evenal=al.stream().filter(i->i%2==0).collect(Collectors.toList());
  System.out.println(evenal);

//to store only even nos form 1-50 arraylist

//ArrayList<Integer> evenal=new ArrayList<>();
 /* for(int a:al)
{
 if(a%2==0)
  {
 evenal.add(a);
   }
   }*/
 //System.out.println(evenal);
}
}


