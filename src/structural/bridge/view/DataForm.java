package structural.bridge.view;

import java.util.Scanner;

public class DataForm {

	private static Scanner scanner;

	public static String getString(String message) {
		System.out.println(message);
		scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

}
