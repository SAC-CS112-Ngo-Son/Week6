
//Son Ngo
//Guess-a-Number

import java.util.Scanner;

public class Lab5
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int count = 1, ComputerNum, UserNum;

		ComputerNum = 0 + (int) (Math.random() * 10);
		//System.out.printf("%d\n", ComputerNum);

		do
		{
			System.out.print("Please enter a number: ");
			UserNum = input.nextInt();
			
			if (UserNum > ComputerNum)
				System.out.print("Your number is too big\n");
			else if (UserNum == ComputerNum)
				System.out.print("Your number is correct\n");
			else
				System.out.print("Your number is too small\n");
			
			count += 1;	
		}
		while ((count < 4) && (!(UserNum == ComputerNum)));
		
		if ((count == 4) && (!(UserNum == ComputerNum)))
			System.out.print("You've lost");
	}

}
