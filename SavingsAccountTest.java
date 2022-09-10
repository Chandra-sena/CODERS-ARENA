public class SavingsAccountTest {
    public static void main(String args[]) {
        SavingsAccount saver1 = new SavingsAccount(0.04,2000);
        SavingsAccount saver2 = new SavingsAccount(0.04,3000);
       // saver1.SavingsAccount(0.04,2000);
       // saver2.SavingsAccount(0.04,3000);
        saver1.modifyInterestRate(0.05);
        saver1.calcMonthlyInterest();
        saver2.modifyInterestRate(0.05);
        saver2.calcMonthlyInterest();
    }
}