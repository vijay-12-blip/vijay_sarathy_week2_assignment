package week2;

import java.util.Scanner;

import week2.Bank;
import week2.BankImpl;

class BankMainClass 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		Bank b = new BankImpl();  
		
		while(true)
		{
			System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
			int choice = sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Enter the amount to be deposited");
				double amnt = sc.nextDouble();
				b.deposit(amnt);
				b.displayBal();
				System.out.println("----------");
				break;

			case 2:
				System.out.println("Enter the amount to be withdrawn");
				double amount = sc.nextInt();
				b.withdrawal(amount);
				b.displayBal();
				System.out.println("----------");
				break;

			case 3:
				b.displayBal();
				System.out.println("----------");
				break;

			case 4:
				System.out.println("Thank you");
				System.exit(0);

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
