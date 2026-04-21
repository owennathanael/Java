package Q2;

public class SavingsAccount
{
    int accountNumber=1;
    double monthly;
    static int currentNumber=0;
    public static double annualInterest;
    public double savingBalance;

    public SavingsAccount(double savingBalance)
    {
        this.savingBalance=savingBalance;
        accountNumber= ++currentNumber;
    }
    void calculateMonthlyInterest()
    {
        monthly=savingBalance*(annualInterest/12); 
        savingBalance=savingBalance+monthly;
    }
    static void modifyInterestRate(int newRate)
    {
        annualInterest=newRate;
    }
    int getNum()
    {
        return accountNumber;
    }
}