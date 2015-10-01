
//Son Ngo
//Guess-a-Number

import java.util.Scanner;

public class Lab3b
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int ComputerNum, UserNum;

		ComputerNum = 0 + (int) (Math.random() * 10);
		//System.out.printf("%d\n", ComputerNum);

		System.out.print("Please enter a number: ");
		UserNum = input.nextInt();

		if (UserNum == ComputerNum)
			System.out.print("Your number is correct");
		else
		{
			String result = (UserNum > ComputerNum)?
				"Your number is too big" : "Your number is too small";
			System.out.printf("%s", result);					
		}
		
	}

}
