import java.util.Scanner;

class bankmanagement {
	public static void main(String[] args) {
		double balance = 0, depositAmount = 0, withdrawAmount = 0;
		int choice;
		String PhoneNo = "";
		Scanner s = new Scanner(System.in);
		System.out.print("Are you a New Customer if yes(1) or no(0):");
		choice = s.nextInt();
		if (choice == 1) {
			System.out.println("We can create a new account for you");
			System.out.print("Do you want to deposit any amount if yes(1) or no(0):");
			choice = s.nextInt();
			if (choice == 1) {
				System.out.print("Enter the deposit amount: ");
				depositAmount = s.nextDouble();
				if (depositAmount >= 0) {
					balance += depositAmount;
				} else {
					System.out.println("Invalid deposit amount. Initial balance set to 0.");
				}
			} else {
				System.out.print("We have sucessfully created your account with 0 balance");
			}
		}
		do {
			System.out.println("Menu");
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Check Balance");
			System.out.println("4. Check Your Phone no.");
			System.out.println("5. Change Your Phone no.");
			System.out.println("6. Exit");
			System.out.print("Enter your choice :");
			choice = s.nextInt();
			switch (choice) {
				case 1:
					System.out.print("Enter the amount you want to deposit :");
					depositAmount = s.nextDouble();
					balance += depositAmount;
					break;
				case 2:
					System.out.print("Enter the amount you want to Withdraw :");
					withdrawAmount = s.nextDouble();
					if (withdrawAmount > balance) {
						System.out.println("Insufficient funds! Your balance is: " + balance);
					} else if (withdrawAmount > 0) {
						balance -= withdrawAmount;
						System.out.println("Withdrawal successful! Remaining Balance: " + balance);
					} else {
						System.out.println("Invalid withdrawal amount.");
					}
					break;
				case 3:
					System.out.println("Your Balance is : " + balance);
					break;
				case 4:
					if (PhoneNo == "")
						System.out.println("There is no Registered Phone no.");
					else
						System.out.println("Your Phone no is : " + PhoneNo);
					break;
				case 5:
					System.out.print("Enter your new phone number: ");
					PhoneNo = s.next();
					System.out.println("Phone number updated successfully!");
					break;
				case 6:
					System.out.println("Exit");
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}

		} while (choice != 6);

		s.close();

	}

}
