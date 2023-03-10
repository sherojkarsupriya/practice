import java.util.Scanner;
import java.util.regex.*;
class loginuser
{
 public static void main(String args[])
 {
 Scanner ss =new Scanner(System.in);
 String username,pwd,mob;
 System.out.println("------------Login Page-------------");
 System.out.println("Enter username : ");
 username=ss.nextLine();
 System.out.println("Enter Password : ");
 pwd=ss.nextLine();
 System.out.println("Enter Moblie number : ");
 mob=ss.nextLine();

 if(Pattern.matches("[a-zA-Z@]{4,}",username)) //checking for username
 {
  if(Pattern.matches("[a-zA-Z0-9]{6,}",pwd)) //checking for password
   {
    if(Pattern.matches("[0-9]{10}",mob)) //checking for moblie number
   {
     if(pwd.equals("123456789"))
     {
    System.out.println("Login Success");
   }
 
 else
 {
    System.out.println("Wrong password");
  }
 }
  else
 {
    System.out.println("moblie number is not vaild"); 
     }
    }
  else
 {
    System.out.println("Password is not valid");
    }
   }
  else
 {
    System.out.println("username is not vaild");
  }
 }
}