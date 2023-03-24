package Bank_ATM;
public class ATM
{
    private double balance;
    private double deposit;
    private double withdraw;
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