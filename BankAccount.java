class BankAccount{
    private String accountNumber;
    private double balance;


    public String getAccountNumber(){
        return accountNumber;

    }
    public void setAccountNumber(String account){
        this.accountNumber=account;

    }
    public double getBalance(){
        return balance;

    }
    public void setBalance(double number){
        this.balance=number;

    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("43556543534");
        account.setBalance(1000000.50);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}
