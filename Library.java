class Library
{
public static void main(String arg[])
{
bookShell bs=new bookShell();
bs.setBook(1234,"Immortals of meluha","Amish",200);
bs.getBook();
}
}
class bookShell
{
private int bNum,bPrice;
private String bName,bAuthor;
//adding one book to bookshell
public void setBook(int bookId,String bookName,String bookAuthor,int bookPrice)
{
//print book details
 bNum=bookId;
 bName=bookName;
 bAuthor=bookAuthor;
 bPrice=bookPrice;
}
public void getBook()
{
System.out.println(bNum+"is"+bName+"which is written by"+bAuthor+"and it is Price"+ bPrice+"rs");
}
}
