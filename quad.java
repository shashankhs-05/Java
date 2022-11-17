import java.util.Scanner;
import java.lang.Math.*;
class quad{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
double a,b,c;
System.out.println("Enter cooefficients ax^2+bx+c");
a=s.nextDouble();
b=s.nextDouble();
c=s.nextDouble();
double disc,r1,r2;
disc=b*b-(4*a*c);
if (disc>0){
r1=(-b+(Math.sqrt(disc)))/(2*a);
r2=(-b-(Math.sqrt(disc)))/(2*a); 
System.out.println("roots are real and distinct r1="+r1+" r2="+r2);}
else if(disc==0){
r1=-b/(2*a);
System.out.println("roots are real and equal,Roots = "+r1);}
else{
System.out.println("Roots are imaginary");
System.out.println("r1="+(-b)/(2*a)+"+i"+(Math.sqrt(-disc)/(2*a)));
System.out.println("r2="+(-b)/(2*a)+"-i"+(Math.sqrt(-disc)/(2*a)));
}
}}
