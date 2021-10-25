
package q2;

import java.util.Date;
import java.time.DateTimeException;

public class Account {
     private int Id;
    private double balance;
    private double AnnualInterestRate;
    private Date DateCreated  ;
    Account()
    {
    }
    Account(int Id ,double balance)
    {
        this.Id=Id;
        this.balance=balance;
    }
    void setId(int Id)
    {
        this.Id=Id;
    }
    void setBalance(double balance)
    {
        this.balance=balance;
    }
     void setAnnualInterestRate(double AnnualInterestRate)
    {
        this.AnnualInterestRate=AnnualInterestRate;
    }
    int getId()
    {
        return this.Id;
    }
     double getBalance()
    {
        return this.balance;
    }
     double getAnnualInterestRate()
    {
        return this.AnnualInterestRate;
    }
     void setDateCreated(Date DateCreated)
    {
         this.DateCreated=DateCreated;
    }
    Date getDateCreated()
    {
        return this.DateCreated;
    }
    double getManthlyInterestRate()
    {
        return ((((AnnualInterestRate/100)*balance)+balance)/12);
    }
    double Withdraw(double wd)
    {
        balance=balance-wd;
        
        return balance;
    }
     void despoit(double de)
     {
         balance+=de;
     }
     void result()
     {
         System.out.println("ID= "+this.Id);
         System.out.println("Balance = "+this.balance);
         System.out.println("   ManthlyInterestRate is "+this.getManthlyInterestRate());
         System.out.println("   Date Created is "+this.getDateCreated());
     }
    
}
