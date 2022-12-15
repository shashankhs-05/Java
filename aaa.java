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
Account shashank=new Account("Shashank",12345,"Current",45);
System.out.println("Account holder: " + shashank.getCustomerName());
System.out.println("Account type: " + shashank.getAccountType());
shashank.deposit(45);
shashank. displayBalance();
shashank.withdrawl(78);
shashank.withdrawl(8);
shashank. displayBalance();
}}
