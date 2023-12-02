public class BankAccount {
    private String customerName;
    private String accountNum;
    private  double accountBalance;

    public BankAccount(String customerName,String accountNum,double accountBalance){
        this.customerName = customerName;
        this.accountNum = accountNum;
        this.accountBalance = accountBalance;
    }


    public void deposit(double amount){
        accountBalance+=amount;
        System.out.println("Deposit successful. New balance: "+accountBalance);
    }

    public void withdraw(double amount){
        if(amount<=accountBalance){
            accountBalance-=amount;
            System.out.println("withdraw successful. New balance: "+accountBalance);
        }
        else{
            System.out.println("withdrawal unsuccessful");
        }
    }


    public void balanceInquiry(){
        System.out.println("Account balance: "+accountBalance);
    }

    public void printInterest(double interestRate){
        InterestCalculator InterestCalculator = new InterestCalculator();
        System.out.println(InterestCalculator.interestCalculation(interestRate));
    }


    class InterestCalculator implements Interest {

        @Override
        public double interestCalculation(double interestRate) {
            accountBalance+= (accountBalance * interestRate);
            return accountBalance;
        }

    }

}

