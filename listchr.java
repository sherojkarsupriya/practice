import java.util.*;
class listchr
{
public static void main(String args[])
{
List<String> strlist = Arrays.asList("sherojkar","","java","","supriya","sonu","python");
long num=strlist.stream().filter(x->x.startsWith("s")).count();
System.out.println("the num of strings which is starting with S is "+num);
}
}