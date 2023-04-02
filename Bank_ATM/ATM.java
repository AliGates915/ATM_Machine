package Bank_ATM;

import java.util.Scanner;

public class ATM
{
    private double balance;
    private double deposit;
    private double withdraw;
    public String pin;
    Scanner sc= new Scanner(System.in);
    public ATM()
    {
        String first_Name;
        String last_Name;
        System.out.print("Enter First_Name : ");
        first_Name = sc.nextLine();
        System.out.print("Enter Last_Name : ");
        last_Name = sc.nextLine();
    }
    public String get_firstname(String first_name)
    {
        return first_name;
    }
    public String get_pin()
    {
        return pin;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void setDeposit(double deposit)
    {
        this.deposit = deposit;
    }
    public void setWithdraw(double withdraw)
    {
        this.withdraw = withdraw;
    }
    public double getBalance()
    {
        return balance;
    }
    public double getDeposit()
    {
        return deposit;
    }
    public double getWithdraw()
    {
        return withdraw;
    }
}