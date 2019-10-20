public class SavingsAccountTest {
    public static void main(String []args){
        SavingsAccount account1 = new SavingsAccount(2000.00);
        SavingsAccount account2 = new SavingsAccount(3000.00);
        int month = 12;
        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("Balance for Account 1:");
        for(int i = 0; i < month; i++){
            account1.calculateMonthlyInterest();
            System.out.printf("Month %d: %.2f\n", i+1, account1.SavingBalance());
        }
        System.out.println("Balance for Account 2:");
        for(int i = 0; i < month; i++){
            account2.calculateMonthlyInterest();
            System.out.printf("Month %d: %.2f\n", i+1, account2.SavingBalance());
        }
        SavingsAccount.modifyInterestRate(0.05);
        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();
        System.out.println("Next Month with Increase Interest");
        System.out.printf("Account 1: %.2f\n",account1.SavingBalance());
        System.out.printf("Account 2: %.2f\n",account2.SavingBalance());
    }
}
