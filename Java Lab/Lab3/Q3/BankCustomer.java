package Q3;

import Q2.SavingsAccount;

public class BankCustomer
{
    String name;
    String address;
    int accCount=0;
    SavingsAccount[] accounts = new SavingsAccount[10];

    public BankCustomer(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public boolean addAccount(SavingsAccount acc)
    {
        if(accCount<3)
        {
            accounts[accCount]=acc;
            accCount++;
            return true;
        }
        else
        {
            System.out.println("You already have 3 accounts, you cannot add another account");
            return false;
        }
    }
    public double balance()
    {
        double total = 0.0;
        for (int i = 0; i < accCount; i++)
            {
                total += accounts[i].savingBalance;
            }
        return total;
    }
}