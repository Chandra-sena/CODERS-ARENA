public class SavingsAccount {
    static double annualIntrestRate;
    static double savingsBalance;
    double monthlyInterest;

    SavingsAccount(double ai, double sb) {
        annualIntrestRate = ai;
        savingsBalance = sb;
    }
    public void modifyInterestRate(double ai){
        annualIntrestRate=ai;}
    public void calcMonthlyInterest() {
        System.out.println("before modification balane:" + savingsBalance);
        monthlyInterest = (savingsBalance * annualIntrestRate) / 12;
        savingsBalance = savingsBalance + monthlyInterest;
        System.out.println("After modification balane:" + savingsBalance);
    }

    
    
}