package example;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner( System.in );
		
		System.out.println("Please enter the max number of throttle positions: ");
		int maxPositions = scanner.nextInt();
		Throttle throttle = new Throttle(maxPositions);
		
		System.out.println(String.format("Please enter a number from 0 to %d: ", maxPositions));
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
