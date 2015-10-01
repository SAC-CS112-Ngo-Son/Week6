
//Son Ngo
//Guess-a-Number

import java.util.Scanner;

public class Lab4
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int count = 1, ComputerNum, UserNum;

		ComputerNum = 0 + (int) (Math.random() * 10);
		//System.out.printf("%d\n", ComputerNum);

		System.out.print("Please enter a number: ");
		UserNum = input.nextInt();

		while ((count < 3) && (!(UserNum == ComputerNum)))
		{
			String result = (UserNum > ComputerNum) ? "Your number is too big" : "Your number is too small";
			System.out.printf("%s\n", result);

			System.out.print("Please enter a different number: ");
			UserNum = input.nextInt();
			count += 1;	
		}
		
		if (UserNum == ComputerNum)
			System.out.print("Your number is correct");
		
		if ((count == 3) && (!(UserNum == ComputerNum)))
			System.out.print("You've lost");
	}

}
