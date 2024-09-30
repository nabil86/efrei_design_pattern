package templateMethod;

import java.util.Scanner;

public class Tea extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Steeping tea bag.");
	}

	@Override
	public void addCondiment() {
		System.out.println("Adding lemon.");
	}

	@Override
	public boolean customerWantsCondiments() {
		final var customerResponse = getUserInput();
		return switch (customerResponse) {
		case "yes" -> true;
		case "no" -> false;
		default -> false;
		};
	}

	private String getUserInput() {
		System.out.println("Would you like lemon with your tea (yes/no)?");
		final Scanner scanner = new Scanner(System.in);
		return scanner.nextLine().toLowerCase();
	}

}
