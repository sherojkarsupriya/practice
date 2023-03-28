class lamda
 {
 public static void main(String...args)
  {
  // varargs
  Dell dl=()->
  {
 //lamda expression is used
  System.out.println("display from Dell");
     };
   dl.display();
         }
      }
 //functional interface contains only one method

 @FunctionalInterface
  interface Dell
   {
   void display();
  //void print1();
  }