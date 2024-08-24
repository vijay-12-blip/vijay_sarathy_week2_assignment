package week2;

import java.util.Scanner;

class Rectangle 
{
	public double length;
	public double breadth;
	
	Rectangle(double length, double breadth)  //Object Initialization using constructorto
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	static double rectArea(double length, double breadth)
	{
		return length*breadth;
	}
	
	static double rectArea(double side)  //Method Overloading
	{
		return side*side;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Rectangle:");
		double len = sc.nextDouble();
		System.out.println("Enter the breadth of the Rectangle");
		double br = sc.nextDouble();
		double area = 0;
		
		Rectangle r = new Rectangle(len,br);
		if(len == br)
		{
			area = rectArea(len);
			System.out.println("Area of the Rectangle: "+area);
		}
		
		else
		{
			area = rectArea(len,br);
			System.out.println("Area of the Rectangle: "+area);
		}
	}
}
