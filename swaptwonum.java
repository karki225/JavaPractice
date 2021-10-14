import java.util.Scanner;

public class swaptwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstnum = scan.nextInt();
		System.out.println("Enter second number");
		int secondnum = scan.nextInt();
		
		firstnum = secondnum;
		System.out.print("First num:"+firstnum);

	}

}
