
//Son Ngo
//Guess-a-Number

import java.util.Scanner;

public class Lab6
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int ComputerNum, UserNum;
		String promt = "";

		ComputerNum = 0 + (int) (Math.random() * 10);
		// System.out.printf("%d\n", ComputerNum);

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

			while ((!promt.equals("YES")) && (!promt.equals("NO")) && (!(UserNum == ComputerNum)))
			{
				System.out.print("Do you want to continue (YES or NO): ");
				promt = input.next();
			}
		} while ((promt.equals("YES")) && (!(UserNum == ComputerNum)));

		if (promt.equals("NO"))
			System.out.print("Bye");
	}

}
