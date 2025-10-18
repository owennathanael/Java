package Q3;

import Q2.SavingsAccount;

public class Q3Driver
{
    public static void main()
    {
        BankCustomer acc1=new BankCustomer("james","12_test_ave");
        BankCustomer acc2=new BankCustomer("joker","11_test_ave");
        SavingsAccount savingAccount1= new SavingsAccount(1000.0);
        SavingsAccount savingsAccount2= new SavingsAccount(2020.0);
        SavingsAccount savingsAccount3= new SavingsAccount(3030.0);
        SavingsAccount savingsAccount4 = new SavingsAccount(4200.0);
        SavingsAccount savingAccount21= new SavingsAccount(1230.0);
        SavingsAccount savingsAccount22= new SavingsAccount(1120.0);
        SavingsAccount savingsAccount23= new SavingsAccount(3221.0);
        SavingsAccount savingsAccount24 = new SavingsAccount(3890.0);
        acc1.addAccount(savingAccount1);
        acc1.addAccount(savingsAccount2);
        acc1.addAccount(savingsAccount3);
        acc1.addAccount(savingsAccount4);
        acc2.addAccount(savingAccount21);
        acc2.addAccount(savingsAccount22);
        acc2.addAccount(savingsAccount23);
        acc2.addAccount(savingsAccount24);

            System.out.println("balance for account 1 "+acc1.name+" ,address "+acc1.address+" is: "+acc1.balance());
            System.out.println("balance for account 2 "+acc2.name+" ,address" +acc2.address+" is: "+acc2.balance());
    }
}
