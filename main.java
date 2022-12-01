import java.util.Scanner;
class Book_set{
String name,author;
double price;
int num_pages;
Book_set(String name,String author,double price,int num_pages){
this.name=name;
this.author=author;
this.price=price;
this.num_pages=num_pages;
}
String Book_getname()
{
return name;
}
String Book_getauthor()
{
return author;
}
double Book_getprice()
{
return price;
}
int Book_getpage()
{
return num_pages;
}
}
class main{
public static void main(String args[]){
int page;
double price;
String name;
String author;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number of books:");
int n=sc.nextInt();
Book_set book[]=new Book_set[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter details:");
String c=sc.next();
String d=sc.next();
double b=sc.nextDouble();
int a=sc.nextInt();
book[i]=new Book_set(c,d,b,a);
}
for(int i=0;i<n;i++){
System.out.println("Book "+(i+1)+" details");
System.out.println(book[i].Book_getname());
System.out.println(book[i].Book_getauthor());
System.out.println(book[i].Book_getprice());
System.out.println(book[i].Book_getpage());}
}}
