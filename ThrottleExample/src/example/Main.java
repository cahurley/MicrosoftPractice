package example;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner( System.in );
		Throttle throttle = new Throttle();
		
		System.out.println("Please enter a number from 0 to 6: ");
		int userInput = scanner.nextInt();
		System.out.println();
		
		throttle.shift(userInput);
		if (throttle.isOn())
		{
			System.out.println(String.format("The flow is %.2f", throttle.flow()));
		}
		else
		{
			System.out.println("The flow is now off");
		}
	}

}
