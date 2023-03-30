import java.util.*;
import java.util.stream.*;
class myupstrm
 {
 public static void main(String args[])
 {
List<String> strlist = Arrays.asList("supriya","java","","JavaScript","","Somu","python");
List<String> newlist=strlist.stream().filter(bs->!bs.isEmpty()).collect(Collectors.toList());
List<String> uppercaselist=newlist.stream().map(a->a.toUpperCase()).collect(Collectors.toList());
  System.out.println("original : "+strlist);
  System.out.println("update : "+newlist);
  System.out.println("upper case values : "+uppercaselist);
  }
 }