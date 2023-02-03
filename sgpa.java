import java.util.*;
class student{
String usn;
int marks[]=new int[5];
int credits[]=new int[5];
String name;
void input(){
System.out.println("Enter the name and usn");
Scanner sc=new Scanner(System.in);
usn=sc.nextLine();
name=sc.nextLine();
System.out.println("Enter the marks and credits of each subject\n");
for(int i=0;i<5;i++){
marks[i]=sc.nextInt();
credits[i]=sc.nextInt();
}
}
void output(){
System.out.println("Name :"+" "+name+"\nUSN :"+" "+usn);
for(int i=0;i<5;i++){
System.out.println("Marks of subject"+" "+(i+1)+" ="+marks[i]);
System.out.println("Credits of subject"+" "+(i+1)+" ="+credits[i]);
}
}
void cgpa(){
int sgpa=0;
int sum=0;
int cred[]=new int[5];
for(int i=0;i<5;i++){
if(marks[i]>=90){
cred[i]=10;
}else if(marks[i]>=80){
cred[i]=9;
}else if(marks[i]>=70){
cred[i]=8;
}else if(marks[i]>=60){
cred[i]=7;
}else if(marks[i]>=50){
cred[i]=6;
}else if(marks[i]>=35){
cred[i]=5;
}else if(marks[i]<35){
cred[i]=0;
}else {
System.out.println("Invalid marks"); 
}
sgpa=sgpa+(cred[i]*credits[i]);
sum=sum+credits[i];
}
float res=(float)sgpa/sum;
System.out.println("SGPA ="+" "+res);
}
}
class sgpa{
public static void main(String args[]){
student vb=new student();
vb.input();
vb.output();
vb.cgpa();
}
}
