package structural.facade.subsystem;

import java.util.ArrayList;

public class ArithmeticEncryp implements ArrayEncryp {

	@Override
	public ArrayList<Double> encryp(ArrayList<Double> arrayList) {
		ArrayList<Double> arrayListEncrypted = new ArrayList<Double>();
		int multiplier = 8;
		for (int i = 0; i < arrayList.size(); i++) {
			arrayListEncrypted.add(arrayList.get(i) * multiplier);
		}
		return arrayListEncrypted;
	}

}
