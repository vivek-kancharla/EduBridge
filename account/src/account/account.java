package account;

public class account
{
float amount;
public void deposit(float amt)
{
	amount=amount+amt;
}
public void withdrawl(float amt)
{
	amount=amount-amt;
}
public float bal()
{
	return amount;
}
public static void main(String[] args)
{
	account account;
	account=new account();
	System.out.println(account.bal());
	account.deposit(80000);
	System.out.println(account.bal());
	account.withdrawl(10000);
	System.out.println(account.bal());
}
}
