class BankAccount{
    private String accountNumber;
    private double bankBanlance;
    public BankAccount(String accountNumber, double bankBanlance){
        this.accountNumber=accountNumber;
        this.bankBanlance=bankBanlance;
    }
    // Setter method to set account number
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    // getter method to get the information about the 
    public String getAccountNumber(){
        return accountNumber;
    }
    // Getter method to get the bank balance -> Setter method is not possible in this
    public double getBankBalance(){
        return bankBanlance;
    }
    // Method to deposit money
    public void depositMoney(double amount){
        if(amount>0){
            bankBanlance+=amount;
            System.out.println(amount + "Amount deposited. Current Updated balance: "+ bankBanlance);
        }else{
            System.out.println("Invalid Ammount");
        }
    }
    // Method to withdraw the cash
    public void withdarw(double amount){
        if(amount>0 && amount<=bankBanlance){
            bankBanlance -=amount;
            System.out.println(amount+ "Amount withdrawed. New bank balance:"+ bankBanlance);
        }else{
            System.out.println("Invalid amount to withdraw or Insufficient balance");
        }
    }
    public static void main(String[] args) {
        BankAccount bankAccountPerson1 = new BankAccount("SBI00012345678", 10000.0);
        // Getting acount information
        System.out.println("Account Number: "+ bankAccountPerson1.getAccountNumber());
        System.out.println("Bank Balance: "+bankAccountPerson1.getBankBalance());
        //deposit money
        bankAccountPerson1.depositMoney(1000);
        System.out.println("Updated Account Balance: "+ bankAccountPerson1.getBankBalance());
        // withdraw money
        bankAccountPerson1.withdarw(2000);
        System.out.println("Money after withdrawl: "+ bankAccountPerson1.getBankBalance());
    }
}