class Student
{
int id;
String name;
//creating a parameter constructor
Student(int i,String n)
{
id= i;
name=n;
}
//method to display the values
void display()
{
System.out.println(id+" "+name);
}
public static void main(String arg[])
{

Student s1=new Student(02,"somu");
Student s2=new Student(04,"shivu");

s1.display();
s2.display();
}
}