import java.util.*; 
class Account {
   String customerName;
  int accountNumber;
  String accountType;
  double balance;
	double service_charge;
   Account(String customerName, int accountNumber, String accountType, double balance) {
    this.customerName = customerName;
    this.accountNumber = accountNumber;
    this.accountType = accountType;
    this.balance = balance;
  }


 String getCustomerName() {
    return customerName;
  }


  int getAccountNumber() {
    return accountNumber;
  }


 String getAccountType() {
    return accountType;
  }


  void deposit(double amount) {
    balance += amount;
if(accountType=="Savings")
balance+=balance*0.6;
  }
 void displayBalance() {
    System.out.println("The current balance is: " + balance);
  }
 void withdrawl(double amount) {
	if(accountType=="Current"){
if(balance<50){
service_charge+=10;
System.out.println("Withdrawl not allowed.Balance below minimum");

System.out.println("The current service charge is: " + service_charge);
}else
 balance -= amount;
  }
}}

class aaa{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String name=sc.next();
String type=sc.next();
int acc=sc.nextInt();
int balance=sc.nextInt();
int op;
Account shashank=new Account(name,acc,type,balance);
System.out.println("Do you want to deposit or withdrawl");
op=sc.nextInt();
if(op==1){
System.out.println("Deposit=1\nWithdrawl=2");
int s=sc.nextInt();
if(s==1)
{
System.out.println("Enter Amount");
int mon=sc.nextInt();
shashank.deposit(mon);
}
if(s==2)
{
System.out.println("Enter Amount");
int mon=sc.nextInt();
shashank.withdrawl(mon);
}}
}

}}
