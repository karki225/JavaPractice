import java.util.Scanner;
public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		int EMPID;
		String answer;
		System.out.println("Welcome to the vending machine");


		Scanner scan = new Scanner(System.in);
		System.out.println("Please select the following options");
		System.out.println("1.Employee  2. Guest"); //Ask the user guest or employee

		input = scan.nextInt();

		switch(input) {
		case 1: //come to this case if the user is employee
			System.out.println("Please Enter Your Employee ID from 001 to 100");
			Scanner emp = new Scanner(System.in);
			EMPID = emp.nextInt(); //ask empid as user input
			if(EMPID<=0 | EMPID>100) { //check the condition is false
				System.out.println("Error!!!!");
				System.out.println("Please Enter your Employee ID from 001 to 100");
			}

			else { //if emp id is between 1 to 100 , run this condition
				System.out.println("Enter your options");
				Scanner option = new Scanner(System.in);
				int opt = option.nextInt(); //ask for the option available in vending machine

				if(opt>=000 && opt<010) 
				{
					System.out.println("Please collect your item");
				} // if the input is between 1 to 50

				else {
					System.out.println("Error!!!!");
					System.out.println("Please Enter your input from 001 to 010");
				} // if the input is not between 1 to 50

			} //employee id correct module ending

			break;
		case 2:
			System.out.println("Please Enter the amount you want to enter");

			Scanner balance = new Scanner(System.in);
			int Total_balance = balance.nextInt(); //ask for the option available in vending machine
			System.out.println("Your total balance is"+Total_balance);
			//lets consider, price of each item is $1
			System.out.println("Choose the option from 1 to 10");
			do {
				Scanner choose = new Scanner(System.in);
				int Total_choose = balance.nextInt();
				System.out.println("You choose:"+ Total_choose);
				System.out.println("Do you wanna add another item: yes or #");
				answer = choose.next();
			} //end of choose do

			while (answer.equals("yes"));

			break; //guest case finished
		default:
			System.out.println("Please enter 1 or 2 only");
		}

	}

}
