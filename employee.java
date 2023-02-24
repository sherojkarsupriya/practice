class employee
{
int empid;
String empName;
address adr;
employee(int eid,String ename,address ad)
{
empid=eid;
empName=ename;
adr=ad;
}
public static void main(String args[])
{
address a1=new address("Nanded","Maharashtra","India");
address a2=new address("Hyd","Telangana","India");
employee e1=new employee(20,"Devansh",a1);
employee e2=new employee(22,"Hithaksh",a2);
e1.display();
e2.display();
}
public void display()
{
System.out.println(empid+"is"+empName+"from"+adr.city);
}
}
class address
{
String city,state,country;
address(String c,String st,String co)
{
city=c;
state=st;
country=co;
}
}
