package week2;

import java.util.Scanner;

class Person 
{
	public static void main(String[] args) 
	{
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the person");
		name = sc.nextLine();
		System.out.println("Enter the age of the person");
		age = sc.nextInt();
		
		System.out.println("Name of the person: "+name);
		System.out.println("Age of the person: "+age);
	}
}
