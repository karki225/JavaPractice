import java.util.Scanner;

public class addtwonum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number:");
		int firstnumber = sc.nextInt();
		System.out.println("Enter your second number:");
		int secondnumber = sc.nextInt();
		int add = firstnumber +secondnumber;
		System.out.println("The sum is:"+add);

	}

}
