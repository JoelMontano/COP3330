public class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

    public void calculateMonthlyInterest(){
        double monthlyInt;
        monthlyInt = (this.savingsBalance*annualInterestRate)/12;
        this.savingsBalance = this.savingsBalance + monthlyInt; //+= wasn't working???
    }
    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }
    public SavingsAccount(double accountBalance){
        this.savingsBalance = accountBalance;
    }
    public double SavingBalance(){
        return this.savingsBalance;
    }
}

