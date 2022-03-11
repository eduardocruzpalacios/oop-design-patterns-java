package structural.facade;

import java.util.ArrayList;

import structural.facade.facade.ArrayEncrypFacade;

public class Main {

	public static void main(String[] args) {

		// we have a data structure, put data in it and print it

		ArrayList<Double> arrayList = new ArrayList<Double>();

		for (int i = 0; i < 10; i++) {
			arrayList.add(Math.floor(Math.random() * 10));
		}

		System.out.println(arrayList);

		// initialize Facade
		ArrayEncrypFacade arrayEncrypFacade = new ArrayEncrypFacade();

		/*
		 * call Facade method using the data structure above and a chosen algorithm and
		 * print the result
		 */

		ArrayList<Double> arithmeticEncrypted = arrayEncrypFacade.encrypt(arrayList, "arithmetic");
		System.out.println(arithmeticEncrypted);

		ArrayList<Double> exponentialEncrypted = arrayEncrypFacade.encrypt(arrayList, "exponential");
		System.out.println(exponentialEncrypted);

	}

}
