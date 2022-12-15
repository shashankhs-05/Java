 class Account {
   String customerName;
  int accountNumber;
  String accountType;
  double balance;

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
}

class aaa{
public static void main(String args[]){
Account shashank=new Account("Shashank",12345,"Savings",45);
System.out.println("Account holder: " + shashank.getCustomerName());
System.out.println("Account type: " + shashank.getAccountType());
}}