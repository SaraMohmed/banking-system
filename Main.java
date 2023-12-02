public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("sara", "1", 3000);
        account.deposit(500);
        account.withdraw(200);
        account.balanceInquiry();
        account.printInterest(0.02);

    }
}