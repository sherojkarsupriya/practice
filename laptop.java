class laptop implements lenovo
{
public static void main(String args[])
{
laptop lp=new laptop();
 lp.display();
}
public void display(){
System.out.println("display from lenovo");
}
}
@FunctionalInterface
interface lenovo{
void display();
}