package week2;

class BankImpl implements Bank
{
	double bal = 0;
	
	@Override
	public void deposit(double amount)
	{
		System.out.println("Depositing ₹ "+amount);
		bal += amount;
		System.out.println(amount+" ₹ deposited successfully");
	}
	
	@Override
	public void withdrawal(double amount)  
	{
		System.out.println("Withdrawing ₹: "+amount);
		bal -= amount;
		System.out.println(amount+" ₹ withdrawn successfully");
	}

	@Override
	public void displayBal()
	{
		System.out.println("Available Bank Balance: "+bal+" ₹");
	} 
}
