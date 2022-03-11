package structural.facade.subsystem;

import java.util.ArrayList;

public class ExponentialEncryp implements ArrayEncryp {

	@Override
	public ArrayList<Double> encryp(ArrayList<Double> arrayList) {
		ArrayList<Double> arrayListEncrypted = new ArrayList<Double>();
		int exponent = 3;
		for (int i = 0; i < arrayList.size(); i++) {
			arrayListEncrypted.add(Math.pow(arrayList.get(i), exponent));
		}
		return arrayListEncrypted;
	}

}
