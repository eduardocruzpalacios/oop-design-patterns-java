package structural.facade.facade;

import java.util.ArrayList;

import structural.facade.subsystem.ArithmeticEncryp;
import structural.facade.subsystem.ExponentialEncryp;

public class ArrayEncrypFacade {

	public ArrayList<Double> encrypt(ArrayList<Double> list, String algorithm) {
		switch (algorithm) {
		case "arithmetic":
			return new ArithmeticEncryp().encryp(list);
		case "exponential":
			return new ExponentialEncryp().encryp(list);
		default:
			return null;
		}
	}

}
