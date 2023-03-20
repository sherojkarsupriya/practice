// program for creating Thread by Using 3 differnt class;
class windowsos
{
public static void main(String args[])
{
// creating an object
   downloading d=new downloading();
   installing in=new installing();
   d.start();
  // try{d.join();d.join();}catch(Exception e){System.out.println(e);}
   in.start();
      }
    }
 class downloading extends Thread
 {
 public void run()
 {
 for(int i=0;i<=5;i++)
 System.out.println(i);
 try{
 Thread.sleep(1000);
  }
  catch(Exception e)
  {
 System.out.println(e);}
 }
}

 class installing extends Thread 
 {
 public void run()
 {
 for(int i=5;i>=0;i--)
 System.out.println(i);
 try{
 Thread.sleep(1000);
  }
  catch(Exception e)
  {
 System.out.println(e);}
 }
} 


