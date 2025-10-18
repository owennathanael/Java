package Q2;

public class Q2Driver
{
    public static void main(String[] args)
    {
    SavingsAccount saver1 = new SavingsAccount(2000.0);
    SavingsAccount saver2 = new SavingsAccount(3000.0);
    
    SavingsAccount.annualInterest=0.04;
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();
    SavingsAccount.annualInterest=0.05;
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();
    System.out.printf("\n%.2f",saver1.savingBalance);
    System.out.printf("\n%.2f",saver2.savingBalance);
    }
    
}