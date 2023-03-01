class exovr extends display 
{
public static void main(String args[])
{
exovr ev=new exovr();
ev.printDetails();
}
@Override
public void printDetails()
{
super.printDetails();
System.out.println("This is exovr class");
}
}
class display
{
public void printDetails()
{
System.out.println("this is Display class");
}
}
