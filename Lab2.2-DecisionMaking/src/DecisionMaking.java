import java.util.Scanner;
public class DecisionMaking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String userName = input.nextLine();
		int userNumber = 0;
		
		boolean flag = false;
		while (flag == false) {
			System.out.printf("%s%s", userName, ", please enter an integer between 1 and 100: ");
			userNumber = input.nextInt();
			
			if (userNumber <= 0 || userNumber > 100) {
				System.out.printf("%s%s%s%n", "I'm sorry, ", userName, ", that number is not between 1 and 100.");
			} else {
				flag = true;
			}
		}
		
		if (userNumber % 2 == 1) {
			System.out.printf("%d is odd", userNumber);
			if (userNumber > 60) {
				System.out.print(" and over 60.");
			}
		} else {
			if (userNumber >= 26 && userNumber <= 60) {
				System.out.print("Even.");
			} else if (userNumber < 25) {
				System.out.print("Even and less than 25.");
			} else if (userNumber > 60) {
				System.out.printf("%d and Even.", userNumber);
			}
		}
		

	}

}
