class Teacher 
{
public void teach() 
{
  System.out.println("Teaching subject");
 }
}
class Student extends Teacher 
{
public void listen()
 {
  System.out.println("Listening");
 }
}
class Principal extends Teacher {
 void evaluate() {
  System.out.println("Evaluating");
 }
}
class CheckForInherit 
{
 public static void main(String argu[]) 
{
  Principal p = new Principal();
  p.evaluate();
  p.teach();
  // p.listen(); will produce an error
 }
}